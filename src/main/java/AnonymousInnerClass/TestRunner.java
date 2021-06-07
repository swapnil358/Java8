package AnonymousInnerClass;

public class TestRunner {

	public static void main(String[] args) {
		
		IPrintable p = new ConsolePrinterImpl();
		p.print();
		
		
		//IPrintable p = new IPrintable();	--> we can solve this using anonymous inner class
		//Find the secodn runner class
		
	}

}
