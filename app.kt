
//import liby.balanced


fun main(){
    //president()
    evens(10)
    twelveDaysOfChristmas()
    balanced("xxxyyy")
    println("____________________________________________________")
    println()
    balance("xaxxaxaa")
    println("____________________________________________________")
    //balance("aaaxxx")
    //balance("aaaxxxx")
    val d = 5; val e = 4
    val c = sum(d, e)
    val f = "Hello"; val g = "world"
    println("The highest value is: "); println(maxOf(d, e))
    println(stringsum(f, g))
    println("$c")
    val items = listOf("apple", "banana", "kiwi")
    for (index in items.indices){ //Good for checking where them item is in the list
        println("item at $index is ${items[index]}")
    }
    println("2nd for loop: ")
    for (item in items){

        println("item is $item")
        println("items is $items")
    }
    println("...............................")
    var aliena = Alien("David")
    var conrada = InitOrderDemo("Conrad")
    //aliena.name = "David"
    ///var alienb = InitOrderDemo()



    //println("Name is :  ${aliena.name}")
    //var InitOrderDemo =
}
//comment
fun sum(a: Int, b: Int): Int{
    return a + b
}

fun stringsum(a: String, b: String): String{
    return a + " " + b
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b){
        return a
    } else {
        return b
    }
}


fun getStringLength(obj: Any): Int? {
    if(obj is String){
        return obj.length
    }

    return null
}
class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

class Alien(name: String){
   // var name : String = "david";
    init{
       println(name)
   }
}