import java.util.*;

// @author William Wallace

public class Language{
    
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
  
  public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder){
    this.name = name;
    this.numSpeakers = numSpeakers; 
    this.regionsSpoken = regionsSpoken;
    this.wordOrder = wordOrder;
    
  }
  
  public void getInfo(){
    System.out.println(name + " is spoken by " + numSpeakers+" people mainly in "+ regionsSpoken+ ".\nThe language follows the word order: " +wordOrder+".\n");
    
  }
    /*
    if getInfo called on object of the same name in both parent and child from parent, then the object within parent will be parsed, and the the child's method will be called since the object is of type Child, so it overrides the parent.
    */
  public static void main(String[] args){
    Language myLang = new Language("Willish", 5, "Mars", "verb-noun-verb-adjective");
    Mayan mayan = new Mayan("Ki'che'", 2330000);
    SinoTibetan sino1 = new SinoTibetan("Chinese Tibetan", 100000);
    SinoTibetan sino2 = new SinoTibetan("Tibetan", 200000);
    ArrayList<Language> langList = new ArrayList<Language>();
    langList.add(myLang);
    langList.add(mayan);
    langList.add(sino1);
    langList.add(sino2);
    
    for (Language allLangs : langList){
      allLangs.getInfo();
    }
  }
}