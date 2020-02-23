package com.huazai.groovy.basis

def findList = [-3, 9, 6, 7, -2, 1, 5]
println findList.find { it % 2 == 0 }
println findList.findAll { it % 2 == 0 }
println findList.any { it % 2 == 0 }
println findList.every { it % 2 == 0 }
println findList.min()
println findList.max()
println findList.min { Math.abs(it) }
println findList.max { Math.abs(it) }
println findList.count(5)
println findList.count { return it % 2 == 0 }
