package lnh.tutorials.kotlinbasics

fun main() {
    //변수 denis 타입 지정 안해도 코틀린에서 자동으로 Person으로 타입 지정됨
    var denis = Person("Denis", "Panjuta",31)
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")
    denis.hobby = "to skateboard"
    denis.age =32  //31이었던 denis age를 32로 오버라이딩
    println("Denis is ${denis.age} years old")
    denis.stateHobby()
    john.hobby = "play videogames"
    john.stateHobby()
    //연습 문제
    var SamsungGalaxyS20Ultra = MobliePhone(osName = "Android", brand = "Samsung", model = "Galaxy S20 Ultra")
    var AppleIphoneSe = MobliePhone(osName = "Ios", brand = "Apple", model = "IphoneSe")
    var AppleIphone13 = MobliePhone()

    myFunction(5)

    var myCar = Car()
    println("brnad is :${myCar.myBrand}")
    myCar.maxSpeed = 200
    //getter는 private여도 실행 가능
    println("Model is ${myCar.myModel}")
    }

//constructor()는 보조 생성자로 객체 생성 시 값을 추가함
    class Person constructor(firstName: String = "John", lastName: String = "Doe"){ //디폴트 값 John Doe 지정 가능
        //멤버변수(프로퍼티)
        var age : Int? = null
        var hobby : String = "watch Nerflix"
        var firstName :String? = null

    //이니셜라이저: 객체 생성 시 자동으로 호출됨->객체를 시작하기 위해 사용
        init {
            this.firstName = firstName
            println("Initialized a new Person object with "+
                    "firstName = $firstName and lastName = $lastName and age =$age")
        }
    //멤버 생성자(두번째 생성자)
    constructor(firstName: String, lastName: String, age: Int)
        //주 생성자로부터 값을 받아 firstName="John", lastName="Doe" 설정
                : this(firstName, lastName){
        //객체 생성 될 때, 생성되는 해당 클래스(Person)의 age값으로 설정한다는 의미
           this.age = age  //age=null
                }

    //멤버 함수
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
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

//나중초기화 lateinit, setter, gettter
class Car() {
    lateinit var owner :String

    val myBrand :String = "BMW"
        //커스텀 getter
    get() {
        return field.toLowerCase()
    }
    var maxSpeed: Int = 250
        //field는 getter와 setter 메서드 안에서 프로퍼티 참조를 도와주며 뒷받침함
        get() = field
        //value는 변수에 정해지는 값
        set(value){
            field = if(value >0) value else throw IllegalArgumentException("Maxspeed cannot ve less than 0")
        }
    var myModel :String ="M5"
        //setter에는 private 설정이 가능
        private set
    init {
        this.owner = "Frank"
        //private로 한 클래스 내에서만 myModel의 값을 변경 할 수 있음
        this.myModel = "M3"
    }
}

