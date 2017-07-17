import java.io.*;
import java.util.*;

public class Bank {
	static boolean programStatus = true;
	static checkBook book;
	
	int userInput;
	
	
	
	public static void main(String[] args) throws IOException {
		
		checkBook book = new checkBook();
        while (programStatus = true){
        	
            userInteraction();
            System.out.println(programStatus);
            
        
    }
    
    
}
    public static void userInteraction() throws IOException{
    	
        System.out.println("Welcome to your bank.");      
        System.out.println("Please choose one:");
        //System.out.println("1) Create a new check.");
        System.out.println("1) Create a check in your checkbook.");
        //System.out.println("3) View checking account balance.");
        //System.out.println("4) Add money to check book balance.");
        //System.out.println("6) Move checkbook to text file.");
        System.out.println("2) Print out checkbook.");
        System.out.println("3) Serialize the checkbook.");
        System.out.println("4) Quit.");
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
		if (scanner.hasNextInt()) {
			userInput = scanner.nextInt();
		}
		else{
			userInput = 3;
		}
        
        switch(userInput){
        case 1: // handles the creation of the check object.
        	int i = 0;
        	i++;
        
			checkBook.addCheckCase();
			
			break;
        
        case 2:
        	System.out.println("Your checkbook:");
        	System.out.println(" ");
        	checkBook.printCheckBook();
        	break;
        	
        case 4:
        	programStatus = false;
        	System.out.println("Thank you for using the bank today.");
        	System.exit(0);
        	checkBook.amount.close();
        	checkBook.payee.close();
        	checkBook.reason.close();
        	break;
        case 3:
        	checkBook.serilaize(book);
        	
        }
        	
    }


}
