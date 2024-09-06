fun main(args: Array<String>) {
//    parrot program
    println("Hi I'm Lora, the virtual parrot, and I love to repeat!")
    println("Type something in: ");
    var input: String
    input = readLine()!!
    var output: String
    output = input + ", " + input + "!"
    println(output)
}