package natsumiotaguro;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class BitInvertFile {

	
	
	public static void main(String[] args){
		try {
			//Get source file
			File source = new File(".gitlet");
			int size = (int)source.length(); //Casting into int, possibly bad for big files
			//Setup Buffer Reader
			DataInputStream reader = new DataInputStream(new FileInputStream(source));
			
		    //Set destination name
		    File destination = new File(".gitlet.zip");
		    
			// if file doesn't exists, then create it
			if (!destination.exists()) {
				destination.createNewFile();
			}
			
			//File writer
		    DataOutputStream writer = new DataOutputStream(new FileOutputStream(destination));
		    
		    for(int i = 0; i < size; i++){
		    	int temp = reader.readByte();
		    	int result = ~temp & 0xff;
		    	writer.writeByte(result);
		    }
		    
	    	
		   writer.close();
		   reader.close();
		   
		   System.out.println("Size: " + destination.length());
		   System.out.println("Inverted the file");
		    
		} catch (FileNotFoundException e) {
			System.out.println("Can't find file");
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("EOF Exception");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
