package org.example;

public class Adder {
    public int add(Integer a, Integer b){
        return  a + b;
    }

    public static void main(String[] args) {
        var operator = new Adder();
        System.out.println(operator.add(4,6));
    }
}
