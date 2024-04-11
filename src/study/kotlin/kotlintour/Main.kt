package study.kotlin.kotlintour

fun main() {
    // Hello world
    println("===== Hello world =====")

    println("Hello, world!")
    // Hello, world!

    // Variables
    println("===== Variables =====")

    val popcorn = 5    // There are 5 boxes of popcorn
    val hotdog = 7     // There are 7 hotdogs
    var customers = 10 // There are 10 customers in the queue

    // Some customers leave the queue
    customers = 8
    println(customers)
    // 8

    // String templates
    println("===== String templates =====")

    customers = 10
    println("There are $customers customers")
    // There are 10 customers

    println("There are ${customers + 1} customers")
    // There are 11 customers


    // Basic types
    println("===== Basic types =====")

    // Some customers leave the queue
    customers = 8

    customers = customers + 3 // Example of addition: 11
    customers += 7            // Example of addition: 18
    customers -= 3            // Example of subtraction: 15
    customers *= 2            // Example of multiplication: 30
    customers /= 3            // Example of division: 10

    println(customers) // 10

    // Variable declared without initialization
    val d: Int
    // Variable initialized
    d = 3

    // Variable explicitly typed and initialized
    val e: String = "hello"

    // Variables can be read because they have been initialized
    println(d) // 3
    println(e) // hello

    // Collections
    println("===== Collections =====")

    // List
    println("===== List =====")

    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
    // [triangle, square, circle]

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
    // [triangle, square, circle]

    println("The first item in the list is: ${readOnlyShapes[0]}")
    // The first item in the list is: triangle

    println("The first item in the list is: ${readOnlyShapes.first()}")
    // The first item in the list is: triangle

    println("This list has ${readOnlyShapes.count()} items")
    // This list has 3 items

    println("circle" in readOnlyShapes)
    // true

    // Add "pentagon" to the list
    shapes.add("pentagon")
    println(shapes)
    // [triangle, square, circle, pentagon]

    // Remove the first "pentagon" from the list
    shapes.remove("pentagon")
    println(shapes)
    // [triangle, square, circle]

    // Set
    println("===== Set =====")

    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)
    // [apple, banana, cherry]

    println("This set has ${readOnlyFruit.count()} items")
    // This set has 3 items

    println("banana" in readOnlyFruit)
    // true

    fruit.add("dragonfruit")    // Add "dragonfruit" to the set
    println(fruit)              // [apple, banana, cherry, dragonfruit]

    fruit.remove("dragonfruit") // Remove "dragonfruit" from the set
    println(fruit)              // [apple, banana, cherry]

    // Map
    println("===== Map =====")

    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    // {apple=100, kiwi=190, orange=100}

    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
    // The value of apple juice is: 100

    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")
    // This map has 3 key-value pairs

    juiceMenu.put("coconut", 150) // Add key "coconut" with value 150 to the map
    println(juiceMenu)
    // {apple=100, kiwi=190, orange=100, coconut=150}

    juiceMenu.remove("orange")    // Remove key "orange" from the map
    println(juiceMenu)
    // {apple=100, kiwi=190, coconut=150}

    println(readOnlyJuiceMenu.containsKey("kiwi"))
    // true

    println(readOnlyJuiceMenu.keys)
    // [apple, kiwi, orange]
    println(readOnlyJuiceMenu.values)
    // [100, 190, 100]

    println("orange" in readOnlyJuiceMenu.keys)
    // true
    println(200 in readOnlyJuiceMenu.values)
    // false

    // Control flow
    println("===== Control flow =====")

    // Conditional expressions
    println("===== Conditional expressions =====")

    // If
    println("===== If =====")

    val d2: Int
    val check = true

    if (check) {
        d2 = 1
    } else {
        d2 = 2
    }

    println(d2)
    // 1

    val a = 1
    val b = 2

    println(if (a > b) a else b) // Returns a value: 2

    // When
    println("===== When =====")

    val obj = "Hello"

    when (obj) {
        // Checks whether obj equals to "1"
        "1" -> println("One")
        // Checks whether obj equals to "Hello"
        "Hello" -> println("Greeting")
        // Default statement
        else -> println("Unknown")
    }
    // Greeting

    val result = when (obj) {
        // If obj equals "1", sets result to "one"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(result)
    // Greeting

    val temp = 18

    val description = when {
        // If temp < 0 is true, sets description to "very cold"
        temp < 0 -> "very cold"
        // If temp < 10 is true, sets description to "a bit cold"
        temp < 10 -> "a bit cold"
        // If temp < 20 is true, sets description to "warm"
        temp < 20 -> "warm"
        // Sets description to "hot" if no previous condition is satisfied
        else -> "hot"
    }
    println(description)
    // warm

    // Range
    println("===== Range =====")

    // Loops
    println("===== Loops =====")

    // For
    println("===== For =====")

    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        print(number)
    }
    // 12345
    println()

    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
    // Yummy, it's a carrot cake!
    // Yummy, it's a cheese cake!
    // Yummy, it's a chocolate cake!

    // While
    println("===== While =====")

    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    // Eat a cake
    // Eat a cake
    // Eat a cake

    var cakesBaked = 0
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
    // Eat a cake
    // Eat a cake
    // Eat a cake
    // Bake a cake
    // Bake a cake
    // Bake a cake

    // Functions
    println("===== Functions =====")

    hello()
    // Hello, world!

    println(sum(1, 2))
    // 3

    // Named arguments
    println("===== Named arguments =====")

    // Uses named arguments with swapped parameter order
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello

    // Default parameter values
    println("===== Default parameter values =====")

    // Function called with both parameters
    printMessageWithPrefix("Hello", "Log")
    // [Log] Hello

    // Function called only with message parameter
    printMessageWithPrefix("Hello")
    // [Info] Hello

    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello

    // Functions without return
    println("===== Functions without return =====")

    printMessage("Hello")
    // Hello

    // Single-expression functions
    println("===== Single-expression functions =====")

    println(sum2(1, 2))
    // 3

    // Lambda expressions
    println("===== Lambda expressions =====")

    println(uppercaseString("hello"))
    // HELLO

    println({ string: String -> string.uppercase() }("hello"))
    // HELLO

    // Assign to variable
    println("===== Assign to variable =====")

    val upperCaseString = { string: String -> string.uppercase() }
    println(upperCaseString("hello"))
    // HELLO

    // Pass to another function
    println("===== Pass to another function =====")

    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }
    println(positives)
    // [1, 3, 5]
    println(negatives)
    // [-2, -4, -6]

    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { x -> x * 3 }
    println(doubled)
    // [2, -4, 6, -8, 10, -12]
    println(tripled)
    // [3, -6, 9, -12, 15, -18]

    // Function types
    println("===== Function types =====")

    println(upperCaseString2("hello"))
    // HELLO

    // Return from a function
    println("===== Return from a function =====")

    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")
    // Total time is 1680 secs

    // Invoke separately
    println("===== Invoke separately =====")

    println({ string: String -> string.uppercase() }("hello"))
    // HELLO

    // Trailing lambdas
    println("===== Trailing lambdas =====")

    // The initial value is zero.
    // The operation sums the initial value with every item in the list cumulatively.
    println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // 6

    // Alternatively, in the form of a trailing lambda
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item })  // 6

    // Classes
    println("===== Classes =====")

    // Properties
    println("===== Properties =====")

    // Create instance
    println("===== Create instance =====")

    val contact = Contact(1, "mary@gmail.com")

    // Access properties
    println("===== Access properties =====")

    // Prints the value of the property: email
    println(contact.email)
    // mary@gmail.com

    // Updates the value of the property: email
    contact.email = "jane@gmail.com"

    // Prints the new value of the property: email
    println(contact.email)
    // jane@gmail.com

    println("Their email address is: ${contact.email}")

    // Member functions
    println("===== Member functions =====")

    val contact4 = Contact4(1, "mary@gmail.com")
    // Calls member function printId()
    contact4.printId()
    // 1

    // Data classes
    println("===== Data classes =====")

    // Print as string
    println("===== Print as string =====")

    val user = User("Alex", 1)
    // Automatically uses toString() function so that output is easy to read
    println(user)
    // User(name=Alex, id=1)

    // Compare instances
    println("===== Compare instances =====")

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // Compares user to second user
    println("user == secondUser: ${user == secondUser}")
    // user == secondUser: true

    // Compares user to third user
    println("user == thirdUser: ${user == thirdUser}")
    // user == thirdUser: false

    // Copy instance
    println("===== Copy instance =====")

    // Creates an exact copy of user
    println(user.copy())
    // User(name=Alex, id=1)

    // Creates a copy of user with name: "Max"
    println(user.copy("Max"))
    // User(name=Max, id=1)

    // Creates a copy of user with id: 3
    println(user.copy(id = 3))
    // User(name=Alex, id=3)

    // Null safety
    println("===== Null safety =====")

    // Nullable types
    println("===== Nullable types =====")

    // neverNull has String type
    var neverNull: String = "This can't be null"

    // Throws a compiler error
//    neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"

    // This is OK
    nullable = null

    // By default, null values aren't accepted
    var inferredNonNull = "The compiler assumes non-nullable"

    // Throws a compiler error
//    inferredNonNull = null

    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) // 18
//    println(strLength(nullable))  // Throws a compiler error

    // Check for null values
    println("===== Check for null values =====")

    val nullString: String? = null
    println(describeString(nullString))
    // Empty or null string

    // Use safe calls
    println("===== Use safe calls =====")

    println(lengthString(nullString))
    // null

    println(nullString?.uppercase())
    // null

    // Use Elvis operator
    println("===== Use Elvis operator =====")

    println(nullString?.length ?: 0)
    // 0
}

fun hello() {
    return println("Hello, world!")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun printMessage(message: String) {
    println(message)
    // `return Unit` or `return` is optional
}

fun sum2(x: Int, y: Int) = x + y

fun uppercaseString(string: String): String {
    return string.uppercase()
}

val upperCaseString2: (String) -> String = { string -> string.uppercase() }

fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

class Contact(val id: Int, var email: String)

class Contact2(val id: Int, var email: String) {
    val category: String = ""
}

class Contact3(val id: Int, var email: String = "example@gmail.com") {
    val category: String = "work"
}

class Contact4(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

data class User(val name: String, val id: Int)

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun lengthString(maybeString: String?): Int? = maybeString?.length
