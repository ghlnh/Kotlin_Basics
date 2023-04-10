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
    var name :String = "Denis"
//    name = null ->Compilation ERROR
    var nullableName :String? = "Denis"
    println(nullableName?.toLowerCase())  //메서드에 널러블 변수를 사용 가능
    nullableName = null

    var len = name.length
    var len2 = nullableName?.length
    //nullable 없을 때는 아래와 같이 사용했음(구식)
    if (nullableName !=null) {
        var len2 = nullableName.length
    }else{
        null
    }
    nullableName?.let { println(it.length) } //let{null이 아닌 경우 실행할 코드}

}


fun myFunction(){
    print("Called from myFunction")
}
