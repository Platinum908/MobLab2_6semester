//Даны натуральные числа К и N. Составить программу формирования массива А, элементами которого являются числа, сумма цифр которых равна К и которые не больше N.
// Использование функции обязательно.

fun sumDigits(number: Int): Int {
    var x = number
    var sum = 0
    while (x > 0) {
        sum += x % 10
        x /= 10
    }
    return sum
}

fun main() {
    println("Введите число K:")
    val k = readLine()!!.trim().toInt()

    println("Введите число N:")
    val n = readLine()!!.trim().toInt()

    var count = 0
    for (i in 1..n) {
        if (sumDigits(i) == k) {
            count++
        }
    }

    val a = IntArray(count)
    var index = 0
    for (i in 1..n) {
        if (sumDigits(i) == k) {
            a[index] = i
            index++
        }
    }

    if (count == 0) {
        println("Таких чисел нет")
    } else {
        println("Массив A:")
        for (i in 0 until a.size) {
            print("${a[i]} ")
        }
    }
}