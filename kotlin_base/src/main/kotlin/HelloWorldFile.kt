package org.kot

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Э name - ЭТО свойство а name внутри класса это уже будет поле
val name: String = "John Doe"
fun main() {
//    some()
//    helloWorld()
    println("What is your name?")
    val name = readln()
    println("Hello, $name")

    val name2: String = "John"
    var name3 = "John"
}

private fun helloWorld() {
    println("Hello world")
}

private fun some() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}