package helloworld;

public class Person {
	private String Name;
	private int Age;
	public Person(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
	}
	public Person(String Name) {
		this(Name,20);		
	}
	public Person() {
		Name="";
		Age=30;
	}
	public String getName(){
		return Name;
	}
	public int getAge() {
		return Age;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public void setAge(int Age) {
		this.Age=Age;
	}
	public String getInfo() {
		return ("Name: " + Name + "\nAge: " + Age);
	}
}

class Student extends Person{
	private String School;
	public Student(String Name, int Age, String School) {
		super(Name,Age);
		this.School = School;
	}
	public Student() {
		this.School="";
	}
	public String getSchool() {return School;}
	public void setSchool (String School) {
		this.School = School;
	}
	public String getInfo() {
		return (super.getInfo() + "\nSchool: " + School);
	}
	
}