def xmlSlurper = new XmlSlurper();
def result = xmlSlurper.parse(new File(System.getProperty('user.dir') + '\\gxml.xml'))

// 属性
println result.span.@style
// 文本
println result.span.servlet.text()

// 深度遍历
println result.depthFirst().findAll { it.name() == 'servlet-class' }
println result.'**'.findAll { it.name() == 'servlet-class' }
// 广度遍历
println result.span.servlet.children()[0].findAll { it.name == 'servlet' }
println result.span.servlet.'**'[0].findAll { it.name == 'servlet' }

result.each {span->
    println span
}