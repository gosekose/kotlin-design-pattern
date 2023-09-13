package com.design.pattern.iterator

interface Iterable<E> {
    fun iterator(): Iterator<E>
}

interface Iterator<E> {
    fun hasNext(): Boolean
    fun next(): E
}

data class Book(
    val name: String,
)

class BookShelf(
    val maxSize: Int,
) : Iterable<Book> {
    private val books = mutableListOf<Book>()

    fun getBookAt(index: Int): Book {
        if (index > books.lastIndex) throw IllegalArgumentException("소유한 책의 마지막 번호보다 큽니다")
        return books[index]
    }

    fun appendBooks(book: Book) {
        if (books.size >= maxSize) throw IllegalArgumentException("책장이 찼습니다.")
        books.add(book)
    }

    val isLast: Boolean
        get() = books.size >= maxSize

    val lastIndex: Int
        get() = books.lastIndex

    override fun iterator(): Iterator<Book> {
        return BookShelfIterator(this)
    }
}

class BookShelfIterator(
    val bookShelf: BookShelf,
) : Iterator<Book> {

    private var index = 0

    override fun hasNext(): Boolean {
        return index <= bookShelf.lastIndex
    }

    override fun next(): Book {
        if (!hasNext()) throw IllegalArgumentException("모든 책을 탐색 했습니다.")
        return bookShelf.getBookAt(index++)
    }

    fun init() {
        index = 0
    }
}

fun main() {
    val bookShelf = BookShelf(3)

    bookShelf.appendBooks(Book("the"))
    bookShelf.appendBooks(Book("last"))
    bookShelf.appendBooks(Book("game"))

    val iterator = bookShelf.iterator()

    while(iterator.hasNext()) {
        println(iterator.next())
    }
}