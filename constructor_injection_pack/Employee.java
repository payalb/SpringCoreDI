package constructor_injection_pack;

public class Employee {
	private int id;
	private String name;
	String o;

	public Employee() {
		System.out.println("def cons");
	}

	public Employee(int id) {
		this.id = id;
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(int id, String name) { // 2 param  

		this.id = id;
		this.name = name;

	}

	public Employee(int id, String name, String s) { // 3 param 

		this.id = id;
		this.name = name;
		o = s;
		// System.out.println("GOT third parameter "+o);

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=  " + name + "]";
	}

	void show() {
		System.out.println(id + " " + name + "Third Param   " + o);
	}
}
