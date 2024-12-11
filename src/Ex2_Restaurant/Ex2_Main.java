package Ex2_Restaurant;

import java.util.ArrayList;

public class Ex2_Main {
    public static void run(){

        ArrayList<Employee> allEmp = new ArrayList<>();

//        Employee a = new Employee();
//        System.out.println(a.getName());

        allEmp.add( new Manager("Suzie", 49000, "555") );
        allEmp.add( new Manager("Gurdeep", 24000, "666") );

        for (int i = 0; i < allEmp.size(); i++) {
            System.out.println("This months pay for " + allEmp.get(i).getName() + " is " + allEmp.get(i).getPay());
        }



    }//run


}//class
