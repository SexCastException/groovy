package com.huazai.groovy.basis
/**
 * 闭包的三个重要变量：this、owner、delegate
 */
def scriptClosure = {
    println "this:" + this  // 代表闭包定义处的类
    println "owner:" + owner   // 代表闭包定义处的类或对象，默认：this
    println "delegate:" + delegate  // 代表任意对象，默认：owner
}
scriptClosure()

// 在ClosureVariable中定义了一个内部类
class Person {
    def static staticVariable = {
        println "staticVariable this:" + this
        println "staticVariable owner:" + owner
        println "staticVariable delegate:" + delegate
    }

    def static staticSay() {
        def methodClosure = {
            println "static method this:" + this
            println "static method owner:" + owner
            println "static method delegate:" + delegate
        }
        methodClosure.call()
    }

    def variable = {
        println "variable this:" + this
        println "variable owner:" + owner
        println "variable delegate:" + delegate
    }

    def say() {
        def methodClosure = {
            println "method this:" + this
            println "method owner:" + owner
            println "method delegate:" + delegate
        }
        methodClosure.call()
    }


}

println()

com.huazai.groovy.object.Person.staticVariable.call()
com.huazai.groovy.object.Person.staticSay()

println()

com.huazai.groovy.object.Person person = new com.huazai.groovy.object.Person()
person.variable()
person.say()

// 闭包嵌套
def outterClosure = {
    def innerClosure = {
        println "nestedClosure this:" + this
        println "nestedClosure owner:" + owner
        println "nestedClosure delegate:" + delegate
    }
    innerClosure.delegate = person  // 修改delegate的值，owner和this不能修改
    innerClosure.call()
}
println()
outterClosure.call()


