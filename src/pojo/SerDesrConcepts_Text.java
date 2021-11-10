package pojo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDesrConcepts_Text {

	public static void main(String[] args) {
		Serializable_Student student = new Serializable_Student("John", 25, "US");

		// Serialization
		String fileName = "C:\\GK_Work\\codebase\\sele_learn_gk\\src\\resources\\SerDeser.txt";
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(fileName);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(student);

			fileOutputStream.close();
			objectOutputStream.close();

			System.out.println("Object Has Been Serialized : " + student);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// DeSerialization
		FileInputStream fileInputStream = null;
		ObjectInputStream inputStream = null;
		try {
			fileInputStream = new FileInputStream(fileName);
			inputStream = new ObjectInputStream(fileInputStream);
			Serializable_Student student2 = (Serializable_Student) inputStream.readObject();

			System.out.println("Object Has Been Deserialized " + student2);

			fileInputStream.close();
			inputStream.close();

		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

	}
}
