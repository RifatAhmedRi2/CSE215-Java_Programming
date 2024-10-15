
public class Tool {
	private int length;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Tool() {
	}

	Tool(int length){
		this.length=length;
	}

	public String display() {
		return "Length=" + length;
	}
}
