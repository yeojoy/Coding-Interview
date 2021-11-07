
fun main() {
    test()
}

fun urlify(sentence: String): String {
    val wordArray = sentence.split(" ")
    return wordArray.joinToString(separator = "%20")
}

fun urlify2(sentence: String): String {
    val wordArray = sentence.split(" ")
    val lastIndex = wordArray.size - 1
    val stringBuilder = StringBuilder()
    for ((index, word) in wordArray.withIndex()) {
        stringBuilder.append(word)
        if (index < lastIndex) {
            stringBuilder.append("%20")
        }
    }
    return stringBuilder.toString()
}

fun test() {
    val sentence = "The Random Word Generator is a tool to help you create a list of random words. There are many reasons one might be interested in doing this, and you're likely here because you're interested in creating a random word list. This tool can help you do exactly that. The tool is easy to use. All you need to do is choose the number of words you want to create (the default is five, but you can input any number you'd like) and the type of words you want. You can choose from all words, verbs only, nouns only or adjective only depending on which best meets your needs. Once done, you simply press the Generate Random Words button and a list of words will appear. You can use this list or you can scan them and choose the ones you want to keep by clicking on them. This will place them in the Your Word List area and you can build a new list that meets your needs. Below you'll find some of the common ways this tool can be used."
    val urlifiedSentence = urlify(sentence)
    val urlifiedSentence2 = urlify2(sentence)
    println(sentence)
    println("\nafter:\n$urlifiedSentence")
    println("\nurlify2:\n$urlifiedSentence2")
    println("isSame? ${urlifiedSentence == urlifiedSentence2}")

}
