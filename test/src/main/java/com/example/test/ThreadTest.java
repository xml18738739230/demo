package com.example.test;

public class ThreadTest {
    public static void test(){
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                ping();
            }
        });
        threadA.start();
        Thread.yield();
        System.out.println("Pong");
    }
    public static void ping (){
        System.out.println("Ping");
    }
}
