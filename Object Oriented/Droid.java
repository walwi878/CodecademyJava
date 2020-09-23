/*
Creates Droids that consumes energy as it does things, and tcan tranfer energy. 
@author William Wallace
*/
public class Droid{
  
    String name;
    int batteryLevel = 100;
    int energyTransfer;
    
    public Droid(String droidName){
      name = droidName;
      
    }
    
    public static void main(String[] args){
      Droid d1 = new Droid("Anthony");
      Droid d2 = new Droid("Fantano");
      
      System.out.println(d1);
      d1.performTask("dancing");
      d1.performTask("painting");
      System.out.println(d1.reportEnergy());
      d1.energyTransfer(d2);
    }
    
      public void energyTransfer(Droid aux){
      if(this.batteryLevel == 60 && aux.batteryLevel >= 20){
         this.batteryLevel += 20;
         aux.batteryLevel -= 20;
         System.out.println("Transfering energy from " + name + " to " + name );
    batteryLevel -=30;
      }
   }
    
    public String reportEnergy(){
      return "Battery level for " + name + " is: " + batteryLevel;
    }
    
    public void performTask(String task){
      System.out.println(name + " is performing task: " + task);
      batteryLevel-= 10;
    }
      
    public String toString(){
      return "The droid's name is " + name;
    }
  }