
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;

public class RandomNum
{
    // instance variables - replace the example below with your own
    
  
    

    /**
     * Constructor for objects of class Numbers
     */
    public RandomNum()
    {
        // initialise instance variables
       
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void main(){
       System.out.println("Enter a number between 1 and 30");
       Scanner input = new Scanner(System.in);
       
       Random rand = new Random();
       int n = rand.nextInt(30) + 1;
       System.out.println(n);
       
       int counter = 0;
       
       while(true) {
         int guess = input.nextInt();
       if(guess > n) {
           System.out.println("too large");
           counter++;
        }  else if (guess < n){
            System.out.println("too small");
            counter++;
        }  else {
            System.out.println("You made the correct guess in " + counter + " tries");
            
            
            
        } 
      }
}
}




