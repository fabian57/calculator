import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String item;
        double a, b;
		
		boolean exit = false;
				
		System.out.println("What do you want to do: ");
		System.out.println("1: Add");
		System.out.println("2: Substract");
		System.out.println("3: Multiplicate");
		System.out.println("4: Divide");
		item = in.nextLine();
		switch(item) {
			case "1":
                System.out.println("\na = ");
                a = in.nextDouble();
                System.out.println("\nb = ");
                b = in.nextDouble();
                System.out.println("\na + b = " + add(a, b));
				break;
			case "2":
                System.out.println("\na = ");
                a = in.nextDouble();
                System.out.println("\nb = ");
                b = in.nextDouble();
                System.out.println("\na - b = " + substract(a, b));
				break;
			case "3":
                System.out.println("\na = ");
                a = in.nextDouble();
                System.out.println("\nb = ");
                b = in.nextDouble();
                System.out.println("\na * b = " + mult(a, b));
				break;
			case "4":
                System.out.println("\na = ");
                a = in.nextDouble();
                System.out.println("\nb = ");
                b = in.nextDouble();
                System.out.println("\na / b = " + divide(a, b));
				break;
			case "0":
			default:
				exit = true;
				in.close();
				System.out.println("\nGoodbye");
		}

	}

    public static double add(double a, double b){
        return a + b;
    }

    public static double substract(double a, double b){
        return a - b;
    }

    public static double mult(double a, double b){
        return a * b;
    }

    public static double divide(double a, double b){
        try {
            if (b == 0) {
                throw new IllegalArgumentException();
            }
            return a / b;
        } catch (IllegalArgumentException e) {
            System.out.println("Division by 0");
            return Double.NaN;
        }
    }
}
