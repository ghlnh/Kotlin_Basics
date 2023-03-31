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

}
