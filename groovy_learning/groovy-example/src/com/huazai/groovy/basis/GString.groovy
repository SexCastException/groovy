package com.huazai.groovy.basis

def s = '1 line' +
        '2 line\n'
println s

def s1 = '''one line\
two line
''' + 'aa' + "bbbbb" + '''cccc\n'''
println s1

def s2 = """第一行
第二行${s}${s1}
\n"""
println s2
println s2.class

def sum = 'the sum of 2 and 3 equals ${2+3}\n'
println sum
sum = '''the sum of 2 and 3 equals ${2+3}\n'''
println sum
sum = """the sum of 2 and 3 equals ${2+3}\n"""
println sum
sum = "the sum of 2 and 3 equals ${2+3}\n";
println sum

def z1 = "aa\n"
println z1.class
def z2 = "aa${1+2}\n"
println z2.class
