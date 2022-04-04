package ru.smak.myfragmentapplication;

public class Factorial {
    public double calc(int n){
        return (n <= 1)? 1 : n*calc(n-1);
    }
}
