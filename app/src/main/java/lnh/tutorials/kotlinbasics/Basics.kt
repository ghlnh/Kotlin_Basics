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
}
data class Fruit(val name:String, val price:Double)


fun myFunction(){
    print("Called from myFunction")
}
