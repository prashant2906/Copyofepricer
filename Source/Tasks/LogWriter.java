package Tasks;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class LogWriter
	{
	
	private final static String filePath = "C:\\Users\\IBM_ADMIN\\Desktop\\";
	
	private static FileWriter fr = null;
	private static BufferedWriter br = null;
	
	private static void createFile(){
		
		try{
			 fr=new FileWriter(filePath+"logs.txt");
			 br=new BufferedWriter(fr);
		}catch(Exception e){
			
		}
		
	}
		
	
	public static void writeLogs(String log)
	{
			try{
				isFilePresent();	
				
				br.write(log);
				br.newLine();
	//			br.close();
			}
			catch(Exception e){	
				e.printStackTrace();
				
			}
	}
	
	private static void isFilePresent(){
		
		
		try{
			File file = new File(filePath+"logs.txt");
			
			if(!file.exists()){
				 createFile();
			}
//			else{
//				
//				fr = new FileWriter(file, true);
//			}
//			
//			if(br==null)
//				 br=new BufferedWriter(fr);
//			
		}catch(Exception e){
			
		}
	}
	
	public static void closeFile(){
		try{
			br.close();
		}catch(Exception e){
			
		}
		
	}
	
	}
