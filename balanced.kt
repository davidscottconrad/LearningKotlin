fun balanced(a: String){
    //val a = "xxxxyyy"
    var x: Char
    var i: Int = 0
    var g: Int = 0
    for(c in a) {
        //println(i)
        x = c
        //println(x)
        //println(c)
        if(c == 'x')
            i++
        if(c == 'y')
            g++
    }
    println(i)
    println(g)

    if(i == g)
        println("$a has the Same number of x and y")
    else
        print("different")


}