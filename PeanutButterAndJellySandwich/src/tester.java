
public class tester {

	public static void main(String[] args) {
		PeanutButter pb = new PeanutButter("jiff", true, 100.0);
		System.out.print(pb.toString(pb));
		Bread b = new Bread();
		System.out.print(b.toString(b));
	}

}
