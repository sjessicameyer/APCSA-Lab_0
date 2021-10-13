import java.util.Scanner;

public class menu {

  private Scanner input;
  Lab_0 customMath = new Lab_0();
  inputGrab getInput = new inputGrab();
  public menu() {

    runMenu();

  }

  public void runMenu() {
    input = new Scanner(System.in);
    int choice = 0;
    do {
      System.out.println("Please Choose a method:");
      System.out.println("1. factors");
      System.out.println("2. GCD");
      System.out.println("3. prime");
      System.out.println("4. double power");
      System.out.println("5. find digit");
      System.out.println("6. down digits");
      System.out.println("7. count digits");
      System.out.println("0. Quit");
      choice = input.nextInt();

      if (choice == 1) {
        System.out.print("\n");
        customMath.factors(getInput.integerSample(1));
      } 
      else if (choice == 2) {
        System.out.print("\n");
        int input1= getInput.integerSample(1);
        int input2= getInput.integerSample(3);

        System.out.print("\nGCD ("+input1+", "+input2+") will return "+customMath.GCD(input1, input2)+".");
      } 
      else if (choice == 3) {
        System.out.print("\n");
        int input1 = getInput.integerSample(1);
        System.out.print("\nprime (" + input1 + ") will return "+customMath.prime(input1)+ ".");
      } 
      else if (choice == 4) {
        System.out.print("\n");
        double input1=getInput.doubleSample();
        int input2=getInput.integerSample(4);
        System.out.print("\ndoubleSample ("+input1+", "+input2+") will return "+customMath.power(input1, input2)+ ".");
      } 
      else if (choice == 5) {
        System.out.print("\n");
        int input1=getInput.integerSample(1);
        int input2=getInput.integerSample(2);
        System.out.print("\nfindDigit ("+input1+", "+input2+") will return "+customMath.findDigit(input1, input2));
      }
      else if (choice == 6) {
        System.out.print("\n");
        customMath.downDigits(getInput.integerSample(1));
      }
      else if (choice == 7) {
        
        double originalNumber = getInput.doubleSample();
        int answer=customMath.countDigits(originalNumber);
        System.out.print(originalNumber+" has "+answer+" digit(s) left of the decimal point.");
      }
      else if (choice == 0) {
        System.out.print("\n");
        System.out.print("Thank you for using my program.");
      }

      System.out.println("\n");
    } while (choice != 0);
    
  }

}