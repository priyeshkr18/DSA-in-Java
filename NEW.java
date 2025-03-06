import java.util.Scanner;
class NEW{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = scanner.nextInt();
		System.out.println("Enter y: ");
		int y = scanner.nextInt();
		System.out.println("Enter z: ");
		int z = scanner.nextInt();
		int sum = x + y + z;

		System.out.println("Sum of x, y and z is: " + sum);
	}
}
