package Ex2_Restaurant;

public abstract class Employee {
    private String name;
    private String SIN;
    protected double taxesCollected;

    public Employee(String n, String sin){
        name = n;
        SIN = sin;
    }


    public void printMe(){
        System.out.println(name + " \tSocial Insurance Number: " + SIN);
        System.out.println(name+ "'s taxes paid to date: $" + taxesCollected);
    }

    public double getPay(){
        return -1;
    }

    public String getName() {
        return name;
    }

}//class
