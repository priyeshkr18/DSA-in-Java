import java.util.*;
public class INPUT {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Welcome " + name);

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		if(age >= 18){
			System.out.println("You are an adult");
		}
		else{
			System.out.println("You are a minor");
		}


		System.out.println("THANK YOU!!");



	}
}
