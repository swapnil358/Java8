package AnonymousInnerClass;

public class TestRunner2 {

	public static void main(String[] args) {

		// Annonymous innner class
		IPrintable obj = new IPrintable() {

			@Override
			public void print() {
				System.out.println("From anonymous inner class");

			}

		};
		IPrintable obj1 = new IPrintable() {

			@Override
			public void print() {
				System.out.println("From anonymous inner class test");
			}
		};
		obj.print();
		obj1.print();

	}

}
