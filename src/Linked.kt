class Linked<E>(
    private val value: E,
    private val next: Linked<E>?
) : List<E> {

    //size
    override val size: Int
        get() {
            if (next == null) (return 1) else (return next.size + 1)
        }

    //get
    override fun get(index: Int): E {
        return when (index) {
            0 -> value
            else -> if (next == null) throw ArrayIndexOutOfBoundsException()
            else next[index - 1]
        }
    }

    //contains
    override fun contains(element: E): Boolean {
        var i = 0
        while (i<size){
            if (get(i)==element) return true
        }
        return false
    }

    //indexof
    override fun indexOf(element: E): Int {
        var i = 1
        while (i<=size){
            if (get(i)==element) return i
        }
        return 0g
    }

    //lastindexof
    override fun lastIndexOf(element: E): Int {
        TODO("not implemented")
    }

    //kotlin?
    override fun containsAll(elements: Collection<E>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isEmpty(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun iterator(): Iterator<E> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun listIterator(): ListIterator<E> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun listIterator(index: Int): ListIterator<E> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<E> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}