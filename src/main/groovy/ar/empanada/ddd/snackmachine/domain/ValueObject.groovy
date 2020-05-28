package ar.empanada.ddd.snackmachine.domain

abstract class ValueObject<T> {
    @Override
    boolean equals(Object obj) {
        assert obj
        return equalsCore(obj as T)
    }

    protected abstract boolean equalsCore(T other)

    @Override
    int hashCode() {
        return hashCodeCore()
    }

    protected abstract int hashCodeCore()


}
