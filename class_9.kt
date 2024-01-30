/*
//Vehicle Rental Service
fun main() {
    val car = Car("Masda","RX-7",8.00,8,4)
    val bike = Bike("Yamaha","ZF",3.0,4)

    car.rent()
    car.returnVehicle()

    bike.rent()
    bike.returnVehicle()

    println("The total rental fee for both the car and bike is: ${car.rentalFee()+bike.rentalFee()}&")


}

// Base class/PrentClass
open class Vehicle (val brandName:String,val model:String,val rentalFeePerDay: Double,val days:Int ){
    open fun rentalFee():Double{
        return rentalFeePerDay
    }
    fun rent() {
        println("\nRenting $brandName $model for $days days.")
    }
    fun returnVehicle(){
        println("Returning $brandName $model. Rental fee: ${rentalFee()}$\n")
    }

}
//Derive classes/Child Class
class Car( brandName:String, model:String, val rentalPricePerDay: Double,val numOFDays:Int,nubmerOfDoors:Int):
    Vehicle(brandName, model, rentalPricePerDay,numOFDays){

    override fun rentalFee(): Double {
        return rentalPricePerDay*days
    }

}
//Derive classes/Child Class
class Bike( brandName:String, model:String,val rentalPricePerDay:Double,val numOFDays: Int):
    Vehicle(brandName, model, rentalPricePerDay,numOFDays){

    override fun rentalFee(): Double {
        return rentalPricePerDay*numOFDays
    }

}


 */



    //Employee Payroll System
fun main() {
    val fullTimeEmployee = FullTimeEmployee("emon","Xfc-2047",4000,2000)
    val contractEmployee = ContractEmployee("Anas","Xfc-2148",0,3,700)

    fullTimeEmployee.employee_Info()
    contractEmployee.employee_Info()
}
// Base class/PrentClass
open class Employee(val name:String,val employeeID:String,var salary:Int){
    open fun employeeSalary():Int{
        return salary
    }
    open fun employee_Info(){
        println("Employee Name: $name")
        println("Employee ID: $employeeID")
        println("Employee's Salary: ${employeeSalary()}")
    }

}
//Derive classes/Child Class
class FullTimeEmployee(name: String, employeeID: String, salary: Int,var bonous:Int)
    :Employee(name, employeeID, salary){

        // Using override method to calculate FullTimeEmployee's salary
    override fun employeeSalary(): Int {
        return salary + bonous
    }
}
//Derive classes/Child Class
class ContractEmployee(name: String, employeeID: String, salary: Int, val hoursWorked: Int, val hourlyRate: Int)
    :Employee(name, employeeID, salary){
    // Using override method to calculate ContractEmployee's salary
    override fun employeeSalary(): Int {
        return hoursWorked * hourlyRate
    }
    }




