
fun main() {
    test()
}

fun compress(value: String): String {
    if (value.isEmpty()) {
        return "error"
    }

    var charArray = value.toCharArray()
    val lastIndex = charArray.size - 1

    val stringBuilder = StringBuilder()
    var size = 0
    for ((index, char) in charArray.withIndex()) {
        when (index) {
            0 -> {
                size++
            }
            lastIndex -> {
                if (char == charArray[lastIndex - 1]) {                    
                    size++
                    stringBuilder.append("$char$size")
                } else {
                    stringBuilder.append(char).append("1")
                }
            }
            else -> {
                if (char == charArray[index - 1]) {
                    size++
                } else {
                    stringBuilder.append("${charArray[index - 1]}$size")
                    size = 1
                }
            }
        }
    }
    return stringBuilder.toString()
}


fun test() {
    "aaaabbbbbcccccccddddeaa".run {
        println("test1: $this -> ${compress(this)}")
    }
    
    "abdcdesgdasdf".run {
        println("test2: $this -> ${compress(this)}")
    }
    
    "".run {
        println("test3: $this -> ${compress(this)}")
    }
    
    "aabbccddeeffaassddff".run {
        println("test4: $this -> ${compress(this)}")
    }
    
    "bbddmmeekkdajkellfkjsiehhfkdlgj".run {
        println("test5: $this -> ${compress(this)}")
    }

}