package lnh.tutorials.kotlinbasics

fun main() {
    //변수 denis 타입 지정 안해도 코틀린에서 자동으로 Person으로 타입 지정됨
    var denis = Person("Denis", "Panjuta")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")
    }
//constructor()는 보조 생성자로 객체 생성 시 값을 추가함
    class Person constructor(firstName: String = "John", lastName: String = "Doe"){ //디폴트 값 John Doe 지정 가능
        //이니셜라이저: 객체 생성 시 자동으로 호출됨->객체를 시작하기 위해 사용
        init {
            println("Initialized a new Person object with "+
                    "firstName = $firstName and lastName = $lastName")
        }
    }
