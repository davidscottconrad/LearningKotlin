fun twelveDaysOfChristmas(){

    val ascTwo = arrayOf(
        "1 Partridge in a Pear Tree",
        "2 Turtle Doves",
        "3 French Hens",
        "4 Calling Birds",
        "5 Golden Rings",
        "6 Geese a Laying",
        "7 Swans a Swimming",
        "8 Maids a Milking",
        "9 Ladies Dancing",
        "10 Lords a Leaping",
        "11 Pipers Piping",
        "12 Drummers Drumming"
    )
    val ascThree = arrayOf(
        "first",
        "second",
        "third",
        "fourth",
        "fifth",
        "sixth",
        "seventh",
        "eighth",
        "ninth",
        "tenth",
        "eleventh",
        "twelfth"
    )
    val firstTwoLinesOne = "On the "
    val firstTwoLinesTwo= " day of Christmas\nmy true love sent to me"


    for(element in 0..11) {
        println(firstTwoLinesOne + ascThree[element] + firstTwoLinesTwo) //prints out first two lines
        if(element == 0){ //checks for first day
            println(ascTwo[0])
        }
        else if(element != 0) {//not the first day

            for (i in element downTo 0) { //iterate through the messages for each day, backwards
                if (i == 0) {
                    print("and ")
                }
                print(ascTwo[i])
                println()
            }
        }
        println()
    }

}