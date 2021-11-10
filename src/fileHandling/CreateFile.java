package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
	public static void main(String[] args) {
		String path = "C:\\GK_Work\\gk\\codebase_gk\\java_sessions_basics\\src\\fileHandling\\NewFile.txt";

		// 1
		File file = new File(path);
		try {
			boolean fileCheck = file.createNewFile();
			if (fileCheck) {
				System.out.println("File Created");
			} else {
				System.out.println("File is already present");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 2
		Scanner scanner = null;
		FileOutputStream fileOutputStream = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter File Name");
			String fileName = scanner.nextLine();

			fileOutputStream = new FileOutputStream(fileName, false);// True --> Text will be Appended

			System.out.println("Enter the File Content :");
			String content = scanner.nextLine();
			byte[] b = content.getBytes();
			fileOutputStream.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileOutputStream.close();
				scanner.close();
				System.out.println("File is Saved");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
