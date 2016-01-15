package com.cobertura.failed;

/**
 * Created by lee on 2016-01-15.
 */
public class ClassToTest {
    private int id;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassToTest that = (ClassToTest) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public int add(int i, int j) {
        return i + j;
    }
}
