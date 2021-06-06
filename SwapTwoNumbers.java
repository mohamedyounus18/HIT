package basics;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 120, second= 220;
		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		// Value of first is assigned to temporary
		int temporary = first;
		// Value of second is assigned to first
		first = temporary;
		// Value of temporary (which contains the initial value of first) is assigned to second
		second = first;
		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);

	}

}
