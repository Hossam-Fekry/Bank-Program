/*
this is a test to make a Bank program app with kotlin and this app is just a test for me is kotlin basics and syntax
 */
fun main() {

    //make the main variables for the app
    var cash = 0
    var withdraw = 0
    var deposit = 0
    var userChoice : Int


    println("Welcome to our bank program")
    while (true){

        println(" ")
        println("1:check account's chash")
        println("2:Withdraw money")
        println("3:Deposit money")
        println("4:Quit")

        print("Please enter the number of your choice : ")
        userChoice = readln().toInt()
        println(" ")
        // check account cash
        if (userChoice == 1){
            println("your cash now is $cash")


        // withdraw cash
        }else if (userChoice == 2){
            print("please enter the cash that you want to withdraw : ")
            withdraw = readln().toInt()
            if (withdraw <= cash){
                cash -= withdraw
                println("you have been successfully withdraw $withdraw")
                println("your account cash now is $cash")

            }else{
                println("Sorry but your account can't withdraw you this cash")
                println(" ")
            }
        // deposit cash
        }else if (userChoice == 3){
            print("please enter the cash that you want to deposit : ")
            deposit = readln().toInt()
            cash += deposit
            println("you have been successfully deposited $deposit")
            println("your account cash now is $cash")

        }else if (userChoice == 4){
            println("Thank you for using our application")
            readln()
            break
        }else{
            println("invalid choice please try again !!")
        }

    }
}