abstract class Account{
    String name;
    int balance;
    public Account(String name,int balance){
        this.name = name;
        this.balance =balance;
    }
    public abstract double calculateInterest(double period);
    public void deposit(int amount){

        balance+=amount;
    }
}
class Savings extends Account{
     int interest=3;
    public Savings(String name,int balance){

        super(name,balance);
    }
    public  double calculateInterest(double period){
        double interestValue = (balance*period*interest)/100;
        return (interestValue);
    }
}
class Current extends Account{
    static int interest=0;
    public Current(String name,int balance){

        super(name,balance);
    }
    public  double calculateInterest(double period){

        return 0;
    }
    public boolean withDrawCheck(double amount){
        double limit= (double)( balance + (0.2*balance)) ;
        return (amount <= limit);
    }
}
public class Intrest {
    public static void main(String[] args) {
        Savings object1= new Savings("Amritha",100000);

        Current object2= new Current("Gopal",50000);
        object2.deposit(10000);
        System.out.println( object1.name +" Balance :"+object1.balance);
        System.out.println(object2.name+ "  Balance :"+object2.balance);
        System.out.println( "Amritha's Interest "+ object1.calculateInterest(0.25));
        System.out.println( "Gopal's Interest "+ object2.calculateInterest(0.25));
        System.out.println("Is withdrawal of 70,000 Rupees allowed :" + object2.withDrawCheck(70000));

    }
}
