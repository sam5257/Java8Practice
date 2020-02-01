package com.sameer;

public class LambdaExpressionExample {

    public static void main(String[] args) {
    }

    public void m1()
    {
        System.out.println("Regular method");
    }

    //Below equivalent lambda expression of m1 method
    //()-> System.out.println("Lambda Expression");

    public void add(int a ,int b)
    {
        System.out.println(a+b);
    }

    //(a,b)->System.out.println(a+b);

    public int square(int n)
    {
        return n*n;
    }

    // n->(n*n);   If only 1 argument is there we can remove paranthesis.


    //Note - Without curly braces we cannot use return keyword.
    //n->{return n*n ;};   //valid
    //n->return n*n;    //invalid
    //n->{return n*n};   //invalid
}
