package spring.ioc.xml0607;

public class Student {
	
	private Integer number;
	private String name;
	private Gender gender;
	private Integer age;
	private String major;
	
	public Integer getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public Gender getGender() {
		return gender;
	}
	public Integer getAge() {
		return age;
	}
	public String getMajor() {
		return major;
	}
	
	public Student(Integer number, String name, Gender gender, Integer age, String major) {
		this.number = number;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.major = major;
	}
	
	
	
}
