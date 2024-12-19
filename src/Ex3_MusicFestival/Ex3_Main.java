package Ex3_MusicFestival;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_Main {

    public static Scanner input = new Scanner(System.in);//Library.input.next() isn't  working for some reason so I just made a scanner here

    public static void run(){

        ArrayList<Event> allEvents = new ArrayList<>();


        //Main stage events
        allEvents.add( new MainStageEvent("Walk Off The Earth", "music") );
        allEvents.add( new MainStageEvent("Hemple Temple", "music") );
        allEvents.add( new MainStageEvent("Bob Dylan", "music") );
        allEvents.add( new MainStageEvent("Neil Young", "music") );
        allEvents.add( new MainStageEvent("Leonard Cohen", "music") );

        //Small stage events
        allEvents.add( new SmallStage("Kendrick Lamar & DJ Mustard", "music", 2) );
        allEvents.add( new SmallStage("Nettspend & Rhonda", "music", 2) );
        allEvents.add( new SmallStage("Iain, Aidan, Evan, and Iken Moyles", "music", 4) );
        allEvents.add( new SmallStage("Aaron and Philip", "music", 2) );
        allEvents.add( new SmallStage("Simon & Garfunkel", "music", 2) );

        //Non music events
        allEvents.add( new NonMusicEvent("Face Painting Booth","Kids activity" ,"Tent 4") );

        //Food trucks (non music event)
        allEvents.add( new FoodTruck("Tacos", "Food Truck", "Plot 1", "Mexican") );
        allEvents.add( new FoodTruck("Ramen", "Food Truck", "Plot 2", "Japanese") );
        allEvents.add( new FoodTruck("Gelato", "Food Truck", "Plot 3", "Italian") );
        allEvents.add( new FoodTruck("Mini Donuts", "Food Truck", "Plot 4", "American") );
        allEvents.add( new FoodTruck("Poutine", "Food Truck", "Plot 5", "Canadian") );


//        ( (MainStageEvent)allEvents.get(1) ).addTech("PyroTechnics");
//        ( (MainStageEvent)allEvents.get(1) ).addTech("Symphony Orchestra");

//        for (int i = 0; i < allEvents.size(); i++) {
//
//            System.out.println(allEvents.get(i).getEventName());
//
//            if(allEvents.get(i) instanceof MainStageEvent) {
//                ((MainStageEvent) allEvents.get(i)).printTech();
//            }
//
//        }//end for

        while(true){
            System.out.println("What do you want to do?\n1.Add new event\n2.Search for event\n3.Filter by event type\n4.Print by groups\n5.Add MainStage Tech\n6.exit");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                //add event
                System.out.println("What event do you want to add? (Main stage, Small stage, Non Music)");
                String tempEvent = input.nextLine();

                System.out.println("What type of event is it?");
                String tempType = input.nextLine();

                System.out.println("What is the name of the event?");
                String tempName = input.nextLine();

                if(tempEvent.equalsIgnoreCase("Main Stage")){
                    allEvents.add( new MainStageEvent(tempName, tempType));

                } else if(tempEvent.equalsIgnoreCase("Small Stage") ) {
                    System.out.println("How many people are performing?");
                    int tempMembers = input.nextInt();
                    input.nextLine();

                    allEvents.add( new SmallStage(tempName, tempType, tempMembers));

                } else if(tempEvent.equalsIgnoreCase("Non Music")) {
                    System.out.println("Where is the event located?");
                    String tempLoc = input.nextLine();

                    if(tempType.equalsIgnoreCase("Food Truck")){
                        System.out.println("What cuisine does the food truck sell?");
                        String tempCuis = input.nextLine();
                        allEvents.add( new FoodTruck(tempName, tempType, tempLoc, tempCuis) );
                    }else{
                        allEvents.add( new NonMusicEvent(tempName, tempType, tempLoc) );
                    }

                }//end else if

            }else if (choice == 2) {
                //search for event by name
                System.out.println("What event are you looking for?");
                String name = input.nextLine();

                for (int i = 0; i < allEvents.size(); i++) {
                    if(allEvents.get(i).getEventName().equalsIgnoreCase(name) ){

                        allEvents.get(i).printMe();

                    }//end if
                }//end for i

            }else if (choice == 3) {
                //filter by event type
                System.out.println("What type of event do you want to filter by? 1 for MainStage, 2 for NonMusicEvent, 3 for SmallStage, 4 for FoodTruck");
                int answer = input.nextInt();
                input.nextLine();

                for (int i = 0; i < allEvents.size(); i++) {

                    switch (answer){
                        case 1:
                            if(allEvents.get(i) instanceof MainStageEvent){
                                allEvents.get(i).printMe();
                            }
                            break;
                        case 2:
                            if(allEvents.get(i) instanceof NonMusicEvent){
                                allEvents.get(i).printMe();
                            }
                            break;
                        case 3:
                            if(allEvents.get(i) instanceof SmallStage){
                                allEvents.get(i).printMe();
                            }
                            break;
                        case 4:
                            if(allEvents.get(i) instanceof FoodTruck){
                                allEvents.get(i).printMe();
                            }
                            break;
                    }//end switch

                }//end for i


            }else if (choice == 4) {
                //print events grouped by type
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < allEvents.size(); j++) {
                        if(i == 0 && allEvents.get(j) instanceof NonMusicEvent){
                            allEvents.get(j).printMe();
                        } else if (i == 1 && allEvents.get(j) instanceof MainStageEvent) {
                            allEvents.get(j).printMe();
                        } else if (i == 2 && allEvents.get(j) instanceof SmallStage) {
                            allEvents.get(j).printMe();
                        }
                    }//end for j
                }//end for i

            }else if(choice == 5){
                //Add main stage tech
                System.out.println("What main stage event do you want to add tech to?");
                String event = input.nextLine();

                boolean eventFound = false;

                for (int i = 0; i < allEvents.size(); i++) {
                    if(allEvents.get(i).getEventName().equalsIgnoreCase(event) && allEvents.get(i) instanceof MainStageEvent){
                        eventFound = true;

                        System.out.println("What type of tech do you want to add?");
                        String tech = input.nextLine();

                        ((MainStageEvent)allEvents.get(i)).addTech(tech);

                    }//end if
                }//end for i

                if(!eventFound){
                    System.out.println("Event not found or not a main stage event. Consider adding a new main stage event.");
                }

            }else{
                break;
            }



        }//while loop


    }//run



}//class
