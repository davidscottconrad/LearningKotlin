fun president(){
    val bigDataDump= "George Washington,\tFeb 22 1732,\tWestmoreland Co. Va.,\tDec 14 1799,\tMount Vernon Va.\n" +
            "John Adams,\tOct 30 1735,\tQuincy Mass.,\tJuly 4 1826,\tQuincy Mass.\n" +
            "Thomas Jefferson,\tApr 13 1743,\tAlbemarle Co. Va.,\tJuly 4 1826,\tAlbemarle Co. Va.\n" +
            "James Madison,\tMar 16 1751,\tPort Conway Va.,\tJune 28 1836,\tOrange Co. Va.\n" +
            "James Monroe,\tApr 28 1758,\tWestmoreland Co. Va.,\tJuly 4 1831,\tNew York New York\n" +
            "John Quincy Adams,\tJuly 11 1767,\tQuincy Mass.,\tFeb 23 1848,\tWashington D.C.\n" +
            "Andrew Jackson,\tMar 15 1767,\tLancaster Co. S.C.,\tJune 8 1845,\tNashville Tennessee\n" +
            "Martin Van Buren,\tDec 5 1782,\tKinderhook New York,\tJuly 24 1862,\tKinderhook New York\n" +
            "William Henry Harrison,\tFeb 9 1773,\tCharles City Co. Va.,\tApr 4 1841,\tWashington D.C.\n" +
            "John Tyler,\tMar 29 1790,\tCharles City Co. Va.,\tJan 18 1862,\tRichmond Va.\n" +
            "James K. Polk,\tNov 2 1795,\tMecklenburg Co. N.C.,\tJune 15 1849,\tNashville Tennessee\n" +
            "Zachary Taylor,\tNov 24 1784,\tOrange County Va.,\tJuly 9 1850,\tWashington D.C\n" +
            "Millard Fillmore,\tJan 7 1800,\tCayuga Co. New York,\tMar 8 1874,\tBuffalo New York\n" +
            "Franklin Pierce,\tNov 23 1804,\tHillsborough N.H.,\tOct 8 1869,\tConcord New Hamp.\n" +
            "James Buchanan,\tApr 23 1791,\tCove Gap Pa.,\tJune 1 1868,\tLancaster Pa.\n" +
            "Abraham Lincoln,\tFeb 12 1809,\tLaRue Co. Kentucky,\tApr 15 1865,\tWashington D.C.\n" +
            "Andrew Johnson,\tDec 29 1808,\tRaleigh North Carolina,\tJuly 31 1875,\tElizabethton Tenn.\n" +
            "Ulysses S. Grant,\tApr 27 1822,\tPoint Pleasant Ohio,\tJuly 23 1885,\tWilton New York\n" +
            "Rutherford B. Hayes,\tOct 4 1822,\tDelaware Ohio,\tJan 17 1893,\tFremont Ohio\n" +
            "James A. Garfield,\tNov 19 1831,\tCuyahoga Co. Ohio,\tSep 19 1881,\tElberon New Jersey\n" +
            "Chester Arthur,\tOct 5 1829,\tFairfield Vermont,\tNov 18 1886,\tNew York New York\n" +
            "Grover Cleveland,\tMar 18 1837,\tCaldwell New Jersey,\tJune 24 1908,\tPrinceton New Jersey\n" +
            "Benjamin Harrison,\tAug 20 1833,\tNorth Bend Ohio,\tMar 13 1901,\tIndianapolis Indiana\n" +
            "William McKinley,\tJan 29 1843,\tNiles Ohio,\tSep 14 1901,\tBuffalo New York\n" +
            "Theodore Roosevelt,\tOct 27 1858,\tNew York New York,\tJan 6 1919,\tOyster Bay New York\n" +
            "William Howard Taft,\tSep 15 1857,\tCincinnati Ohio,\tMar 8 1930,\tWashington D.C.\n" +
            "Woodrow Wilson,\tDec 28 1856,\tStaunton Virginia,\tFeb 3 1924,\tWashington D.C.\n" +
            "Warren G. Harding,\tNov 2 1865,\tMorrow County Ohio,\tAug 2 1923,\tSan Francisco Cal.\n" +
            "Calvin Coolidge,\tJuly 4 1872,\tPlymouth Vermont,\tJan 5 1933,\tNorthampton Mass.\n" +
            "Herbert Hoover,\tAug 10 1874,\tWest Branch Iowa,\tOct 20 1964,\tNew York New York\n" +
            "Franklin Roosevelt,\tJan 30 1882,\tHyde Park New York,\tApr 12 1945,\tWarm Springs Georgia\n" +
            "Harry S. Truman,\tMay 8 1884,\tLamar Missouri,\tDec 26 1972,\tKansas City Missouri\n" +
            "Dwight Eisenhower,\tOct 14 1890,\tDenison Texas,\tMar 28 1969,\tWashington D.C.\n" +
            "John F. Kennedy,\tMay 29 1917,\tBrookline Mass.,\tNov 22 1963,\tDallas Texas\n" +
            "Lyndon B. Johnson,\tAug 27 1908,\tGillespie Co. Texas,\tJan 22 1973,\tGillespie Co. Texas\n" +
            "Richard Nixon,\tJan 9 1913,\tYorba Linda Cal.,\tApr 22 1994,\tNew York New York\n" +
            "Gerald Ford,\tJuly 14 1913,\tOmaha Nebraska,\tDec 26 2006,\tRancho Mirage Cal.\n" +
            "Jimmy Carter,\tOct 1 1924,\tPlains Georgia,\t,\t\n" +
            "Ronald Reagan,\tFeb 6 1911,\tTampico Illinois,\tJune 5 2004,\tLos Angeles Cal.\n" +
            "George Bush,\tJune 12 1924,\tMilton Mass.,\t,\t\n" +
            "Bill Clinton,\tAug 19 1946,\tHope Arkansas,\t,\t\n" +
            "George W. Bush,\tJuly 6 1946,\tNew Haven Conn.,\t,\t\n" +
            "Barack Obama,\tAug 4 1961,\tHonolulu Hawaii,\t,"
    val lineList = bigDataDump.split(",")
    println(bigDataDump)
    val chunks = bigDataDump.chunked(4)
    println(chunks)
    /*var i = 0
    var x = 0
    var b = 0;

    //println(bigDataDump)
    //for()
    var listOfInformationPresidents = Array<String?>(10000) { "" }

    println(x)
    println(i)
    var charToStringPresident: String
    //listOfInformationPresidents = arrayOf("Hello")
    //println(listOfInformationPresidents[0])
    x += i
    for(i in bigDataDump.indices){

        println("___________________")
        println("indicies: $i")
        println("___________________")

        if(bigDataDump[i].equals("\t"))
            break
        charToStringPresident = bigDataDump[i].toString()
        println("char to string is $charToStringPresident")
        if(i == 0) {
            listOfInformationPresidents[i] = charToStringPresident
            println("inside if, listofiformation i : ")
            print(listOfInformationPresidents[i])
            println("end if")
        }
        else {
            b = i-1
            println("inside else")
            println(x)
            println("jjjjjjjjjjj")

            //if(listOfInformationPresidents[i].equals(""))
            listOfInformationPresidents[x] = listOfInformationPresidents[x] + charToStringPresident
            println("xxxxxxxxxxxxxxxxxxxxxx")
            println(listOfInformationPresidents[x])
            println("xxxxxxxxxxxxxxxxxxxxxx")
        }
        x++
    }*/
    /*for(g in listOfInformationPresidents){
        println(g)
        println()
    }*/
}


