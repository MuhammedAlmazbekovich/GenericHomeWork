package com.company;

import java.util.Objects;

public class Box <T> {
    /*Box деген generic класс тузунуз.
    Ичинде Box деген объектти кайтарган статический generic метод болсун.*/

    private T var1;


    public Box( T var1) {
        this.var1 = var1;

    }

    public T getVar1() {
        return var1;
    }

    public void setVar1(T var1) {
        this.var1 = var1;
    }

    @Override
    public String toString() {
        return "Box{" +
                "var1=" + var1 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(var1, box.var1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(var1);
    }

    public static  <T > Box fuu(T var1){
        return (Box) var1;
    }


}
