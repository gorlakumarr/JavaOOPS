package pojo;

import java.io.Serializable;

public class Serializable_Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String address;

	public Serializable_Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return ("Student Name is " + this.getName() + ", age is " + this.age + ", and address is " + this.address);

	}
}
