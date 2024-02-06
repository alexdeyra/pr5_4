fun main() {
try {
    println("Введите трёхзначное число")
    var number = readLine()?.toInt()
    if (number != null) {
        when {
            (number % 2==0) -> println("Цифра чётная")
            (number % 2!=0) -> println("Цифра не чётная")
        }
    }
} catch(e:Exception){println("Вы ввели не цифру")}
}