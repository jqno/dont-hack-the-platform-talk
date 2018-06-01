package demos.languagefeatures

fun main(args: Array<String>) {
    KotlinFalseIsTrue.falseIsTrue()
}

object KotlinFalseIsTrue {

    fun falseIsTrue() {

        println("False is true...")

        // Or is it?          \u000A if (false) return
        println("...not!")
    }
}

