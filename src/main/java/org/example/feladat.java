package org.example;

public class feladat {
    public static void main(String[] args) {

        var operator = new feladat();

        System.out.println(operator.classify(3,3,3));
        System.out.println(operator.classify(3,3,2));
        System.out.println(operator.classify(3,1,2));
    }

    public String classify(int a, int b, int c) {
           if(a==b && a==c){
               return "Equilateral";
           } else if(a == b || b == c || a==c){
               return "Isosceles";
           } else {
               return "Scalene";
           }
    }

}
/* JUnit testing
Task:
        write a method, that determines if a triangle is
        - Equilateral (all sides are the same length),
        - Isosceles(two sides have the same length), or
        - Scalene(all sides are of different length).

        Add tests to verify your solution.
        If it's not possible to form a triangle with the given side lengths, throw an
        InvalidTriangleException.*/