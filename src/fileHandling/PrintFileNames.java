package fileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintFileNames {

	public static void main(String[] args) {

		String path = "C:\\GK_Work\\gk\\codebase_gk\\java_sessions_basics\\src\\fileHandling";

		File file = new File(path);
		File[] files = file.listFiles();
		Arrays.sort(files);
		for (File file2 : files) {
			if (file2.isFile()) {
				System.out.println("File :" + file2.getName());
			} else if (file2.isDirectory()) {
				System.out.println("Directory :" + file2.getName());
			} else {
				System.out.println("Not Known");
			}
		}
	}
}
