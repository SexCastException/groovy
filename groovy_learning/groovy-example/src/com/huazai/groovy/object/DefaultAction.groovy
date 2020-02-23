package com.huazai.groovy.object

/**
 * 抽象类和接口的结合体
 */
trait DefaultAction {
    abstract void test1()

    void test2() {
        println 'test2'
    }
}