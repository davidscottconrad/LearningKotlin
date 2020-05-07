fun evens(x: Int){
    var b: Int
    for(i in 1..x)
    {
        b = i % 2
        if(b == 0)
            print(i)
        //println("x: $x")
        //println("i: $i")
        //println("b: $b")
    }
}