package com.example.test;

public class TestNum {
    public static void main(String[] args) {
        for (int i = 0; i <1000 ; i++) {
            ThreadTest.test();
            System.out.println("-----------------------------");
        }
    }
}
