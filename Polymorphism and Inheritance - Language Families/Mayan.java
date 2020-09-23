//@author William Wallace

public class Mayan extends Language{
    public Mayan(String name, int numSpeakers){
      super(name, numSpeakers, "Central America", "verb-object-subject");
        
    }
    
    /*
    getInfo in this child class overrides the parent class if it is called here. If this method doesn't exist here in the child, then a call to it will work using the parent's method of the same name. 
    */
    @Override
      public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers+" people mainly in "+ this.regionsSpoken+ ".\nThe language follows the word order: " +this.wordOrder+".");
        System.out.println("Fun Fact: Mayan is an ergative language.\n");
      
     }
  }