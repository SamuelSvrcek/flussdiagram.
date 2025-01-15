package net.donauturm

fun after(stringInput: String) {
    if (stringInput == "ja") {
        lehrer_ist_da()
    } else if (stringInput == "nein") {
        start()
    } else {
        println("You entered: $stringInput")
        println("Das was du eingegeben hast ist nicht ein klares ja oder nein")
        Thread.sleep(1000)
        System.out.close()
    }
}

fun start() {
    println("Ist der jetzt Lehrer da?")
    Thread.sleep(1000)
    print("Gib ja oder nein ein: ")
    val stringInput = readLine()!!
    Thread.sleep(1000)
    after(stringInput)
}

fun main() {
    println("Die Glocke klingelt und der Unterricht beginnt.")
    Thread.sleep(1000)
    start()
}

fun lehrer_ist_da() {
    println("Der Lehrer ist da und der Unterricht beginnt!")
    Thread.sleep(1000)
}