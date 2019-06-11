package demo

//对象类
class MyObject(val  name:String){
    fun sayHello(){
        print("Hello $name")
    }
}

//创建一个对象并调用对象的方法
fun main() {
    MyObject("张三").sayHello()
}
