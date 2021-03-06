/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xsystem.utils;

/**
 *
 * @author tim
 */
public class Pair<T,K> {
    private final T car;
    private final K cdr;

    public Pair(T car, K cdr) {
        this.car = car;
        this.cdr = cdr;
    }
    
    public static <T,K> Pair<T,K> cons(T car, K cdr) {
        return new Pair(car, cdr);
    }
    
    public T getCar() {
        return car;
    }

    public K getCdr() {
        return cdr;
    }

    @Override
    public String toString() {
        return new StringBuilder("(").append(car).append('=').append(cdr).append(')').toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;

        Pair pair = (Pair) o;

        if (car != null ? !car.equals(pair.car) : pair.car != null) return false;
        if (cdr != null ? !cdr.equals(pair.cdr) : pair.cdr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = car != null ? car.hashCode() : 0;
        result = 31 * result + (cdr != null ? cdr.hashCode() : 0);
        return result;
    }


}
