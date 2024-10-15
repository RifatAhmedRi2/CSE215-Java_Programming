
public class Pet {
	private String name;
	private char type;
	
	public Pet() {
	}
	
	public Pet(String name, char type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", Type=" + type;
	}
}
