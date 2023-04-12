package lnh.tutorials.kotlinbasics

fun main() {
    //변수 denis 타입 지정 안해도 코틀린에서 자동으로 Person으로 타입 지정됨
    var denis = Person("Denis", "Panjuta")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")

    //연습 문제
    var SamsungGalaxyS20Ultra = MobliePhone(osName = "Android", brand = "Samsung", model = "Galaxy S20 Ultra")
    var AppleIphoneSe = MobliePhone(osName = "Ios", brand = "Apple", model = "IphoneSe")
    var AppleIphone13 = MobliePhone()

    myFunction(5)
    }

//constructor()는 보조 생성자로 객체 생성 시 값을 추가함
    class Person constructor(firstName: String = "John", lastName: String = "Doe"){ //디폴트 값 John Doe 지정 가능
        //이니셜라이저: 객체 생성 시 자동으로 호출됨->객체를 시작하기 위해 사용
        init {
            println("Initialized a new Person object with "+
                    "firstName = $firstName and lastName = $lastName")
        }
    }

    //연습 문제
    class MobliePhone constructor(osName : String ="Ios", brand: String ="Apple", model: String = "Iphone13"){
        init {
            println("Initialized a new MobliePhone object with "+
                    "osName = $osName and brand = $brand and model = $model")
        }
    }
//섀도잉 :프로퍼티와 파라미터(a)가 같은 이름을 가질 수 있다.
//섀도잉이 발생한 코드는 동작에는 문제가 없으나 이해하기 어려우므로 섀도잉이 발생하지 않도록 주의
    //아래 a는 매개변수(파라미터)
    fun myFunction(a:Int){
        //아래 a는 변수 (myFunction 클래스 내(범위)에서만 적용되는 변수임
        var a = 4
        println("a is $a")  //main에서 a=5로 파라미터를 정했지만 변수 a(4)가 출력됨
    }
