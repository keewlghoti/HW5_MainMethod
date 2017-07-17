	import java.io.*;
	import java.util.*;
	import java.util.ArrayList;
	//import java.io.FileOutputStream;

	/*
	 * Write checkbook info to the check
	 */
	public class check implements Serializable
	{
	    private static final long serialVersionUID = 1L; // eclipse told me to
		public static double checkAmount = 0.0; //amount the check is for
		public static int checkNumber; //to hold the check number 
		public static String checkPayee =  null; //string to capture the "who"
		public static String checkReason =  null;// string to capture "why"
		public static String checkPayer =  null;
	    
	    public check(double amount, String payee, String reason)
	    {
	       //initialize the check's values
	       this.checkAmount = amount; 
	       this.checkNumber = 0;
	       this.checkPayee = payee;
	       this.checkReason = reason;
	       this.checkPayer = "Mike Bell";// i know its overcoded, left this hardcode in but could swap for varible later
	       
	    }//Check
	    @Override
	    public String toString()
	    {
	    	return check.checkPayer + " " + check.checkAmount + " " + check.checkPayee;
	    }
	    
	    public static void printCheck()
	    {
	    	
	        System.out.println(check.checkPayer + "    " + check.checkNumber);
	        System.out.println("Pay to the order of: " + check.checkPayee + "     " + check.checkAmount);
	        System.out.println("For: " + check.checkReason);
	       
	        //prints single check by it's self
	    }
	    
	    /*public void serializeCheck(){
	        FileOutputStream FOS = null;
	        File checkFile;
	   
	            
	        try
	        {
	            checkFile = new File("C:/Users/booms/OneDrive/Documents/csshit/checkFile.txt");
	            FOS = new FileOutputStream(checkFile);
	            if(!checkFile.exists()){
	                checkFile.createNewFile();
	            }
	            //byte[] bytesArray = BOS.getBytes();
	            ObjectOutputStream out = new ObjectOutputStream(FOS);
	            out.write(Check);
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
	*/
	   

}

