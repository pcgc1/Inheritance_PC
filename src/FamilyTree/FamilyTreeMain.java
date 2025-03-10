package FamilyTree;

import java.util.ArrayList;

public class FamilyTreeMain {


    public static void run(){
        Person person1 = new Person("Bobbie", "Mexico");

        //generation 1
        person1.addChild( new Person("Susan", "Canada") );
        person1.addChild( new Person("Jill", "Canada") );
        person1.addChild( new Person("Bobette", "Czechia") );

        //generation 2
        person1.children.get(0).addChild( new Person("Zain", "Czechia") );
        person1.children.get(2).addChild(new Person("Bob III", "Belise"));
        person1.children.get(2).addChild(new Person("Jasmine", "Canada"));

        //gen 3
        person1.children.get(0).children.get(0).addChild(new Person("Zain Jr", "Mexico"));
        person1.children.get(0).children.get(0).addChild(new Person("Zainette", "Mexico"));
        person1.children.get(2).children.get(0).addChild(new Person("Bob IV", "Belise"));
        person1.children.get(2).children.get(1).addChild(new Person("Zaiesha", "Canada"));
        person1.children.get(2).children.get(1).addChild(new Person("Steve", "USA"));

    }//run


    public static void printFamily(Person ptemp){

    }//print family


    public static int countFamily(){
        int num = 0;

        return num;
    }// count fam

}//main class
