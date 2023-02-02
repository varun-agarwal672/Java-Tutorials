package OOPs;

public class Student {
	String name;
	int age;
	String address;
	
	Student(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public void getName() {
		System.out.println(this.name);
	}
	
	public static void main(String args[]) {
		Student varun = new Student("Varun",22,"Siliguri");
		varun.getName();
	}
}
