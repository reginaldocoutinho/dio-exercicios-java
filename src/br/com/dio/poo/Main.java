package br.com.dio.poo;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Person.setAct("study");
        var stepson = new Person("João");
        stepson.setAge(14);

        var stepdaughter = new Person("Sofia");
        stepdaughter.setAge(12);

        System.out.printf("My stepchildren "+stepson.getName()+" and "+stepdaughter.getName()
        +". "+stepson.getName()+" is "+stepson.getAge()+" years old and "
                +stepdaughter.getName()+" is "+stepdaughter.getAge() +" years old. They "+ Person.getAct() +" during the week.\n");

        var lupita = new Dog("Lupita","Sleeping", "Mikaeli");
        var zuri = new Dog("Zuri","Barking", "Sofia");

        System.out.printf(zuri.owner()+" is "+zuri.name()+"`s owner\n"+
                lupita.owner() +" is "+ lupita.name()+"`s owner");
    }
}
