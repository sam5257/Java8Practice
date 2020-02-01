package com.sameer;


//Functional Interface can only contain one abstract method

@FunctionalInterface
public interface FunctionalInterfaceExample {

    void m1();

}

//Child interface also contain m1() abstract method coming from parent.
@FunctionalInterface
interface B extends FunctionalInterfaceExample
{

}