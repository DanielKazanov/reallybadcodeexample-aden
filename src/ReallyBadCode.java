
public class ReallyBadCode {

	private int doesSomething (String input) {
		int data=0;
		int index = 0;
		boolean negate = (input.charAt(index) == 45);
		if (negate) index++;
		for (; index < input.length(); index++) {
			data = data*10 + input.charAt(index)-48;
		}
		if (negate) data *= -1;
		return data;
	}
	
	public static void main(String[] args) {
		ReallyBadCode myCode = new ReallyBadCode();
	}

}
