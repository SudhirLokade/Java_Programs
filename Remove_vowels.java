//To remove the vowels from the given string

import java.util.Scanner;
class Remove_vowels
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter String: "); 
        String str=sc.nextLine();
        String cv="";
        for(int i=0;i<str.length();i++)   //loop to iterate all the characters of string until its length 
        {   
            //To check the characters if vowels then enter in loop
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                cv+=Character.toUpperCase(str.charAt(i));  //copy the upper case letters in cv variable
            }
            else{
                cv+=str.charAt(i);  //copy as it is string to cv
            }
        }
        System.out.println(cv);  //print the changed string 
    }
}