package MoreAboutLamdaImplemtation;


@FunctionalInterface	//We can annotate interface as @FunctionalInterface to let other people know this is functional interface
public interface IPrintable {
	
	
	//Funtional Interface ---> the interface that can have only one abstract method
	//But it can have multiple non abstract method as below, below methods are default and static method
	
	public abstract void print(String a);
	
	//It will give an error in TestRunner -bcoz Functional interface can have only one abstract method
	
	//public abstract void print2(); 
	
	default void scan() {
		System.out.println("scanning");
	}
	
	static void printToConsole() {
		System.out.println("printing to console");
	}
	
	default void scanAsPDF() {
		System.out.println("Scanning as PDF");
	}
}
