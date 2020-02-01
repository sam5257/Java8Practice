package com.sameer;

//it is public final class
//so it will not participate in inheritance
//it is useful for avoiding null pointer exception

//Every Java Programmer is familiar with NullPointerException. It can crash your code.
// And it is very hard to avoid it without using too many null checks.
//Java 8 has introduced a new class Optional in java.util package. It can help in writing a neat code
// without using too many null checks. By using Optional, we can specify alternate values to return or
// alternate code to run. This makes the code more readable because the facts which were hidden are now
// visible to the developer.

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {


        String[] s=new String[5];

        s[0]="ram";
        s[1]="sam";
        s[3]="null";

        System.out.println(s[0].toUpperCase()); // RAM
       // System.out.println(s[2].toUpperCase());   //NullPointerException


        //with optional first we are checking the this value contains any value then perform any action.

        Optional<String>  o=Optional.ofNullable(s[2]);

        if(o.isPresent())
        {
            System.out.println(o.get().toUpperCase());
        }

        else
            {
                System.out.println("value not existed");
            }

        // creating a string array
        String[] str = new String[5];

        // Setting value for 2nd index
        str[2] = "Geeks Classes are coming soon";

        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);
        System.out.println(value);

        // It returns value of an Optional.
        // If value is not present, it throws
        // an NoSuchElementException
        System.out.println(value.get());

        // It returns hashCode of the value
        System.out.println(value.hashCode());

        // It returns true if value is present,
        // otherwise false
        System.out.println(value.isPresent());

        Optional<String>  s1=Optional.of(null);
        System.out.println(s1);
    }
}
//If a value is present,
// isPresent() will return true and get() will return the value.
// Additional methods that depend on the presence or absence of a contained value are provided,
// such as orElse() which returns a default value if value not present and ifPresent() which executes a block of
// code if the value is present. This is a value-based class, i.e their instances are :
//
//Final and immutable (though may contain references to mutable objects).
//Considered equal solely based on equals(), not based on reference equality(==).
//Do not have accessible constructors.