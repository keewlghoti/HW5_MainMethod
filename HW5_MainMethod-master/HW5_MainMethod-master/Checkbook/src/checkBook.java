
import java.util.*;

import java.io.*;

public class checkBook implements Serializable
{
    
    private double balance;
    public static check[] checkBookRegister;
    public static int checkNumber = 1;
    public double checkAmountBook;
    public double currentBalance;
    public check beef;
    public static Scanner amount;
    public static Scanner payee;
    public static Scanner reason;
  
    public checkBook(){ //initializes object" check book with a starting balance
       
    	check[] checkBookRegister = new check[10];
        currentBalance = 0.0;
        
    }
    
    public static void addCheckCase(){
    	//Amount 
    	System.out.println("How much is the check for: ");
    	Scanner amount = new Scanner(System.in);
    	int checkAmount2 = 0;
		try {
			if (amount.hasNextInt()) {
				checkAmount2 = amount.nextInt();
			}
			else {
				checkAmount2 = 0;
			}
		} catch (InputMismatchException e) {
			System.out.println("Bad Entry");
		}
		
		//Payee
    	System.out.println("Who is the check to be paid to: ");
    	Scanner payee = new Scanner(System.in);
    	String checkPayee2 = null;
		try {
			if (payee.hasNext() ) {
				checkPayee2 = payee.next();
			}
			else{
				checkPayee2 = null;
			}
		}
		catch (InputMismatchException e) {
			System.out.println("Bad Entry");
		}
		
		
		//Reason
    	System.out.println("Why are you making the check: ");
    	Scanner reason = new Scanner(System.in);
    	String checkReason2 = null;
		try {
			if (reason.hasNext() ){
				checkReason2 = reason.next();
			}
			else{
				checkReason2 = null;
			}
		} 
		catch (InputMismatchException e) {
			System.out.println("Bad Entry");
		}
		
		//passes to addCheck() and creates check
    	addCheck(checkAmount2, checkPayee2, checkReason2); // passes info to the method that creates check and adds to 
    	//check.printCheck();
    	
    }
    
    public static void addCheck(int amount, String payee, String reason){// method used to add a single check to array
    	int checkAmount1 = amount;
    	int beef = 0;
    	//int i = 0;
    	String checkPayee1 = payee;
    	String checkReason1 = reason; // parameters
    	
    	//lets create the object
        //check check = new check(checkAmount1, checkPayee1, checkReason1);
        //print it for greater glory
        //check.printCheck();
        //System.out.println(check.checkPayee);
                
    	//try {
    		//for(int i = 0; i == 10; i++){
    		
    			checkBookRegister[beef] = new check(checkAmount1, checkPayee1, checkReason1);
    		//}
    			System.out.println(checkBookRegister[beef]);
    			beef++;
			 
			
			
		//} catch (Exception e) {
		//	e.printStackTrace();
		//}
    	check.printCheck();
        
        
    	//beef.printCheck();
    }
    
    public static void printCheckBook()
    {
    	checkNumber = 0;
        for (check check : checkBookRegister)//for all objects "check" in array "checkBookRegister"
        {
                check.printCheck();
                //prints all checks in array based on the format in method printCheck()
                System.out.println("Check number: " + setCheckNumber()); //prints checknumber based on order in checkbook
                System.out.println(" ");
                checkNumber ++; 
        }  
    }
   
    //below is a method that i was testing. i was going to pass this value into the array each time addCheck() was called - ill ask you for help
    public static int setCheckNumber() //I understand this is a really rough way to add a counter, I just really want a method I can call with this value
    {
        return checkNumber;
    }
    
    /*public void serializeCheck(){
        FileOutputStream FOS = null;
        File checkFile;
        //ByteArrayOutputStream BOS = null;
   
        try{
        ByteArrayOutputStream BOS = new ByteArrayOutputStream(checkBookRegister);
        
        try
        {
            checkFile = new File("C:/Users/booms/OneDrive/Documents/csshit/checkFile.txt");
            FOS = new FileOutputStream(checkFile);
            if(!checkFile.exists()){
                checkFile.createNewFile();
            }
            //byte[] bytesArray = BOS.getBytes();
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            out.writeObject(Check);
            out.flush();
            out.close();
            FOS.flush();
            FOS.close();
            System.out.println("File written successfully");       
        
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        finally{
            try{
                if (FOS != null)
                {
                    FOS.close();
                }
            }
            catch (IOException ioe)
            {
                System.out.println("Error in closing the stream");
            }
        }
    
    }
    catch(IOException ioe)
    {
        System.out.println("Bad");
    }
}*/
    public static void serilaize(Object check) throws IOException{
        FileOutputStream FOS = null;
        File checkFile;
        //ByteArrayOutputStream BOS = null;
   
    try{
        //ByteArrayOutputStream BOS = new ByteArrayOutputStream();
        
        try
        {
            checkFile = new File("C:/Users/MIKe/");
            FOS = new FileOutputStream(checkFile);
            if(!checkFile.exists()){
                checkFile.createNewFile();
            }
            //byte[] bytesArray = BOS.getBytes();
            ObjectOutputStream out = new ObjectOutputStream(FOS);
            out.writeObject(check);
            out.flush();
            out.close();
            FOS.flush();
            FOS.close();
            System.out.println("File written successfully");       
        
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        finally{
            try{
                if (FOS != null)
                {
                    FOS.close();
                }
            }
            catch (IOException ioe)
            {
                System.out.println("Error in closing the stream");
            }
        }
    
    }
    finally
    {
        System.out.println("Bad");
    }
   
}
}