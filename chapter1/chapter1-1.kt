
fun main() {
    test()
}

fun isUnique(string: String): Boolean {
    val charArray = string.toCharArray()
    val lastIndex = charArray.size - 1
    
    for ((index, char) in charArray.withIndex()) {
        val startIndex = index + 1

        for (i in startIndex..lastIndex) {
            if (char == charArray[i]) {
                println("Duplicated char is $char")
                return false
            }
        }
    }

    return true
}

fun test() {
    var wordList = "ll, punch, guess, dance, or, constraint, fraud, nest, leg, photograph, obese, revival, technique, company, performance, sniff, rough, close, budge, process, single, motorist, generate, noble, mislead, wealth, pill, cattle, extinct, aluminium, similar, perception, lock, torture, palm, location, topple, heaven, road, appetite, courage, conscience, wrong, barrel, cause, exclusive, inflate, kidney, expansion, contain, distant".split(", ")
    for (word in wordList) {
        println("isUnique: $word -> ${isUnique(word)}")
    }
}