package lnh.tutorials.kotlinbasics

class
Iterfaces {
}
interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

//부모클래스
open class Car2(override val maxSpeed: Double,
                val name:String, open val brand: String): Drivable {
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if (amount > 0) {
            range += amount
        }
    }

    //override fun drive(): String = "driving the interface drive"  //더 짧은 버전
    override fun drive(): String {
        return "driving the interface drive"
    }

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }


    class ElectricCar2(maxSpeed: Double, name: String, brand: String,
                      batteryLife: Double) : Car2(maxSpeed, name, brand) {

        // in KM
        var chargerType = "Type1"
        override var range = batteryLife*6

        override fun drive(distance: Double){
            println("Drove for $distance KM on electricity")
        }

        override fun drive(): String {
            return "Drove for $range KM on electricity"
        }

        override fun brake() {
            super.brake()
            println("brake inside of electric car")
        }
    }
}



fun main(args: Array<String>){
    var audiA3 = Car2(200.0, "A3","Audi")
    var teslaS = Car2.ElectricCar2(240.0, "S-Model", "Tesla", 85.0)

    audiA3.drive()
    teslaS.drive()
    teslaS.drive(200.0)
}