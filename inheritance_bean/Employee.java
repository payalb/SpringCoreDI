package inheritance_bean;

public class Employee {
	private int id;
	private String name;
	Address a;
	
	void im(){
		System.out.println("Init method called ");
		
	}
	void dm(){
		System.out.println("Destroy method called ");
		
	}
	public Employee() {
		System.out.println("Employee object crated ");
	}
	public Employee(int id, String name, Address a) {
		super();
		this.id = id;
		this.name = name;
		this.a = a;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", a=" + a + "]";
	}
	
	
	

}
