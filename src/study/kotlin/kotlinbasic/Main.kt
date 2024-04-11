package study.kotlin.kotlinbasic

import java.util.*
import kotlin.math.max
import kotlin.math.min
import kotlin.random.Random

// 톱 레벨 상수 const
const val num = 20

// 메인함수
fun main() {
    // print, println
    println("Hello Kotlin")

    // 변수
    var i: Int = 10
    var name: String = "준석"
    var point: Double = 3.3

    i = 20

    // 상수
    val num = 20
//    num = 30 // compile error

    // 형변환
    i = 10
    var l = 20L

    l = i.toLong()
    i = l.toInt()

    name = i.toString()
    i = name.toInt()

    // String
    name = "hello"
    println(name.uppercase())
    println(name.lowercase())
    println(name[0])
    println("제 이름은 $name 입니다.")
    println("제 이름은 ${name + 10} 입니다.")

    // max, min
    i = 10
    var j = 20
    println(max(i, j))
    println(min(i, j))

    // random
    val randomNumber = Random.nextInt(0, 100) // 0 ~ 99
    println(randomNumber)

    // 키보드 입력
    val reader = Scanner(System.`in`)

    // 조건문
    i = 5
    if (i > 10) {
        println("10 보다 크다")
    } else if (i > 5) {
        println("5 보다 크다")
    } else {
        println("!!!!")
    }

    when {
        i > 10 -> {
            println("10 보다 크다")
        }
        i > 5 -> {
            println("5 보다 크다")
        }
        else -> {
            println("!!!!")
        }
    }

    var result = if (i > 10) {
        "10 보다 크다"
    } else if (i > 5) {
        "5 보다 크다"
    } else {
        "!!!!"
    }
    println(result)

    result = when {
        i > 10 -> {
            "10 보다 크다"
        }
        i > 5 -> {
            "5 보다 크다"
        }
        else -> {
            "!!!!"
        }
    }
    println(result)

    // boolean result = i > 10 ? true : false;
    val result2 = if (i > 10) true else false

    // 반복문
    val items = listOf(1, 2, 3, 4, 5)

    for (item in items) {
        println(item)
    }

    items.forEach { item ->
        println(item)
    }

    // for (int i = 0; i < items.length; i++)
    for (i in 0..<items.size) {
        println(items[i])
    }

    // List
    val list: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    list.add(6)
    list.remove(3)

    // Array
    val array = arrayOf(1, 2, 3)
    array[0] = 10

    // 예외처리
    try {
        println(array[4])
    } catch (e: Exception) {
        println(e.message)
    }

    // Null Safety
    var name2: String? = null
    name2 = "준석"
    name2 = null

    var name3: String = ""

    if (name2 != null) {
        name3 = name2
    }

//    name3 = name2!!

    name2?.let {
        name3 = it
    }

    // 함수
    println(sum(10, 20))
    println(sum(b = 10, a = 20))

    // Class
    val john = Person("John", 20)
//    println(john.name)
    println(john.age)
    john.age = 23
    println(john.age)

    // getter, setter
    val john2 = Person("John", 23)

    println(john)
    println(john2)
    println(john == john2)

    // getter, setter 제어
//    john.hobby = "배구"
    println(john.hobby)

    // 타입 체크 is
    val dog: Animal = Dog()
    val cat = Cat()

    if (dog is Dog) {
        println("멍멍이")
    }

    // 강제 타입 변환 as
    cat as Animal

    // 제네릭
    val box = Box(10)
    val box2 = Box("string")
    println(box.value)

    // 콜백 함수 (고차함수)
    myFunc(10) {
        println("함수 호출")
    }
    myFunc(10)
}

// 톱 레벨 함수
fun sum(a: Int, b: Int): Int {
    return a + b
}
fun sum2(a: Int, b: Int) = a + b

fun sum(a: Int, b: Int, c: Int) = a + b + c
fun sum2(a: Int, b: Int, c: Int = 0) = a + b + c

// Class
// data class
data class Person(
    private val name: String,
    var age: Int,
) {
    var hobby = "축구"
        private set
        get() = "취미 : $field"

    init {
        println("init")
    }

    fun some() {
        hobby = "농구"
    }
}

// 상속 extends
abstract class Animal {
    open fun move() {
        println("이동")
    }
}

class Dog : Animal(), Drawable {
    override fun move() {
        println("껑충")
    }

    override fun draw() {
        TODO("Not yet implemented")
    }
}

class Cat : Animal() {
    override fun move() {
        println("살금")
    }
}

open class Man

class Superman : Man()

// interface
interface Drawable {
    fun draw()
}

// 제네릭
class Box<T>(var value: T)

// 콜백 함수 (고차함수)
fun myFunc(a: Int, callback: () -> Unit = {}) {
    println("함수 시작!!!")
    callback()
    println("함수 끝!!!")
}

// 코루틴
suspend fun myFunc2() {
    println("코루틴")
}
