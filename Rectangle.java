import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
	int Width, Height;
	Scanner Keyboard = new Scanner(System.in);
	System.out.print("The Width is = ");
	Width = Keyboard.nextInt();
	System.out.print("The Height is = ");
	Height = Keyboard.nextInt();
	System.out.println("The perimeter is " + 2*(Width+Height));
	System.out.println("The Area is " + Width*Height);
	}	
}  

