package com.huazai.groovy.basis

def closure = { String name, def age -> println "hello ${name},my age is ${age}" }
closure.call('groovy', 24)
closure('groovy', 24)

def closure1 = { println "闭包隐式参数${it}，有了显式参数隐式参数（包括'->'）就不存在了" }
closure1('qqq')

def closure2 = { return "闭包一定有返回值，不返回值，则默认返回null" }
println closure2()

