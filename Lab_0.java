/** Heading  **********************************************/
/*	Your name: Sarah Meyer
		Class block: G			Date Started: Sep 13th
		Lab Number: 0
		Title: Simple Algorithms
		Purpose: Making "simple" algorithms in an inefficient 
    way because rules
*/

public class Lab_0{

  public Lab_0(){
    
  }
  
  public void factors(int num){
    System.out.print("The factors of "+num+" are: 1");
    for (int i=2; i<=num-1;i++){
      if (num%i==0){
        System.out.print("  "+i+",");
        
      }
    }
    System.out.print("  "+num+".");
  }

  public int GCD(int a, int b){
    boolean divisorFound = false;
    int GCD = 1;
    int i = a;
    do{
      if ((a%i==0)&(b%i==0)){
        divisorFound=true;
        GCD = i;
      }
      i--;
    } while (divisorFound == false);
    return GCD;
  }

  public boolean prime(int num){
    boolean isPrime = true;
    for (int i=num; i>1; i--){
      for (int k=num; k>1; k--){
        if (i*k==num){
          isPrime=false;
          System.out.print(i+" * "+k+" = "+num);
        }
      }
    }
    return isPrime;
  }

  public double power(double base, int exponent){
    //finished
    double answer = base; 
    for (int i=0; i < exponent-1; i++){
      answer = answer * base;
    }
    return answer;
  }

  public int findDigit(int num, int n){
    //finished
    int tempnum1= num; //used as an intermediate step in calculations 
    int tempnum2= 1; //used as an intermediate step in calculations
    int tempnum3= 0; //used as an intermediate step in calculations 
    int answer= 0; //used to store potential answers
    for (int i=0; i<n; i++){
      tempnum2=tempnum2*10;
      tempnum3=tempnum1%tempnum2;
      tempnum1=tempnum1-tempnum3;
      answer=tempnum3/(tempnum2/10);
    }
    return answer;
  }

  public void downDigits(int num){
    //finished
    int num1 = num; //java won't let me print num, thus num1
    int nthChar = 0;
    System.out.println("The digits of "+num1+" are:");
    for (int i=countDigits(num); i>0; i--){
      System.out.println(findDigit(num, i));
      
    }
  }

  public int countDigits(double num){
    //finished
    double tempnum1= num; //used as an intermediate step in calculations 
    double tempnum2= 1; //used as an intermediate step in calculations
    double tempnum3= 0; //used as an intermediate step in calculations 
    int answer= 0; //used to store potential answers
    do {
      int i=0;
      i++;
      tempnum2=tempnum2*10;
      tempnum3=tempnum1%tempnum2;
      tempnum1=tempnum1-tempnum3;
      answer++;
    }while(tempnum1!=0);
    return answer;
  }
}