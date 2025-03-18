package FamilyTree;

import java.util.ArrayList;
import java.util.Scanner;

public class FamilyTreeMain {

    public static Scanner input = new Scanner(System.in);

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


        while (true) {
            System.out.println("\nPress 1 to print the family\nPress 2 to count the number of family members\nPress 3 to print Canadians\nPress 4 to print from here\nPress 5 to exit");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                //print fam
                printFamily(person1);
            }
            if (choice == 2) {
                //count family
                System.out.println("There is " + countFamily(person1) + " people in this family");
            }
            if(choice == 3){
                //print canadians
                System.out.println("Family in Canada:");
                printCanadians(person1);
            }
            if(choice == 4){
                //print from here
                System.out.println("Who do you want to start printing from");
                String ans = input.nextLine();
                printFromHere(person1, ans);
            }
            if(choice == 5){
                return;
            }

        }//while


    }//run


    public static void printFamily(Person ptemp){

        for (int i = 0; i < ptemp.children.size(); i++) {
            System.out.println( ptemp.children.get(i).printMe() );
            printFamily( ptemp.children.get(i) );
        }

    }//print family


    public static int countFamily(Person ptemp){
        int num = 0;

        num++;

        for (int i = 0; i < ptemp.children.size(); i++) {
           num += countFamily( ptemp.children.get(i) );
        }

        return num;
    }// count fam


    public static void printCanadians(Person ptemp){

        for (int i = 0; i < ptemp.children.size(); i++) {

            if(ptemp.children.get(i).country.equalsIgnoreCase("canada")){
                System.out.println(ptemp.children.get(i).printMe());
            }

            printCanadians( ptemp.children.get(i) );
        }

    }//print canadians


    public static void printFromHere(Person ptemp, String name){

        for (int i = 0; i < ptemp.children.size(); i++) {
            if(ptemp.children.get(i).name.equalsIgnoreCase(name)){
                printFamily( ptemp.children.get(i) );
            }
           printFromHere( ptemp.children.get(i), name );
        }

    }//print from here


}//main class
