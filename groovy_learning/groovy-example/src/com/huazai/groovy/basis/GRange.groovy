package com.huazai.groovy.basis

def range = 1..10
println range[0]
println range[2..5]
// 起始值
println range.from
// 终止值
println range.to
println range.each { print it + ',' }
for (i in range) {
    print i + ","
}

println()
println getGrade(75)

def getGrade(Number number) {
    def result
    switch (number) {
        case 0..59:
            result = '不及格'
            break
        case 60.69:
            result = '及格'
            break
        case 70..79:
            result = '良好'
            break
        case 80.100:
            result = '优秀'
            break
        default: result = 'unknow'
    }
    result
}