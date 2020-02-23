package com.huazai.groovy.basis

class Student {
    String name
    def pretty = { "My name is ${name}" }

    @Override
    String toString() {
        return pretty.call()
    }
}

class Teacher {
    String name1
}

Student student = new Student(name: "mingming")
Teacher teacher = new Teacher(name1: "honghong")
student.pretty.delegate = teacher
// 改变委托策略
// DELEGATE_ONLY：表示仅从delegate中查找对应属性，查找不到则抛出异常
student.pretty.resolveStrategy = groovy.lang.Closure.DELEGATE_ONLY
// DELEGATE_FIRST：表示先从delegate中查找对应属性，查找不到对应则从owner中查找
student.pretty.resolveStrategy = groovy.lang.Closure.DELEGATE_FIRST
println student.toString()