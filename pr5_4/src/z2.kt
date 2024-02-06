fun main() {
    try {
        println("Введите кол-во оценок ")
        println("Пятёрок")
        var pat = readLine()!!.toInt()
        println("Четвёрок")
        var chet = readLine()!!.toInt()
        println("Троек")
        var tri = readLine()!!.toInt()
        println("Двоек")
        var dva = readLine()!!.toInt()
       println("общее кол-во учеников")
        println(pat + chet + tri + dva)
    } catch (e:Exception) {println("вы вввели не цифру")}
}