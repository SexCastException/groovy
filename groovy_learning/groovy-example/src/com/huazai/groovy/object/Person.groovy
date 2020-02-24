package com.huazai.groovy.object

/**
 * groovy类、属性和方法默认都是public
 */
class Person implements Action, DefaultAction,Serializable {
    def name
    def age

    public static void main(String[] args) {
        def person = new Person(name: 'pyh', age: 23)
        println "the name is ${person.name} and the age is ${person.age}"
        println "the name is ${person.getName()} and the age is ${person.getAge()}"
    }

    /**
     * 方法调用不存在时，会默认调用该方法，优先级：invokeMethod < methodMissing
     * @param name
     * @param args
     * @return
     */
    Object invokeMethod(String name, Object args) {
        println "the method ${name} is not exit"
    }

    /**
     * 方法调用不存在时，会默认调用该方法，优先级：methodMissing > invokeMethod
     *
     * @param name
     * @param args
     * @return
     */
    Object methodMissing(String name, Object args) {
        println "the method ${name} is missing"
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
