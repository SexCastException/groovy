package com.huazai.groovy.basis

int x = fab(5)
println x

x = fab2(5)
println x

x = sum(10)
println x

/**
 * 求number的阶
 * @param number
 * @return
 */
int fab(int number) {
    int result = 1;
    1.upto(number, { num -> result *= num })
    return result
}
/**
 * 求number的阶，闭包代码如果作为最后一个参数，可以放在括号外面
 * @param number
 * @return
 */
int fab2(int number) {
    int result = 1;
    1.upto(number) {
        num -> result *= num
    }
    return result
}

/**
 * 求和
 * @param number
 * @return
 */
int sum(int number) {
    int result = 1;
    number.times {
        num -> result += num
    }
    return result
}