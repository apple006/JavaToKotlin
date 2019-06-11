package demo

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
//定义参数的类型
//```
//fun getData(id:Int){ //参数id为Int类型
//
//}
//```
//3.没有“new”
//
//Kotlin实例化一个对象时不需要new关键字
//```
//var list=ArrayList()
//```
//4.变量、常量、类型推断
//
//用var定义变量
//```
//var name:String="my name"
//```
//用val定义常量（相当于final）
//```
//val TAG:String="ClassName"
//```
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
