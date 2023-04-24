package lnh.tutorials.kotlinbasics

fun main(){
    val StringList: List<String> = listOf(
        "Denis", "Frank", "Michael", "Garry")
    val mixedTypeList: List<Any> = listOf(
        "Denis", 31, 5, "BDay", 70.5, "weighs", "Kg")

    for(value in mixedTypeList) {
        if(value is Int) {
            println("Integer: '$value'")
        } else if (value is Double) {
            println("Double: '$value' with Floor value ${Math.floor(value)}")
        } else if (value is String) {
            println("String: '$value' of length ${value.length}")
        } else {
            println("Unknown Type")
        }
    }

    //위 if문 where 버전
    for(value in mixedTypeList) {
        when (value) {
            is Int -> {
                println("Integer: '$value'")
            }
            is Double -> {
                println("Double: '$value' with Floor value ${Math.floor(value)}")
            }
            is String -> {
                println("String: '$value' of length ${value.length}")
            }
            else -> {
                println("Unknown Type")
            }
        }
    }

    //스마트 캐스트 (컴파일러가 자동 형변환 해줌)
    val obj1: Any = "I have a dream"
    if(obj1 !is String) {
        println("Not a String")
    } else {
        //obj1이 String으로 자동 형변환 됨
        println("Found a String of length ${obj1.length}")
    }

    // 불안전한 형변환 "as" 키워드 사용
    val str1: String = obj1 as String
    println(str1.length) //에러 발생

    val obj2: Any = 1337
    val str2: String = obj2 as String
    println(str2)

    //안전한 형변환 "as" 키워드 사용
    val obj3: Any = 1337
    val str3: String? = obj3 as? String //작동함
    println(str3) //null 출력됨
}