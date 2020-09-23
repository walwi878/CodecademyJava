/*
    Calculates the interest, processes the downpayment and charges a premium if a car is red. 
    @author William Wallace
*/

public class CarLoan {
	public static void main(String[] args) {
    CarLoan car = new CarLoan(1000, 0.05, 5, 200);
    //CarLoan[] carList = new CarLoan[carList.size()];
    
    car.processDownpayment();
    car.calcInterest();
    car.needsPremium(true); //return if I need to assign the value to something 
    System.out.println("\nCar's interest rate currently: "+ car.interestRate);
  }
  
	int amountRemaining;
  double interestRate;
  int duration;
  int downpayment;
  String colour;
  boolean isRed;
  
    
  public CarLoan(int amountRemaining, double interestRate, int duration, int downpayment){
    this.amountRemaining = amountRemaining;
    this.interestRate = interestRate; 
    this.duration = duration;
    this.downpayment = downpayment;
  }
  
  public void processDownpayment(){
    System.out.println("Current loan is at " + amountRemaining);
    amountRemaining -= downpayment;
    System.out.println("Deducting " + downpayment + " from loan. Amount remaining is: " +amountRemaining);
    //return amountRemaining;
  }
  
    public double calcInterest(){
      System.out.println("\nInterest rate is: " + interestRate+ ". Your loan is for " +duration+ " years, and you currently owe " +amountRemaining+ " excluding interest");
      double interestCost = interestRate * amountRemaining *duration;
      System.out.println("Consequently, you owe " + interestCost + " in interest all up." );
      return interestCost;
    }
  
  public void needsPremium(boolean isRed){
    if (isRed){
      interestRate = 0.1;
      System.out.println("\nRed cars are fast so pay extra interest. New interest rate: " + interestRate);
    } else {
      System.out.println("\nYou have a slow car.");
    }
  }
  
  
  
}
