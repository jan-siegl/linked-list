interface ILinked<out E> : List<E> {
    fun <R> map(mapping: (E) -> R): ILinked<R>
}