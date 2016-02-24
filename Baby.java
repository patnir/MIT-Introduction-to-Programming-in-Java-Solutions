package practice1;

public class Baby {
	String name;
	boolean isMales;
	double weight;
	double decibels;
	int numPoops = 0;
	void speak(){
		System.out.println("My name is " + name + " and I weigh " + weight + " kilograms");
	}
	void poop (){
		System.out.println("Dear mother, I have pooped. Ready the diaper");
	}
}
