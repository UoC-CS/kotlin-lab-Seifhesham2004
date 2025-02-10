import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter first number: ")
    val num1 = scanner.nextDouble()

    print("Enter second number: ")
    val num2 = scanner.nextDouble()

    print("Enter operation (+, -, *): ")
    val operation = scanner.next()

    val calculator = Calculator(num1, num2)



    val result = when (operation) {
        "+" -> calculator.add()
        "-" -> calculator.subtract()
        "*" -> calculator.multiply()
        else -> {
            println("Invalid operation!")
            return
        }
    }

    println("Result: $result")
}