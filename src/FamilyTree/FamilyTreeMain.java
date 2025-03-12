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
        person1.children.get(2).addChild(new Person("Bob III", "Belize"));
        person1.children.get(2).addChild(new Person("Jasmine", "Canada"));

        //gen 3
        person1.children.get(0).children.get(0).addChild(new Person("Zain Jr", "Mexico"));
        person1.children.get(0).children.get(0).addChild(new Person("Zainette", "Mexico"));
        person1.children.get(2).children.get(0).addChild(new Person("Bob IV", "Belise"));
        person1.children.get(2).children.get(1).addChild(new Person("Zaiesha", "Canada"));
        person1.children.get(2).children.get(1).addChild(new Person("Steve", "USA"));

        //Jill is my mommy
        person1.children.get(1).addChild( new Person("Philip Sr", "Canada") );
        person1.children.get(1).addChild( new Person("Aaron", "Canada") );

        //My kids, Jill grandchildren
        person1.children.get(1).children.get(0).addChild( new Person("Phil Jr", "Canada") );
        person1.children.get(1).children.get(0).addChild( new Person("Philomena", "Chile") );
        person1.children.get(1).children.get(0).addChild( new Person("Philtron", "Antarctica") );

        //My grandkids, Jill great-grandchildren
        person1.children.get(1).children.get(0).children.get(0).addChild( new Person("Phil Jr II", "Canada") );
        person1.children.get(1).children.get(0).children.get(1).addChild( new Person("Philomena Jr", "Chile") );
        person1.children.get(1).children.get(0).children.get(1).addChild( new Person("Philander", "Chile") );
        person1.children.get(1).children.get(0).children.get(1).addChild( new Person("Philbert", "Chile") );


        //print fam
        printFamily(person1);

    }//run


    public static void printFamily(Person ptemp){

//        int index = 0;
//
//        if(index == ptemp.children.size()){
//
//        } else if ( ptemp.children.isEmpty() ) {
//            printFamily(ptemp.children.get(index+1));
//        }

        for (int i = 0; i < ptemp.children.size(); i++) {
            System.out.println( ptemp.printMe() );
            printFamily( ptemp.children.get(i) );
        }


//        printFamily(ptemp.children.get(1));
//        printFamily( ptemp.children.get(2) );

    }//print family


    public static int countFamily(){
        int num = 0;

        return num;
    }// count fam

}//main class
