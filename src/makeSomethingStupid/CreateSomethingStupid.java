package makeSomethingStupid;

import java.util.Scanner;

public class CreateSomethingStupid
{
	public Scanner WordScanner;
	String travel;

	public CreateSomethingStupid()
	{
		WordScanner = new Scanner(System.in);

	}

	public void iTypedSomething()
	{
		System.out.println("Hello There");
		System.out.println("What is your name?");
		String whatsMyName = WordScanner.nextLine();
		System.out.println("Nice to meet you " + whatsMyName
				+ ". Would you like to go on an Adventure?");
		String adventure = WordScanner.nextLine();

		if (adventure.equalsIgnoreCase("yes"))
		{
			letsAdventure();
		}
		else if (adventure.equalsIgnoreCase("no"))
		{
			System.out.println("Aw lame, have a boring life then");
		}
		else
		{
			System.out
					.println("Sorry I dont understand you, come back when you speak english.");
		}
	}

	private void letsAdventure()
	{
		System.out.println("Yay let's adventure!");
		System.out.println("Shall we travel by land or by sea?");
		String landOrSea = WordScanner.nextLine();

		if (landOrSea.equalsIgnoreCase("land"))
		{
			landAdventure();
		}
		else if (landOrSea.equalsIgnoreCase("sea"))
		{
			seaAdventure();
		}
		else
			letsAdventure();
	}

	private void landAdventure()
	{
		System.out.println("We shall travel by train then.");
		System.out.println("Where shall we travel to?");
		travel = WordScanner.nextLine();
		System.out.println("We shall leave the next day then.");
		System.out.println("...");
		System.out.println("Narrator 'The next day'");
		System.out.println("Were now on a train on our way to " + travel);

		double myRandom = Math.random();
		int event = (int) (4 * myRandom);

		if (event == 0)
			continueLand();
		else if (event == 1)
		{
			trainHeist();
		}
		else if (event == 2)
		{
			trainCrash();
		}
		else if (event == 3)
		{
			trainStopped();
		}

	}

	private void continueLand()
	{
		System.out.println("We've arrived in the town of " + travel + ".");
		System.out
				.println("Should we find a hotel and relax for the day or go exploring?");
		System.out.println("Relax or explore");
		String relaxExplore = WordScanner.nextLine();
		if (relaxExplore.equalsIgnoreCase("relax"))
		{
			System.out
					.println("So now your comfy in the hotel relaxing in your bed.");
			System.out
					.println("Your very exhausted so you think you may just rest for a minute or two.");
			System.out
					.println("As you fall asleep you think you hear a door open but your too sleepy to notice.");
			System.out
					.println("You wake up to an excruciating pain in your stomach, as you realize you've been stabbed.");
			System.out.println("You are dead.");
			newGame();
		}
		else if (relaxExplore.equalsIgnoreCase("explore"))
		{
			System.out.println("Where do you want to search?");
			System.out.println("Hotel, bar, or market?");
			String search = WordScanner.nextLine();
			if (search.equalsIgnoreCase("hotel"))
			{
				searchHotel();
			}
			else if (search.equalsIgnoreCase("bar"))
			{
				searchBar();
			}
			else if (search.equalsIgnoreCase("market"))
			{
				searchMarket();
			}
		}
	}

	private void searchHotel()
	{
		System.out
				.println("You begin walking through the hallways of the hotel.");
		System.out.println("You hear some people fighting in one room.");
		System.out.println("And mostly quiet in the others.");
	}

	private void searchBar()
	{

	}

	private void searchMarket()
	{

	}

	private void trainHeist()
	{
		System.out.println("The train is being robbed by 3 robbers!");
		System.out.println("You could hide and wait it out.");
		System.out.println("You could try to stop them?");
		System.out.println("Or you can run for your life.");
		System.out.println("What shall you do? Hide, fight, or run");
		String whatToDo = WordScanner.nextLine();

		if (whatToDo.equalsIgnoreCase("Hide"))
		{
			System.out
					.println("You cower in your seat until they rob the sum of 5,000$ from the train and leave.");
			System.out.println("The train continues moving forward.");
			continueLand();
		}
		else if (whatToDo.equalsIgnoreCase("fight"))
		{
			System.out
					.println("You have no weapon to fight with, you can fight with your fists or look for a weapon.");
			System.out.println("Will you search, or fight");
			String fight = WordScanner.nextLine();
			if (fight.equalsIgnoreCase("fight"))
			{
				System.out
						.println("You run up to the robbers, fist ready to strike. One robber spots you and fires his gun into your head.");
				System.out.println("You are dead");
				newGame();
			}
			else if (fight.equalsIgnoreCase("search"))
			{
				System.out.println("You found a pen on the floor.");
				System.out
						.println("You could stab one of them with it, or you learned how to make a pen projectile as a child?");
				System.out.println("Will you stab, or shoot.");
				String stabShoot = WordScanner.nextLine();
				if (stabShoot.equalsIgnoreCase("stab"))
				{
					System.out
							.println("You run up to the robbers, pen ready to strike. One robber spots you and fires his gun into your head.");
					System.out.println("You are dead");
					newGame();
				}
				else if (stabShoot.equalsIgnoreCase("shoot"))
				{
					System.out.println("You create a Pen Projectile Launcher.");
					System.out
							.println("You fire it at the closest robber, piercing his chest and killing him.");
					System.out
							.println("The other robbers flee in fear leaving everybody unharmed.");
					continueLand();
				}
			}
		}
		else if (whatToDo.equalsIgnoreCase("run"))
		{
			System.out.println("You run out the door and safely escape.");
			continueLand();
		}
	}

	private void trainCrash()
	{
		System.out
				.println("A horse ran in front of the train and got ran over.");
		System.out
				.println("This caused the train to violently crash and kill everybody.");
		System.out.println("You are dead.");
		newGame();
	}

	private void trainStopped()
	{
		System.out.println("The train has run out of gas.");
		System.out.println("Will you continue on foot or wait for help?");
		System.out.println("Continue or wait?");
		String wait = WordScanner.nextLine();
		if (wait.equalsIgnoreCase("continue"))
		{
			System.out
					.println("You continue out into the brutal desert on foot and continue to push yourself until");
			System.out
					.println("you eventually die of dehydration, starvation, and heat.");
			System.out.println("You are dead.");
			newGame();
		}
		else if (wait.equalsIgnoreCase("wait"))
		{
			System.out
					.println("You wait for a day until the train gets emergency supplies and fuels up.");
			System.out.println("You are now back on track.");
			continueLand();
		}
	}

	private void seaAdventure()
	{

	}

	private void newGame()
	{
		System.out.println("Play again? Yes, or No.");
		String play = WordScanner.nextLine();
		if (play.equalsIgnoreCase("yes"))
		{
			iTypedSomething();
		}
		else
			System.out.println("Goodbye then. Lets adventure again soon.");
	}
}
