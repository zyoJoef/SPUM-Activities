package com.mycompany.interfaceexercises;

public class MainTest {
    public static void main(String[] args) {

        ReverseCharSequence rcs =
                new ReverseCharSequence("Programming is fun!");

        System.out.println("Original: Programming is fun!");
        System.out.println("Reversed: " + rcs.toString());
        System.out.println("Length: " + rcs.length());
        System.out.println("charAt(0): " + rcs.charAt(0));
        System.out.println("subSequence(0,5): " + rcs.subSequence(0, 5));
    }
}