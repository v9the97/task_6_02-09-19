import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileContainShowAndDelete {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file=new File("D:/vinod/recodetask6/text.txt");
		FileReader fr=new FileReader(file);
		BufferedReader bf=new BufferedReader(fr);
		int ch;
		while((ch=bf.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fr.close();
		file.delete();
		
		
		
	}

}
