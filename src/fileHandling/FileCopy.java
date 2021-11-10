package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		fileCopy();
	}

	public static void fileCopy() {

		File inputFile = new File("C:\\GK_Work\\gk\\codebase_gk\\java_sessions_basics\\src\\fileHandling\\Sample.pdf");

		File ouputFile = new File(
				"C:\\GK_Work\\gk\\codebase_gk\\java_sessions_basics\\src\\fileHandling\\Sample_Copy.pdf");

		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		try {
			fileInputStream = new FileInputStream(inputFile);
			fileOutputStream = new FileOutputStream(ouputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(fileInputStream.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
		int i = 0;
		try {
			while ((i = fileInputStream.read()) != -1) {
				fileOutputStream.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			if (fileInputStream != null)
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (fileOutputStream != null)
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
