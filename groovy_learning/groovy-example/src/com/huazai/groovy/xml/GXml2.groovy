import groovy.xml.MarkupBuilder

/**
 * 生成XML格式数据
 * <languages type="current" count="3" mainstream="true">
 *     <language flavor="static" version="1.8">java</language>
 *     <language flavor="dynamic" version="6.2">groovy</language>
 *     <language flavor="dynamic" version="1.9">javaScript</language>
 * </languages>
 */
FileWriter fileWriter = new FileWriter(new File(System.getProperty('user.dir')+'\\gxml2.xml'))
def xmlBuilder = new MarkupBuilder(fileWriter)
xmlBuilder.languages(type:'current',count:3,mainstream:true) {
    language(flavor:'static',version:'1.8','java')
    language(flavor:'dynamic',version:'6.2','groovy')
    language(flavor:'dynamic',version:'1.9','javaScript')
}

fileWriter.write()
fileWriter.close()
