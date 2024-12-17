package Ex3_MusicFestival;

class SmallStage extends Event{

    public int bandMembers;

    public SmallStage(String name, String type, int members){
        super(name, type);
        bandMembers = members;
    }

    @Override
    public void printMe(){
        System.out.println("\nName:" + super.getEventName() + "  Type:" + super.getEventType() + "  Location:" + super.getLocation() + " # of performers:" + bandMembers + "  ID:" + super.getEventID() );
    }

    public String printMembers(){

        if(bandMembers == 1){
            return super.getEventName() + " is a solo artist";
        }else{
            return super.getEventName() + " has " + bandMembers + " people performing";
        }

    }//print members

}//class
