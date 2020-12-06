package helloworld;



public class HelloWord{
	public static void main (String ages[]) {
		Person p; 
		p = new Person("ABC",123);
		System.out.println(p.getInfo());
		p.setName("KKK");
		p.setAge(10);
		System.out.println(p.getInfo());
		Student st = new Student();
		System.out.println(st.getSchool());
		st.setName("KOKO");
		st.setAge(40);
		st.setSchool("social");
		System.out.println(st.getInfo());
		
	}
}
