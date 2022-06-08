import com.huazai.groovy.object.Person

// 不存在的方法调用
Person person = new Person(name: 'pyh', age: 23)
person.cry()

// 将外部注入的属性和方法等设置为全局的
ExpandoMetaClass.enableGlobally()
// 动态添加属性
Person.metaClass.sex = null
// 动态添加方法
Person.metaClass.sexUpperCase = { sex.toUpperCase() }
// 动态添加静态方法
Person.metaClass.static.createPerson = { String name, int age -> new Person(name: name, age: age, sex: 'aa') }

// 测试外部属性
person = new Person(name: 'pyh', age: 23)
println person.sex
person.sex = 'female'
println person.sex
def person1 = new Person(sex: 4444)
println person1.sex
person1.metaClass.aa = 'aa'
println person1.aa
// 报错
//println person.aa

// 测试外部方法
println person.sexUpperCase()

//　测试外部静态方法
println Person.createPerson('langzi', 23)
