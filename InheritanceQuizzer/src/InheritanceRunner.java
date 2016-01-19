import java.util.Scanner;

public class InheritanceRunner
	{
		static int correct = 0;
		public static void main(String[] args)
			{
				System.out.println("Bird b1 = new Bird()");
				System.out.println("Bird b2 = new Wren()");
				System.out.println("Wren w1 = new Bird()");
				System.out.println("Wren w2 = new Wren()");
				//Question 1
				System.out.println("Here are your questions.");
				System.out.println("Would Bird b2 = new Wren(); throw an error at you?");
				Scanner user1nput = new Scanner(System.in);
				String choice = user1nput.nextLine();
				if(choice.equals("No") || choice.equals("no"))
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
				System.out.println("If X is the superclass and B and A both extended them, and C extended B, would... B b1 = new A() work?");
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
				System.out.println("Referring to the question above, would x1.runAMethod work?");
				String choice3 = user1nput.nextLine();
				if(choice3.equals("No") || choice3.equals("no"))
					{
						System.out.println("You are correct.");
						correct++;
					}
				else
					System.out.println("That is wrong.");
				//Question 5
				System.out.println();
				System.out.println("Next question.");
				System.out.println("If Dog and Cat extend Animal and Lion extends Cat, would Lion.runAnimalMethod() work?");
				String choice4 = user1nput.nextLine();
				if(choice4.equals("Yes") || choice4.equals("yes"))
					{
						System.out.println("That is correct.");
						correct++;
					}
				else
					System.out.println("That is wrong.");
				//Question 6
				System.out.println();
				System.out.println("Next question.");
				System.out.println("If Lambo and Ferrari extend NiceCars and LamboElemento extends Lambo, would Lambo l1 = new NiceCars(); work?");
				String choice5 = user1nput.nextLine();
				if(choice5.equals("No") || choice5.equals("no"))
					{
						System.out.println("That is correct.");
						correct++;
					}
				else
					System.out.println("That is wrong.");
				//Question 7
				System.out.println();
				System.out.println("Next question.");
				System.out.println("If Lambo and Ferrari extend NiceCars and LamboElemento extends Lambo, would LamboElemento.runFerrariMethod(); work?");
				String choice6 = user1nput.nextLine();
				if(choice6.equals("No") || choice6.equals("no"))
					{
						System.out.println("That is correct.");
						correct++;
					}
				else
					System.out.println("That is wrong.");
				//Question 8
				System.out.println();
				System.out.println("Next question.");
				System.out.println("If Lambo and Ferrari extend NiceCars and LamboElemento extends Lambo, would NiceCars.runFerrariMethod(); work?");
				String choice7 = user1nput.nextLine();
				if(choice7.equals("No") || choice7.equals("no"))
					{
						System.out.println("That is correct.");
						correct++;
					}
				else
					System.out.println("That is wrong.");
				//Question 9
				System.out.println();
				System.out.println("Next question.");
				System.out.println("If Lambo and Ferrari extend NiceCars and LamboElemento extends Lambo, would Lambo.runFerrariMethod(); work?");
				String choice8 = user1nput.nextLine();
				if(choice8.equals("No") || choice8.equals("no"))
					{
						System.out.println("That is correct.");
						correct++;
					}
				else
					System.out.println("That is wrong.");
				//Question 10
				System.out.println();
				System.out.println("Next question.");
				System.out.println("Referring to the previous question, would that run with super?");
				String choice9 = user1nput.nextLine();
				if(choice9.equals("No") || choice9.equals("no"))
					{
						System.out.println("That is correct.");
						correct++;
					}
				else
					System.out.println("That is wrong.");
				//Question 11
				System.out.println();
				System.out.println("Next question.");
				System.out.println("If Lambo and Ferrari extend NiceCars and LamboElemento extends Lambo, would NiceCars.runFerrariMethod(); work?");
				String choice10 = user1nput.nextLine();
				if(choice10.equals("No") || choice10.equals("no"))
					{
						System.out.println("That is correct.");
						correct++;
					}
				else
					System.out.println("That is wrong.");
				//Question 12
				System.out.println();
				System.out.println("Next question.");
				System.out.println("Adding a new one under Ferrari named Italia, would Italia.runFerrariMethod() work?");
				String choice11 = user1nput.nextLine();
				if(choice11.equals("Yes") || choice11.equals("yes"))
					{
						System.out.println("That is correct.");
						correct++;
					}
				else
					System.out.println("That is wrong.");
				//Question 13
				System.out.println();
				System.out.println("Next question.");
				System.out.println("Now I'm going to add something. Assume NiceCars and Italia both have a runSmooth(); method. Would the runSmooth() method run in the super class if the Italia method is called with a super?");
				String choice12 = user1nput.nextLine();
				if(choice12.equals("Yes") || choice12.equals("yes"))
					{
						System.out.println("That is correct.");
						correct++;
					}
				else
					System.out.println("That is wrong.");
				//Question 14
				System.out.println();
				System.out.println("Next question.");
				System.out.println("");
				String choice13 = user1nput.nextLine();
				if(choice13.equals("No") || choice13.equals("no"))
					{
						System.out.println("That is correct.");
						correct++;
					}
				else
					System.out.println("That is wrong.");
			}
	}
