import java.util.Scanner;
/**
 *This program will find the factorial of the entered integer.
 * @author Sevde
 */
public class Main {

  /** 
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);
    // ask the user to enter an integer
    System.out.println("Please enter an integer to calculate the factorial of");
    int integerUser = input.nextInt();
    // the accumulator
    int total = 0;
    // the factorial of the number 
    int factorial = 1;
    // for loop to repeat
    for(int count = 1;  count <= integerUser; count= count + 1  ){
      // add the number as we go into 
      total = total + count;
      // find the factorial of the integer
      factorial *= count;
      
      
      }
      System.out.println( integerUser + "!= " + factorial );



  }
    
}

