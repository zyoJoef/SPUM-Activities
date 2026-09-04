package com.mycompany.interfaceexercises;

public class ReverseCharSequence implements CharSequence {

    private String data;

    public ReverseCharSequence(String data) {
        this.data = data;
    }

    private String reverse() {
        return new StringBuilder(data).reverse().toString();
    }

    @Override
    public int length() {
        return data.length();
    }

    @Override
    public char charAt(int index) {
        return reverse().charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return reverse().subSequence(start, end);
    }

    @Override
    public String toString() {
        return reverse();
    }
}