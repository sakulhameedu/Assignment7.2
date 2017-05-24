package Session7;
//import Scanner for user input
import java.util.Scanner;

//define a class Findsub
public class Findsub {
	
	public static void main(String[] args) {
		// allowing user input
		
		Scanner o = new Scanner(System.in);
		System.out.println("Enter the string");
		// enter substring to find
		
		String s = o.nextLine();
		System.out.println("Enter the sub string you want to search");
		String s1 = o.nextLine();
		
		// condition to check whether sub string is present
		// using contains method
		
		if (s.contains(s1)) {
			System.out.println("sub string found");
		} else {

			System.out.println("sub string not found");
		}
	}

}

Sample Output:
sh-4.3$ javac Findsub.java                                                                                                                                                      
sh-4.3$ java Findsub                                                                                                                                                            
Enter the string                                                                                                                                                                
sakulhameedu                                                                                                                                                                    
Enter the sub string you want to search                                                                                                                                         
kul                                                                                                                                                                             
sub string found 
