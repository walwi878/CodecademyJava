package Loops;

// @author William Wallace

import java.util.*;

public class PrimeDirective {
  
  public boolean isPrime(int number){
    if (number == 2){
          return true;  
          } else if (number < 2){
        return false;
    } 
    for (int i = number-1; i>2; i--){
        if (number%i == 0||number ==1){
        return false;
      }
          if (number == 2){
          return true;  
          } else if (number < 2){
        return false;
    }
    }
    return true;
  } 
  
  public ArrayList<Integer> onlyPrimes(int[] numbers){
    ArrayList<Integer> primeList = new ArrayList<Integer>();
    for (int i = 0; i < numbers.length-1; i++){
    if (isPrime(numbers[i])){
        primeList.add(numbers[i]);
      }
    }
    return primeList;
  }
  
  public static void main(String[] args) {
    int[] numbers = {0, 2, 1, 28, 33, 11, 100, 101, 43, 89};
    PrimeDirective pd = new PrimeDirective();
    System.out.println("List of numbers: "+ Arrays.toString(numbers) + "\nList of primes: "+ pd.onlyPrimes(numbers));
 
  }
}

