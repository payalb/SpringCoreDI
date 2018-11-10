package inheritance_bean;

public class Address {
	String dno;
	String city;
	String state;
	String country;

	public Address(String dno, String city, String state, String country) {
		super();
		this.dno = dno;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [dno=" + dno + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}
