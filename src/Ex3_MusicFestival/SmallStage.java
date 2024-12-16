package Ex3_MusicFestival;

class SmallStage extends Event{

    public int bandMembers;

    public SmallStage(String name, String type, int members){
        super(name, type);
        bandMembers = members;
    }

    public String printMembers(){

        if(bandMembers == 1){
            return super.getEventName() + " is a solo artist";
        }else{
            return super.getEventName() + " has " + bandMembers + " members";
        }

    }//print members

}//class
