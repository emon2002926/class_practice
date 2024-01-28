fun main() {
    val myAccount = BankAccount()
    println("Name: "+ myAccount.name)
    println("AccountNumber: " + myAccount.accountNumber)
    println("Available Balance" + myAccount.balance)
    myAccount.deposit(300.00)
    myAccount.withdraw(400.00)
}
class BankAccount() {
    val name = "Iman Emon"
    val accountNumber = 108785
    var balance:Double = 1000.00
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("$amount Tk deposited successfully. New balance: $balance")
        } else {
            println("Invalid deposit amount.")
        }
    }
    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("$amount Tk Withdrawal successful. New balance: $balance")
        } else {
            println("Invalid withdrawal amount or insufficient funds.")
        }
    }

}
