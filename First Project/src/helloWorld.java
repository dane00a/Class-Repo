import java.util.Scanner;
public class helloWorld {
	public static void main(String []args){
		System.out.println("Hello World");
		int n1=0, n2=1, n3, i, count=47;
		System.out.print(n1+" "+n2);
		for (i=2; i<count; ++i){
			n3 = n1 + n2;
			System.out.print(" "+ n3);
			n1 = n2;
			n2 = n3;
		}
		int r1=0,r2=1,r3,count2=666;
		System.out.print(r1 + " " + r2);
		for (int k=0; k<count;k++){
			n3 = n1 + n2;
			if (n3 >= 10){
				String x = String.valueOf(n3);
				System.out.println(x);
			}
		}
		Scanner potato = new Scanner (System.in);
		System.out.print("Enter user input, or you DIE: ");
//		String user_input = potato.nextLine();
		String user_input = "HELLO CHILDREN I AM DA MAD MANE";
		System.out.println(user_input);
		String [] hellobaby = {"Hello", "Goodybye", "I", "Say", "Yes","You", "Say", "No"};
		
	}
}
