package Ex3_MusicFestival;

class FoodTruck extends NonMusicEvent{

    public String cuisine;

    public FoodTruck(String name, String type, String loc, String c){
        super(name, type, loc);
        cuisine = c;
    }


    @Override
    public void printMe(){
        System.out.println("Name:" + super.getEventName() + "  Type:" + super.getEventType() + " Location:" + super.getLocation() + "  Cuisine:" + cuisine + "  ID:" + super.getEventID());
    }


    public String printCuisine(){
        return "This food truck serves " + cuisine + " food";
    }

}
