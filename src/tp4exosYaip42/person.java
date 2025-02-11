package tp4exosYaip42;

public class person {

	private String name;
	private String address;
	
	public person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", address=" + address + "]";
	}
	public static void main(String[] args) {
		person p1 = new person ("Gwenn", "39");
		System.out.println(p1);
	}
}
