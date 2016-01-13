import java.util.Scanner;

public class InheritanceRunner
	{
		static int correct = 0;
		public static void main(String[] args)
			{
				//Question 1
				System.out.println("Here are your questions.");
				System.out.println("Would Bird b2 = new Wren(); throw an error at you?");
				Scanner user1nput = new Scanner(System.in);
				String choice = user1nput.nextLine();
				if(choice.equals("no") || choice.equals("No"))
					{
						System.out.println("That is correct.");
						correct++;
					}
				else
						System.out.println("Sorry, but that is wrong.");
				//Question 2
				System.out.println();
				System.out.println("Next question.");
				System.out.println("Would b2.runWrenMethod2 work?");
				String choice1 = user1nput.nextLine();
				if(choice1.equals("No") || choice1.equals("no"))
					{
						System.out.println("That is correct.");
						correct++;
					}
				else
						System.out.println("That is incorrect.");
				//Question 3
				System.out.println();
				System.out.println("Next question.");
				System.out.println("If X is the superclass and B and A both extended them, and C extended B, would... B b = new A() work?");
				String choice2 = user1nput.nextLine();
				if(choice2.equals("No") || choice2.equals("no"))
					{
						System.out.println("That is correct.");
						correct++;
					}
				else
					System.out.println("That is wrong.");
				//Question 4
				System.out.println();
				System.out.println("Next question.");
				System.out.println("Referring to the question above, would X.runAMethod work?");
				String choice3 = user1nput.nextLine();
				if()
//				Bird b1 = new Bird( );
//				Bird b2 = new Wren( );
//				Wren w1 = new Bird( );
//				Wren w2 = new Wren( );
//				b1.BirdMethod1( );
//				b1.BirdMethod2( );
//				b1.WrenMethod1( );
//				b1.WrenMethod2( );
//				b2.BirdMethod1( );
//				b2.BirdMethod2( );
//				b2.WrenMethod1( );
//				b2.WrenMethod2( );
//				w1.BirdMethod1( );
//				w1.BirdMethod2( );
//				w1.WrenMethod1( );
//				w1.WrenMethod2( );
//				w2.BirdMethod1( );
//				w2.BirdMethod2( );
//				w2.WrenMethod1( );
//				w2.WrenMethod2( );
			}
	}
