/**
 * 
 */
package com.merchant.StartMerchantsGuide;

public class StartMerchantsGuide 
{
    public static void main( String[] args )
    {

        //String filePath = "C:\\WorkSpace\\MerchantToGalaxy\\src\\InputFile";
	String filePath = "InputFile";

        if (args.length != 0)
            filePath = args[0];

        try{
            ReadInputAndProcess readInput = new ReadInputAndProcess();
            readInput.readFileAndProcess(filePath);
            DisplayOutput.processOutput();
        }
        catch(Exception e){
            System.out.println("An exception has been raised, Either due to invalid input or due to reading the file, quiting the program " + e);
        }

    
	}
}