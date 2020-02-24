import com.huazai.groovy.object.Person
import groovy.json.JsonOutput
import groovy.json.JsonSlurper

def list = [new Person(name: 'pyh', age: 23), new Person(name: 'huazai', age: 35)]
def json = JsonOutput.toJson(list)
println json
// 格式化json字符串
println JsonOutput.prettyPrint(json)

// json字符串转对象
def jsonSlurper = new JsonSlurper()
println jsonSlurper.parseText(json)

def getNetworkData(String url) {
    return new JsonSlurper().parse(new URL(url))
}
