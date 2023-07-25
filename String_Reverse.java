//To reverse the given string 
import java.util.Scanner;
public class String_Reverse 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter string: ");
        String str=sc.nextLine();
        char a[]=str.toCharArray();   //convert the string to array
        for(int i=a.length-1;i>=0;i--)   //to iterate the string in reverse 
        {
            System.out.print(a[i]);   //print the reverse string
        }
    }    
}
