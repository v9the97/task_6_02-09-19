

import java.io.File;
import java.util.Scanner;

public class RenameFile {

	public static void main(String[] args) {

		String oldfile, newfile;
		byte check;

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter file name to rename");
		oldfile = sc.next();
		File tempFile = new File(oldfile);
		if (tempFile.exists() && tempFile.isFile()) {
			System.out.println("please enter  new file name");
			newfile = sc.next();
			check = (byte) tempFile.length();
			if (check < 500) {
				File tempFile1 = new File(newfile);
				if (tempFile1.exists()) {
					System.out.println("file name already exits please enter new name ");
				} else {
					tempFile.renameTo(tempFile1);
					System.out.println("file name changed ");
				}

			}
		} else {
			System.out.println("file is too big ");
		}

	}

}
