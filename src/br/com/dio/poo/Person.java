package br.com.dio.poo;

public class Person {

    private String name;
    private int age;
    private static String act;


    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public static void setAct(String active){
        act = active;
    }

    public static String getAct(){
        return act;
    }

}
