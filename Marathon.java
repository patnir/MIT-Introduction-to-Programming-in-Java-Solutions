package practice1;

public class Marathon {
	public static void main(String[] arguments) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", 
				"Phil", "Matt", "Alex", "Emma", "John", "James",
				"Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };

		int[] times = { 341, 273, 278, 329, 445, 402, 388, 
				275, 243, 334, 412, 393, 299, 343, 317, 265 };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + times[i]);
		}
		fastestRunners(names, times);
	}
	public static void fastestRunners(String [] names, int [] values){
		int i;
		int fastest = 0;
		for (i = 0; i < values.length - 1; i++){
			if ( values [i] < values[i + 1]){
				fastest = i;
			}
			else {
				fastest = i + 1;
			}
		}
		System.out.println("The fastest runner is " + names[fastest] + " whose time in minutes is " + values[fastest]);
	}
}
