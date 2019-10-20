package com.example.test.extend;

import lombok.Data;

/**
 * @author DL
 */
@Data
public class Father {
    private String name;

    private int age;
    public Father(){
        System.out.println("------父类的无参构造");
    }
    public Father(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("————————————父类的有参构造");
    }

}
