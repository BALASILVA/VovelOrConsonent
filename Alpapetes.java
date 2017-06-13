package alpepates;
import java.util.Scanner;
public class Alpapetes {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the letter");
	char letter=sc.next().charAt(0);
	sc.close();
	if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
		System.out.println("The given alphabet is vovel");
	}
	else{
		System.out.println("The given alphabet is not vovel");
	}
}
}
