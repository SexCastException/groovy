import com.huazai.groovy.object.Person

def person = new Person(name: 'pyh', age: 23)
//saveObject(person,System.getProperty('user.dir')+'\\person.txt')
def result = (Person) readObject(System.getProperty('user.dir') + '\\person.txt')
println "the name is ${result.name} and the age is ${result.age}"

def saveObject(def obj, String destinationPath) {
    def destinationFile = new File(destinationPath)
    if (!destinationFile.exists()) {
        destinationFile.createNewFile()
    }
    destinationFile.withObjectOutputStream {
        out ->
            out.writeObject(obj)
    }
    true
}

def readObject(String path) {
    def obj
    try {
        def file = new File(path)
        if (file == null || !file.exists()) {
            return null
        }
        file.withObjectInputStream {
            input ->
                obj = input.readObject()
        }
        return obj
    } catch (e) {
    }
}