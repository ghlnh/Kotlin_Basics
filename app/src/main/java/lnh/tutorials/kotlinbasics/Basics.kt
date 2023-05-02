package lnh.tutorials.kotlinbasics

//fun은 함수를 의미
fun main() {    //main이 앱의 시작점이여서 플레이버튼이 main에만 있음
    myFunction()
    var result = addUp(5,3)  //a,b는 아규먼트(인수)
    print("result is $result")

    var avgResult = avg(5.3,13.37)
    print("avgResult is $avgResult")
}

//Parameter (input)
fun addUp(a: Int, b: Int) :Int {  //a,b는 파라미터(매개변수)
    //output
    return a+b
}

fun avg(a: Double, b: Double) : Double {
    return (a+b) /2

    //nullable
    //var name :String = "Denis"
//    name = null ->Compilation ERROR
    var nullableName :String? = "Denis"
    println(nullableName?.toLowerCase())  //메서드에 널러블 변수를 사용 가능
//    nullableName = null

/*    var len = name.length*/
    var len2 = nullableName?.length
    //nullable 없을 때는 아래와 같이 사용했음(구식)
    if (nullableName !=null) {
        var len2 = nullableName.length
    }else{
        null
    }
    nullableName?.let { println(it.length) } //let{null이 아닌 경우 실행할 코드}

    // ?: 엘비스 연산자
    val name = nullableName ?: "Guest"
    println("name is $name")

    //not null 단언 연산자 :널러블 타입을 not null 타입으로 변경해줌
    println(nullableName!!.toLowerCase())


    //배열
    //val numbers:IntArray = intArrayOf(1, 2, 3, 4, 5, 6)

    //아래와 같이 타입 추론을 이용해 더 간단하게 배열 생성
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
    val numbersD:DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0,6.0)
    println(numbers)  //numbers가 저장된 주소가 출력됨
    println(numbers.contentToString())  //numbers 배열이 출력됨 [1, 2, 3, 4, 5, 6]

    //for문 이용해 numbers 요소+2 값을 하나씩 출력
    for(i in numbers){
        print("${i+2}")
    }

    //배열 수정
    numbers[0] = 6
    numbers[1] = 5
    numbers[4] = 2
    numbers[5] = 1
    print("\nfinal values ${numbers.contentToString()}")

    numbersD[0] = 6.0
    numbersD[1] = 5.0
    numbersD[4] = 2.0
    numbersD[5] = 1.0
    print("\nfinal values ${numbersD.contentToString()}")

    val days = arrayOf("Sun","Mon","Tues","Wed","Thurs","Fri","Sat")
    println(days.contentToString())

    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Grape", 3.5))
    println(fruits.contentToString())
    //fruits의 이름만 뽑아서 프린트
    for (fruit in fruits){
        println("${fruit.name}")
    }

    for(index in fruits.indices){  //indices는 인덱스를 알려줌
        println("${fruits[index].name} is in index $index")
    }

    //다양한 데이터 타입이 있는 배열
    val mix = arrayOf("Sun","Mon","Tues",1,2,3,Fruit("Apple",2.5))
    println(mix.contentToString())

    //리스트
    val months = listOf("January", "February", "March")
    //어떤 타입이든 가능
    val anyTypes = listOf(1,2,3,true,false,"String")
    println(anyTypes.size)
    println(months[1])

    //위의 리스트는 이뮤터블 타입(수정 불가, 읽기만 가능)
    //toMutalveList()로 뮤터블 타입 리스트로 변경
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("July")
    additionalMonths.add("Augst")
    println(additionalMonths)

    //뮤터블타입리스트로 지정
    val days1 = mutableListOf<String>("Mon","Tue","Wed")
    //추가 가능
    days1.add("Thu")
    //변경 가능
    days1[2] = "Sunday"
    //삭제 가능
    days1.removeAt(1)
    //전체 삭제 또는 특정 여러 아이템 삭제 가능
    val removeList = mutableListOf<String>("Mon","Wed")
    days1.removeAll(removeList)
    days1.removeAll(days)
    println(days1)

    //Set
    val fruits1 = setOf("Orange", "Apple", "Mango", "Grape", "Apple", "Orange")
    println(fruits1.size)  //중복 제외되서 4출력
    //println(fruits1.toSortedSet())  //알파벳 순서대로 출력

    //뮤터블타입 Set
    val newFruits = fruits1.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    //elementAt() 으로 특정 요소 접근
    println(newFruits.elementAt(4))  //"Water Melon"

    //Map
    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wedsday")
    println(daysOfTheWeek[2])  //index 2 가 아니라 key 2 라 "Monday" 출력

    for(key in daysOfTheWeek.keys){
        println("$key is to ${daysOfTheWeek[key]}")
    }

    val fruitMap = mapOf("Favorite" to Fruit("Grape", 2.5)
        , "Ok" to Fruit("Apple",1.0))

    //뮤터블 타입Map
    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"

    println(newDaysOfWeek.toSortedMap()) //key 기준으로 분류됨

    //ArrayList 연습문제
    var array =ArrayList<Double>(5)
    array.add(1.0)
    array.add(2.0)
    array.add(3.0)
    array.add(4.0)
    array.add(5.0)
    var arrayAvg :Double

    for (i in array.indices){
        arrayAvg += array.get(i)
    }
    arrayAvg = arrayAvg/array.size
    println(arrayAvg)

    //연습문제 정답
    val myArrayList: ArrayList<Double> = ArrayList()
    myArrayList.add(13.212312)
    myArrayList.add(23.151232)
    myArrayList.add(32.651553)
    myArrayList.add(16.223817)
    myArrayList.add(18.523999)
    var total = 0.0
    for (i in myArrayList){
        total += i
    }
    var average = total / myArrayList.size
    println("Avarage is " + average)
}
data class Fruit(val name:String, val price:Double)



fun myFunction(){
    print("Called from myFunction")
}

//람다식
//일반 함수
fun addNumber (a:Int, b:Int) {
    val add = a + b
    println(add)
}

//람다식
val sum: (Int, Int) -> Int = {a: Int, b: Int -> a+b}
println(sum(10,5))

//더 짧은 람다식
val sum = {a:Int, b:Int -> println(a+b)}
sum(10,5)

//중첩 클래스, 내부 클래스

class OuterClass {
    private var name:String ="Mr.X"
    class NestedClass {
        var description:String ="code inside nested class"
        private var id:Int =101
        fun foo(){
            //print("name is ${name})  //외부 클래스의 멤버인 name에 접근 불가
            println("Id is ${id}")
        }
    }
}

fun main(args: Array<String>){
    //중첩 클래스는 반드시 초기화 되어야 함
    println(OuterClass.NestedClass().description) //외부 클래스는 내부 클래스 접근 가능
//code inside nested class 출력됨

    var obj = OuterClass.NestedClass()  //객체 생성
    obj.foo() //Id is 101 출력됨
}

class OuterClass1 {
    private var name1:String ="Mr.X"
    inner class InnerClass {
        var description1:String ="code inside inner class"
        private var id1:Int =101
        fun foo1(){
            print("name is ${name1}")  //외부 클래스의 private멤버인 name에 접근 가능
            println("Id is ${id1}")
        }
    }
}

fun main(args: Array<String>){
    //중첩 클래스는 반드시 초기화 되어야 함
    println(OuterClass1.InnerClass().description1) //외부 클래스는 내부 클래스 접근 가능
//code inside nested class 출력됨

    var obj = OuterClass1.InnerClass()  //객체 생성
    obj.foo1() //name is Mr.X Id is 101 출력됨
}

