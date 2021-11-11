//package pojo;
//
//import java.io.FileInputStream;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//
//import com.google.gson.Gson;
//
//public class Jackson_SerDesrConcepts_JSON {
//
//	public static void main(String[] args) throws IOException {
//
//		Serializable_Student student = new Serializable_Student("John", 25, "US");
//
//		// Serialization
//		Gson gson = new Gson();
//		String jsonString = gson.toJson(student);
//		String fileName = "C:\\GK_Work\\codebase\\sele_learn_gk\\src\\resources\\SerDeserJSON.json";
//		FileWriter writer = new FileWriter(fileName);
//		writer.write(jsonString);
//		System.out.println("Object Has Been Serialized {} : " + jsonString);
//		writer.close();
//
//		// DeSerialization
//		FileInputStream fileInputStream = null;
//		ObjectInputStream inputStream = null;
//		try {
//			fileInputStream = new FileInputStream(fileName);
//			inputStream = new ObjectInputStream(fileInputStream);
//			Serializable_Student student2 = (Serializable_Student) inputStream.readObject();
//
//			System.out.println("Object Has Been Deserialized " + student2);
//
//			fileInputStream.close();
//			inputStream.close();
//
//		} catch (ClassNotFoundException | IOException e) {
//			e.printStackTrace();
//		}
//		Serializable_Student student22 = gson.fromJson(jsonString, Serializable_Student.class);
//		System.out.println("Object Has Been Deserialized {} : " + student22);
//
//	}
//}
