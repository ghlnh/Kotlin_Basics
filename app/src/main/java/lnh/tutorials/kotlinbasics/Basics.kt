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
}


fun myFunction(){
    print("Called from myFunction")
}
