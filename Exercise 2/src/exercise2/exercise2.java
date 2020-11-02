package exercise2;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
	
		printQuestion1();
		printQuestion2();
		printQuestion3();
		printQuestion4();
		printQuestion5();
		printQuestion6();
		printQuestion7();
		printQuestion8();
		printQuestion9();
		printQuestion10();
	
	}
	public static void printQuestion1() {
		Scanner in = new Scanner(System.in);
		 System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        int num2 = in.nextInt();
		 System.out.print("Input third number: ");
        int num3 = in.nextInt();
        System.out.print("Input fourth number: ");
        int num4 = in.nextInt();		
		
		if (num1 == num2 && num2 == num3 && num3 == num4) 
		  {
			System.out.println("Numbers are equal.");
                              }
		else
			{
			System.out.println("Numbers are not equal!");
		}
	}
	
	public static void printQuestion2() {
		Scanner in = new Scanner(System.in);
		 System.out.print("Input first number: ");
        double n1 = in.nextDouble();
        System.out.print("Input second number: ");
        double n2 = in.nextDouble();
		 System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
	}
	
	public static void printQuestion3() {
		Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();  
		System.out.print("Input the second number: ");
		int y = in.nextInt(); 
		System.out.print("Input the third number : ");
        int z = in.nextInt(); 
        System.out.print("The result is: "+test(x, y, z,true));
		System.out.print("\n");
	}
	
	public static boolean test(int p, int q, int r, boolean xyz)
    {
	   if(xyz)
		  return (r > q);
	   return (q > p && r > q);
    }
	
	public static void printQuestion4() {
		Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
		int seconds = in.nextInt(); 
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.print( p2 + ":" + p3 + ":" + p1);
		System.out.print("\n");
	}
	
	public static void printQuestion5() {
		Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();  
		System.out.print("Input the second number: ");
		int y = in.nextInt(); 
		System.out.print("Input the third number : ");
        int z = in.nextInt(); 
        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
	}
	
	public static void printQuestion6() {
		int num = 3;
		  int matrix[][] = {
		   {2,5,3},
		   {3,2,1},
		   {1,3,5}
		  };
		  int r = matrix.length;
		  int c = matrix[0].length - 1;
		  int m = 0, n = 0;
		  Boolean flag = false;
		  while (m < r) {
		   while (n <= c) {
		    if (matrix[m][n] == num) {
		     System.out.print("\n(" + m + "," + n + ")\n");
		     flag = true;
		    }
		    n++;
		   }
		   m++;
		   n = 0;
		  }
		  if (flag == false)
		   System.out.print("Number not found!");
	}
	
	public static void printQuestion7() {
		int r1 = (101 + 0) / 3;
		double r2 = 3.0e-6 * 10000000.1;
		boolean r3 = true && true;
		boolean r4 = false && true;
		boolean r5 = (false && false) || (true && true);
		boolean r6 = (false || false) && (true && true);
		
		System.out.println("(101 + 0) / 3)-> " + r1);
		System.out.println("(3.0e-6 * 10000000.1)-> " + r2);
		System.out.println("(true && true)-> " + r3);
		System.out.println("(false && true)-> " + r4);
		System.out.println("((false && false) || (true && true))-> " + r5);
		System.out.println("(false || false) && (true && true)-> " + r6);
	}
	
	public static void printQuestion8() {
		int n = 2350;
		System.out.printf("Original Number: %d\n", n);
		int shift_right_count = 0;
        do {
            n >>= 1;
            shift_right_count++;
        } while (n != 0);
         shift_right_count--;
        System.out.printf("Result: %s\r\n", shift_right_count);
	}
	
	public static void printQuestion9() {
		Scanner in = new Scanner(System.in);
        System.out.print("Input x : ");
        int x = in.nextInt();  
		      System.out.print("Input n : ");
		      int n = in.nextInt(); 
	      	System.out.print("Input y : ");
	      	int y = in.nextInt(); 
	      	    double result = Math.pow(x, n);
		     double result1 = result % y;
		   System.out.println("x^n % y = " + result1); 
	}
	
	public static void printQuestion10() {
		final double width = 5.6;
        final double height = 8.5;

        double perimeter = 2*(height + width);
		
        double area = width * height;			
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
	}
}
