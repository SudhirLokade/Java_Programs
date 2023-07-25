// To swap two values
//Import scanner class to take input from user 
import java.util.Scanner;
class Swapping
{
    public static void main(String[] args) 
    {
       //Take input from user 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1=sc.nextInt();
        System.out.print("Enter num2: ");
        int num2=sc.nextInt();
        System.out.println("Befor swapping numbers are " +num1+ " and " +num2) ;
        //swapped value of variables using arithmetic operations
        num1=num1+num2;     
        num2=num1-num2;      
        num1=num1-num2;     
        System.out.print("\nAfter swapping, the new order is: " +num1+ " and " +num2);

        // swapped value of varible using temporary vaiable
        int temp=num1;   
            num1=num2;   
            num2=temp;
            System.out.println("After swapping the new order is: " +num1+ " and " +num2);
   }
}
