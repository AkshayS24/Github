package sample;

public class Demo2_ReverseString
{
public static void main(String[] args) 
{
  String org = "Akshay, Just live in the moment";
  
   String rev = "";
   
   for(int i = org.length()-1; i>=0; i--)
   {
	   rev = rev + org.charAt(i);
   }
   System.out.println(rev);
}
}
