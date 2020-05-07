fun balance(a: String){
    /*
    val g: Char
    val h: Char
    */
    val g = a[0]
    var h: Char = 'o'
    for(c in a){
        //println("c is $c , g is $g")
        if(c != g) {
            h = c
            //println("inside the if")
            //println("The h is $h")
        }
    }
    println("g is $g , h is $h")
    var x: Char
    var i: Int = 0
    var k: Int = 0
    for(c in a) {
        //println(i)
        x = c
        //println(x)
        //println(c)
        if(c == h)
            i++
        if(c == g)
            k++
    }
    println(i)
    println(k)

    if(i == k)
        println("$a has the Same number of $g and $h")
    else
        print("different")
}