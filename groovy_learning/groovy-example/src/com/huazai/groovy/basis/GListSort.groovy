package com.huazai.groovy.basis

def list = new ArrayList([-1, 20, 3, 45])
def list1 = [56, 30, -90, 18, -34]
// 排序
Comparator comparator = { a, b -> a == b ? 0 : a > b ? 1 : -1 }
Collections.sort(list, comparator)
println list

list1.sort()
println list1
list1.sort { a, b -> a == b ? 0 : Math.abs(a) > Math.abs(b) ? 1 : -1 }
println list1

// 字符串排序
def stringList = ['hi', 'java', 'css', 'groovy', 'javaScript', 'python']
stringList.sort({ it.size() })
stringList.sort({ it -> return it.size() })
println stringList