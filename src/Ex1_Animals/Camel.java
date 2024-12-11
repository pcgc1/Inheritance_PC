package Ex1_Animals;

public class Camel extends Animal{

    int numHumps;

    public Camel(String name,int h){
        super(name);
        numHumps = h;
    }

    public void talk() {
        System.out.println(name + " is a camel that says neooooahhhhawktuah");
    }


}//class