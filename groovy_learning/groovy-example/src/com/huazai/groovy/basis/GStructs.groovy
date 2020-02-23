package com.huazai.groovy.basis

def x = 3.14
def result
switch (x.class) {
    case 'food':
        result = 'food'
        break
    case [1, 2, 3, 4, 'list']:
        result = 'list';
        break
    case 1..30:
        result = 'range'
        break
    case Integer:
        result = 'Integer'
        break
    case BigDecimal:
        result = 'BigDecimal'
        break
    default: result = 'default'
}
println result

/**
 * 范围遍历
 */
def sum = 0
for (i in 0..9) {
    sum += i
}
println sum

/**
 * list遍历
 */
sum = 0
for (i in [1, 2, 3, 4, 5]) {
    sum += i
}
println sum

/**
 * map遍历
 */
sum = 0
for (i in ['lili': 1, 'luck': 2, 'xiaoming': 3]) {
    println sum += i.value
}
println sum

