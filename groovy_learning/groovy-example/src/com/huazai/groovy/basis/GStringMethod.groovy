package com.huazai.groovy.basis

def str = "hello groovy"
// 检索某个位置或范围内的字符串
println str.charAt(0)
println str.getAt(0)
println str[0]
println str[1..3]

println str.center(20, 'g')
println str.padLeft(20, 'g')
println str.padRight(20, 'g')

// 判断str是否在unicode编码中比str2大
def str2 = 'hello'
println str > str2

// 去掉相同部分的字符串
println str - str2
println str.minus(str2)

// 字符串逆向
println str.reverse()
// 字符串首字母大写
println str.capitalize()