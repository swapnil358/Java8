package AnonymousInnerClass;

public class TestRunner2 {
	
	

	/*
	 * Java Anonymous inner --- class A class that have no name is known as anonymous
	 * inner class in java. It should be used if you have to override method of
	 * class or interface. Java Anonymous inner class can be created by two ways:
	 */

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
