package com.huazai.groovy.basis

def map = new HashMap()
// 索引，key不加单引号，编译器默认把key转化为带单引号不可变字符串
def colors = [red: 'ff0000', gree: '00ff00', 'blue': '0000ff']
println colors.get('red')
println colors['red']
println colors.red

// 添加元素
colors.yello = 'ffff00'
colors.complex = [a: 1, b: 2]
println colors.toMapString()
println colors.getClass()   // class java.util.LinkedHashMap
// 表示从colors中获取key为class的值，而不是表示colors的Class对象
println colors.class

// 遍历
colors.each { color -> println "the key is ${color.key},the value is ${color.value}" }
colors.each { key, value -> println "the key is ${key},the value is ${value}" }
println()
// 带下标索引的遍历
colors.eachWithIndex { color, index -> println "the key is ${color.key},the value is ${color.value},and the index is ${index}" }
colors.eachWithIndex { key, value, index -> println "the key is ${key},the value is ${value},and the index is ${index}" }
println()

def students = [
        1: [number: '001', name: 'Bob', score: 55, sex: 'male'],
        2: [number: '002', name: 'Johnny', score: 62, sex: 'female'],
        3: [number: '003', name: 'Claire', score: 73, sex: 'female'],
        4: [number: '004', name: 'Amy', score: 66, sex: 'male']
]
println students.findAll { student -> student.value.score >= 60 }
println students.count { student -> student.value.score >= 60 && student.value.sex == 'male' }
println students.findAll { student -> student.value.score >= 60 }.collect { it.value.name }
println students.groupBy { student -> student.value.score >= 60 ? '及格' : '不及格' }
println students.sort {
    student1, student2 ->
        def score1 = student1.value.score
        def score2 = student2.value.score

        return score1 == score2 ? 0 : score1 > score2 ? 1 : -1
}
