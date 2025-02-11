package tp4exosYaip46;

public class mammal extends animal {
	
	public mammal(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "mammal [animal[name=" + super.toString() + "]";
	}

	
}
