package com.huazai.groovy.basis
/**
 * 字符串与闭包的使用
 */
String str = 'the 2 and 3 is 5'
// 遍历每个字符
str.each {
    s -> print s.multiply(2)
}

// 查找符合条件的第一个字符串
def result = str.find {
    s -> s.isNumber();
}
println result

// 查找符合条件的所有字符串，返回一个list集合类型
result = str.findAll {
    s -> s.isNumber();
}
println result

// 有一字符符合条件则返回true，否则返回false
result = str.any {
    s -> s.isNumber()
}
println result

// 所有字符符合条件才返回true，否则返回false
result = str.every {
    s -> s.isNumber()
}
println result

// 将每个字符经过处理后然后保存到新的list集合里
result = str.collect {
    s -> s.toUpperCase()
}
println result

