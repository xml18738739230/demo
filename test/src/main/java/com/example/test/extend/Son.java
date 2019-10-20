package com.example.test.extend;

import lombok.Data;
import lombok.extern.java.Log;

/**
 * @author DL
 */
@Log
@Data
public class Son extends Father{
    private String name;

    private int age;
    public Son(){
        System.out.println("子类的无参构造");
    }
    public Son(String name ,int age){
        this.name=name;
        this.age=age;
        System.out.println("----子类的有参构造");
    }

    public static void main(String[] args){
        Son son =new Son("ll",3);
        Father father=new Father("ww",25);
        father.setAge(55);
        System.out.println(father.toString());
        log.info("end");
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
