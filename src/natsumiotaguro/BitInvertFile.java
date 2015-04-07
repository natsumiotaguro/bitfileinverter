package natsumiotaguro;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BitInvertFile {

	
	public BitInvertFile(){
		
	}
	
	
	
	
	public static void main(String[] args){
		try {
			FileInputStream fStream = new FileInputStream(new File("src/natsumiotaguro/StaffGitlet_obf.jar"));
		    DataInputStream dStream = new DataInputStream(fStream);
		    //Byte[] b = new Byte[];
		} catch (FileNotFoundException e) {
			System.out.println("Can't find file");
			e.printStackTrace();
		}
		
	}
	
	
}
