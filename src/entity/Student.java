package entity;

public class Student {
	private String ClassRoom;
	private String name;
	private int sex;
	private int age;
	public String getClassRoom() {
		return ClassRoom;
	}
	public void setClassRoom(String classRoom) {
		ClassRoom = classRoom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String classRoom, String name, int sex, int age) {
		super();
		ClassRoom = classRoom;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
}
