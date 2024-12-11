package Ex2_Restaurant;

public class Manager extends Employee{

    private int salary;

    public Manager(String n, int s, String sin){
        super(n , sin);
        salary = s;
    }//constructor

    public double getPay(){
        double monthlyPay = salary/12;
        double tax = monthlyPay*0.12;
        taxesCollected += tax;
        return monthlyPay - tax;
    }

}//class