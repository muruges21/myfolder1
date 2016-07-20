import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
	    StringBuffer convertToStr = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for reversing it : ");
	    convertToStr.append(sc.nextLine());
		System.out.println("The reverse of given number is : "+convertToStr.reverse());
	}

}
