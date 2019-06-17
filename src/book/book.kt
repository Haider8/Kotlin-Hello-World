package book

import java.time.Year

//open class Book(val title: String, val author: String) {
//    private var currentPage = 0
//    open fun readPage() {
//        currentPage++
//    }
//}
//
//class eBook(title: String, author: String, val format: String = "text"): Book(title, author) {
//    private var wordCount = 0
//    override fun readPage() {
//        wordCount += 250
//    }
//}

class Book {
    fun titleAuthor(title: String, author: String): Pair<String, String> {
        return (title to author)
    }

    fun titleAuthorYear(title: String, author: String, year: String): Triple<String, String, String> {
        return Triple(title, author, year)
    }
}

fun main() {
    val myBook = Book()

    println(myBook.titleAuthor(title = "title", author = "author"))

    val book = myBook.titleAuthorYear(title = "title", author = "author", year = "year")

    println(myBook.titleAuthorYear(title = "title", author = "author", year = "year"))

    println("here is your book ${book.first} " +
            "written by ${book.second} " +
            "in the year ${book.third}")
}