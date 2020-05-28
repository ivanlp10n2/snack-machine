package ar.empanada.ddd.snackmachine.domain

abstract class Entity {
    final long id

    @Override
    boolean equals(Object obj) {
        Entity other = obj as Entity
        if (other.id == 0 || id == 0)
            return false
        return id == other.id
    }

    @Override
    int hashCode() {
        return super.hashCode() + id
    }
}
