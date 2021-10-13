# Lab 0
### Simple Algorithms

#### Objective: 
Explore various algorithms for solving problems using the primitive data types in Java.

* Use only three primitive variable types: * int, double, boolean*, **NO** Arrays.

* Your program may only use the information discussed in class to date.  

* Verify your work with a menu-driven program that loops until the user elects to quit. See the Notes Section of our Team replit for some instruction on menus

**Before you begin coding you should be aware that some of the methods you will write below rely on one or more of the other methods you need to write below.  You should write them with that idea in mind.  Hint: they are not listed in any given order.**

1.	Write a method called `factors(int num)` that will print all the factors of a given positive integer.  For example, `factors(30)` should produce the following formatted output (note that a period terminates the list):

		The factors of 30 are: 1,  2,  3,  5,  6,  10,  15,  30.

2.	Write a method `GCD(int a, int b)` that returns the greatest common divisor of its two positive *integer* parameters.


3.	Write a *boolean* method `prime(int num)` that determines whether a given *integer* greater than one is a prime number. Use this header:  `boolean prime(int num)`.


4.	Write a method `double power(double base, int exponent)` that raises a given number (real or integer) to a given (positive, negative, or zero) integer power.  Do **NOT** use `pow(x)` or `log(x)` in your solution.  Note: if the base is zero, the exponent must be positive.


5.	Write a method `findDigit (int num, int n)` that *returns* the nth digit from the right of a given *integer* where n is a positive integer.  

  For example,
    * `findDigit (30568,2)` will return 6
    * `findDigit(234,5)` will return 0
    * `findDigit(-4532,3)` will return 5


6.	Write a method `downDigits(int num)` that will list the digits of a positive integer in one column.  

  For Example: 

  `downDigits (560)` will produce: 


        The digits of 560 are:
        5
        6
        0


7.    Write a method `countDigits(double num)` that *returns* the number of digits to the left 
        of  the decimal point of a valid decimal point number.  Note: `countDigits (0.74)` 
        returns 1.

  
