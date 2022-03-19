fun main() {

    // sumArray ფუნქციისთვის პარამეტრების გადაწოდება და მნიშვნელობის გამოტანა კონსოლში
    val array = intArrayOf(1, 2, 3, 4, 5)
    val testSumArray = sumArray(array)
    println("ლუწ ინდექსზე მყოფი რიცხვების ჯამია - $testSumArray")

    // palindrome ფუნქციისთვის პარამეტრების გადაწოდება და მნიშვნელობის გამოტანა კონსოლში
    val testPalindrome1 = palindrome("nun")
    println(testPalindrome1)
    val testPalindrome2 = palindrome("test word")
    println(testPalindrome2)
}

// ფუნქცია გადაეცემა მთელი რიცხვების მასივი და აბრუნებს ლუწ ინდექსზე მყოფი რიცხვების ჯამს მთელ რიცხვებში
fun sumArray(test: IntArray): Int{
    var sumNumber = 0
    for (element in 3..test.size step 2) {
        sumNumber += element
    }
    return sumNumber
}

// ფუნქცია ამოწმებს გადაცემული სტრინგ ტიპის მნიშვნელობა პალინდრომი თუ არა
fun palindrome(word: String): Boolean {
    if (word == word.reversed()){
        return true
    }
    return false
}
