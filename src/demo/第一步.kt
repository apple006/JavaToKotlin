package demo

fun main() {
//1.没有“;”
//
//在Kotlin语法里，代码行不需要用“;”结尾，什么都不写就好
//
//2.重要的“:”
//
//在Java里，“:”主要在运算符里出现（for/switch/三元运算符等）。
//
//在Kotlin里，“:”的地位大大提升了，它的用途非常广泛，包括：
//
//定义变量类型
//```
//var name:String="my name" //变量name为String类型
//```
    var name: String = "名称";
    println(name)
//定义参数的类型
//```
//fun getData(id:Int){ //参数id为Int类型
//
//}
//```

    fun getData(id: Int): Int {
        println(id)
        return id
    }
    getData(2)
//3.没有“new”
//
//Kotlin实例化一个对象时不需要new关键字
//```
//var list=ArrayList()
//```
    var list = ArrayList<String>()

//4.变量、常量、类型推断
//
//用var定义变量
//```
//var name:String="my name"
//```
    var myName: String = "my name"//var 定义可以变 变量
    myName = "aaa"
    println(myName)

    var a = "my name"
//    myName=1// 报错，自动推断类型
    println()
//用val定义常量（相当于final）
//```
//val TAG:String="ClassName"
//```
    val final: Int = 1;
//    final =2;//val定义常量 不可以修改 报错
//上面两个例子用:String来定义了数据类型，这个是可以省略的，Kotlin支持类型推断，
//```
//var name="my name"
//
//val TAG="ClassName"
//```
//5.空指针安全
//
//在Kotlin里，可以用“?”表示可以为空，也可以用“!!”表示不可以为空。
//
//空指针安全并不是不需要处理空指针，你需要用“?”声明某个变量是允许空指针的，例如
//```
//var num:Int?=null
//```
//声明允许为空时，不能使用类型推断，必须声明其数据类型

    //安全空指针，空指针推断
    var str: String? = null;
    println(str?.length)//空指针输出null
//    println(str!!.length)//空指针抛异常

    //多行字符串
    var mstr :String ="""
    第一行
    第二行  啊啊啊
            第三行
    """
    println(mstr)
}
