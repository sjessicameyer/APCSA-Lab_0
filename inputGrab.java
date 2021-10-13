/* Below you will find examples of how to read various types of information from the keyboard
*/

import java.util.Scanner;

public class inputGrab{

  private Scanner input;

  public inputGrab(){
  }

  public int integerSample(int prompt){
    input = new Scanner(System.in);
    int inputNumber = 0;
    if (prompt == 1){
      System.out.print("Input a number (int): ");
    }else if (prompt == 2){
      System.out.print("Input which digit from the right(int): ");
    }else if (prompt == 3){
      System.out.print("Input a second number(int): ");
    }else if (prompt == 4){
      System.out.print("Input an exponent (digit): ");
    }
    inputNumber = input.nextInt();
    return inputNumber;
  }

  public double doubleSample(){
    input = new Scanner(System.in);
    double inputNumber = 0.0;
    System.out.print("\nInput a number (double): ");
    inputNumber = input.nextDouble();
    return inputNumber;
  }
}