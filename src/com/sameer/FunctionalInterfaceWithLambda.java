package com.sameer;

public class FunctionalInterfaceWithLambda {

    public static void main(String[] args) {

        functional f=()-> System.out.println("Hello By lambda expression");
        f.m1();

        add i=(a,b)-> System.out.println("The sum :"+ (a+b));
        i.add(10,20);
    }
}

@FunctionalInterface
interface functional
{  public void m1();
}

@FunctionalInterface
interface add
{
    void add(int a , int b);
}