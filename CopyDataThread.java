package lab8;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread {
	
    public CopyDataThread(File f1, File f2) throws IOException, InterruptedException {
    	
    	FileReader fr=new FileReader(f1); 
    	int x=fr.read( );
        FileWriter f = new FileWriter(f2); 
        int i = 0;
    	while( x!=-1)
    	 {  
    		
    		f.write((char)x);
    	    i++;
    	    if(i%10 == 0) {
    	       System.out.println("10 characters are copied");
    	       sleep(500);
    	    }
    	 x=fr.read();
    	 

    		
    }
    	f.close();
}
}