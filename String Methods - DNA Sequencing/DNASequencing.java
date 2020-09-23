import java.util.*;

//@author William Wallace

public class DNASequencing{
  
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your DNA sequence:");
    while(scan.hasNextLine()){
      String dna = scan.nextLine();
      System.out.println("Your DNA sequence is: " + dna.toUpperCase());
    }
  }
    
                       
   
    
    
  
  public boolean isValidDNA(String dna){
    if (dna.substring(0, 3).equals("ATG") &&
        dna.substring((dna.length()-4), (dna.length()-1)).equals("TGA")){
      return true;
    } else {
          return false;
    }
  }
}
                                                           
