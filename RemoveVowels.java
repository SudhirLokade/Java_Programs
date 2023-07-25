//To remove the vowels from the string
import java.util.Scanner;
public class RemoveVowels
{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string: ");
       String str=sc.nextLine();
       String a=str.toLowerCase();   //this converts the string to the lower case 
       String b="";
       //loop starts from 0 and goes till length of string
       for(int i=0;i<str.length();i++)
       {
            //this check is there any vowel present in the string if any then enters inside the statement
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
            {

            }
            else{
                b+=a.charAt(i);   //this prints the new string after removal of  vowels
            }
       } 
       System.out.println(b);
    }  
}
