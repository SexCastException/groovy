import groovy.xml.XmlParser

def parser = new XmlParser()
def document = parser.parse(System.getProperty("user.dir")+'\\gxml3.xml')
document.movie.each{
    content->
        println "所有标题：${content.@title}"
        println "所有type子节点文本：${content.type.text()}"
}