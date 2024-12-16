package Ex3_MusicFestival;

class FoodTruck extends NonMusicEvent{

    public String cuisine;

    public FoodTruck(String name, String type, String loc, String c){
        super(name, type, loc);
        cuisine = c;
    }

    public String printCuisine(){
        return "This food truck serves " + cuisine + " food";
    }

}
