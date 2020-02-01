package com.sameer;

//Main advantage of method references is code reusability.
//https://www.youtube.com/watch?v=S5zVwjtMxoc

public class MethodRefrencesExample {

    public static void main(String[] args) {

MethodRefrencesExample object=new MethodRefrencesExample();

     //   Runnable runnable=MethodRefrencesExample::m1;  //Method Refrences for static method

   Runnable runnable=object::m2;

        Thread thread=new Thread(runnable);
        thread.start();

        AddInterface addInterface=(a,b)->System.out.println("Sum :"+(a+b));
        addInterface.add(20,30);

        AddInterface addInterface1=MethodRefrencesExample::sum;
        addInterface.add(50,10);


    }

    //Note : You can give return type no issue ...but only is arguments should be matched with implementation method here
    //we are implementing run method of Runnable interface which take 0 arg.
    public static void m1()
    {
        System.out.println("Inside Child Thread");
    }

    public void m2()
    {
        System.out.println("Inside child thread using object refrence method");
    }


    public static void sum(int a , int b)
    {
        System.out.println("Sum is :" +(a+b));
    }
}

interface AddInterface
{
    public void add(int a,int b);
}
