import java.util.Scanner;

// Take a number and display its factors 

public class ListFactors {

	public static void main(String[] args) {
     	
		if (args.length == 0)
		{
			System.out.println("Usage : java ListFactors <number>");
			return;
		}
		
        int num = Integer.parseInt(args[0]);  // String to int 
        
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				System.out.println(i);
		}
	}

}
