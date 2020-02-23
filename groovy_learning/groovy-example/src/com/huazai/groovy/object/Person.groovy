package com.huazai.groovy.object

/**
 * groovy类、属性和方法默认都是public
 */
class Person implements Action, DefaultAction {
    def name
    def age

    public static void main(String[] args) {
        def person = new Person(name: 'pyh', age: 23)
        println "the name is ${person.name} and the age is ${person.age}"
        println "the name is ${person.getName()} and the age is ${person.getAge()}"
    }

    @Override
    void eat() {

    }

    @Override
    void drink() {

    }

    @Override
    void play() {

    }

    @Override
    void test1() {

    }
}
