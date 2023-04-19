package lnh.tutorials.kotlinbasics

//부모 클래스
open class Car1(val name: String, val brand: String) {
    // 오픈 클래스여야 상속받는 게 가능
    open var range: Double = 0.0
    fun extendRange(amount: Double) {
        if(amount > 0) {
            range += amount
        }
    }
    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}

//자식 클래스
//name, brand 주 생성자로 생성
class ElectricCar(name: String, brand: String, batteryLife: Double) : Car1(name, brand) {

    var chargerType = "Type1"
    //rane가 open 이여서 오버라이딩 가능
    override var range = batteryLife/6
    //마찬가지로 drive 함수도 open 이여서 오버라이딩 가능
    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }
}
//어떤 클래스 든 Any 클래스로부터 상속 받는 게 가능 (자바의 최상위 클래스 Object와 같은 개념?)

fun main(args: Array<String>){
    var audiA3 = Car1("A3", "Audi")
    var teslaS = ElectricCar("S-Model", "Tesla", 85.0)

    //이름은 같은데 타입은 다른 오버로딩 가능(다형성)
    //다형성: 비슷한 특성을 가진 객체들이 공통된 방법으로 여겨짐
    audiA3.drive(200.0)
    //Car1 으로 부터 상속받아서 drive 메서드 사용 가능->오버라이딩(재정의)도 가능
    teslaS.drive(200.0)
}





