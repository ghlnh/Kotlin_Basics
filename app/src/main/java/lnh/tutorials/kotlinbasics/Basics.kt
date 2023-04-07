package lnh.tutorials.kotlinbasics

//fun은 함수를 의미
fun main() {    //main이 앱의 시작점이여서 플레이버튼이 main에만 있음
    val name = "LNH"
    //type int 32bit
    //타입 추론으로 값의 내용으로 타입을 밝혀 냄
    var myAge = 31
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_812_309_487_120_3

    //Floating Point number Type:Float (32bit), Double(64bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.145924565165486334545231321354654513213546462

    //Boolean he type Boolean is used to represent logical values.
    //It can have two possible values true and false.

    var isSunny: Boolean = true  //타입 지정하지 않아도 코틀린에서 자동으로 boolean으로 지정
    isSunny = false

    //Characters
    val letterChar = 'A'
    val digitChar = '1'

    //Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length -1]
    var myLength = myStr.length
    print("First character $firstCharInStr")

    print("First character $firstCharInStr and the length of myStr is ${myStr.length}")

    fun exercise() {
        var exStr:String = "Android Masterclass"
        val exFlat:Float = 13.37F
        val exDouble:Double =3.14159265358979
        var exByte:Byte = 25
        var exShort:Short = 2020
        var exInt:Long = 18881234567
        var exBoolean:Boolean = true
        var exChar:Char = 'a'
    }

    //산술 연산자 (+, -, *, /, %)
    var result = 5+3
    val a = 5.0
    val b = 3
    var resultDouble : Double
    resultDouble = a / b
    print(resultDouble)

    //비교 연산자(==, !=, <, >,<=, >=)
    val isEqual = 5==3
    println("isEqual is $isEqual")

    //스트링 인터폴레이션
    val isNotEqual = 5!=5
    println("isNotEqual is $isNotEqual")
    println("is -5less ${-5<3}")
    println("is5LowerEqual3 ${5 <=3}")
    println("is5GreaterEqual5 ${5 >=5}")

    //대입 연산자(+=, -=, *=, /=, %=)
    var myNum = 5
    myNum +=3
    myNum *=4
    println("myNum is $myNum")

    //증감 연산자(++, --)
    myNum++
    println("myNum is $myNum")
    println("myNum is ${myNum++}")  //변수가 실행 된 후에 증가
    println("myNum is ${++myNum}")  //변수가 실행 되기 전에 증가

    //if문
    var heightPerson1 = 170
    var heightPerson2 = 189

    if(heightPerson1 > heightPerson2) {
        println("use raw force")
    }else if(heightPerson1 == heightPerson2) {
        println("use raw power technique 1337")
    }else {
        println("use your technique")
    }

    val age = 17
    if(age>= 21){
        println("now you may dirnk in the US")
    }else if(age >=18){
        println("you may vote now")
    }else if(age >=16){
        println("you may drive now")
    }else{
        println("you're too young")
    }

    var name1 = "Denis"

    if(name1 == "Denis"){
        println("Welcome home denis")
    }else{
        println("Who are you?")
    }
    var isRainy = true
    if(isRainy)
        println("It's Rainy")

    //When
    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Sumnner")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month){
        in 3..5 -> println("Spring")  //..은 ~라고 보면 됨
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")  //12..2 로 하면 downTo로 보고 12,11,...2로 범위 지정
        else -> println("Invalid Season")
    }

    when(age) {
        !in 0..20 -> println("now you may dirnk in the US")
        in 18..20 -> println("you may vote now")
        16,17 -> println("you may drive now")
        else -> println("you're too young")
    }
    //Any는 다른 프로그래밍 언어에서도 객체타입으로 단순히 타입 중 아무거나 다 됨
    var x : Any = 13.37f
    when(x){
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    //while루프문
    var x = 1
    while(x <=10) {
        print("$x")
        x++
    }
    println("\nwhile loop is done")

    var y = 100
    while(y <=0) {
        print("$y")
        y -= 2
    }
    println("\nwhile loop is done")

    //정수가 아니어도 조건이 맞으면 while루프문 사용 가능
    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp >=20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

    x = 15
    do{
        print("$x")
        x++
    }while (x <= 10)
    println("\ndo while loop is done")
}
