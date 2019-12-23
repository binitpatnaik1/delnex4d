import java.util.Scanner;

public class Test
{

	public static void main(String[] args)
        {
        	String str,rev;
		rev="";
                int flag=0;
		int space=0;
                Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		str= sc.nextLine();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
			for(int i=str.length()-1;i>=0;i--)
			{
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				{
					flag++;

				}
				else if(str.charAt(i)==' ')
				space++;
			}
			int c= str.length()-flag-space;
			
		
			System.out.println(rev +","+"the given string contains"+flag+"vowels and" +c+ "consonants");
        }

}