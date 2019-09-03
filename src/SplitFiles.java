

import java.io.*;
import java.util.Scanner;

public class SplitFiles {

	
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter file name ");
		String userfile=sc.next();
		File file = new File("D:/vinod/recodetask6/"+userfile);
		
		FileReader fr = new FileReader(file);
		
		System.out.println("please enter total numbeof new file  ");
		
		
		int ch, part , fcontain,odd=0;
		part=sc.nextInt();
		int j = 1;
		FileWriter fw = null;
		if((int) file.length() %part!=0)
		{
			odd=1;
		}
		fcontain = (int) file.length() / part;
		for (int i = 1; i <= part; i++) {
			File file1 = new File("D:/vinod/recodetask6/" + i + "test.txt");
			fw = new FileWriter(file1);
			while (j < fcontain * i)// (ch=fr.read())!=-1)
			{
				fw.write(fr.read());
				j++;
			}
			if(odd==1&&i==part)
			{
				fw.write(fr.read());
			}
			else
			fw.close();
		}

		fr.close();

		fw.close();
	}
}
