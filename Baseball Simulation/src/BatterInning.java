import java.util.Scanner;
public class BatterInning 
{
	public static void playInning()
	{
		
		BatterData.loadData();
		int inningCounter = 1;
		int outCounter = 0;
		int batterScore = 0;
		int opponentScore = 0;
		boolean onFirstBase = false;
		boolean onSecondBase = false;
		boolean onThirdBase = false;
		boolean onHome = false;
		while (inningCounter < 10)
		{
		while (outCounter < 3)
		{
		for (int i = 0; i < 9; i++)
		{
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Press space to swing");
		String swing = input.nextLine();
		double toOnBase = BatterData.batters.get(i).getOnBasePercentage() * 100;
		Double newOnBase = new Double(toOnBase);
		int onBase = newOnBase.intValue();
		int ifOnBase = (int) (Math.random() * 1000 + 1);
		if (ifOnBase <= onBase)
		{
			int typeOfHit = (int) (Math.random() * 1000 + 1);
			
			double toSingle = BatterData.batters.get(i).getSingleAverage() * 100;
			Double newSingle = new Double(toSingle);
			int single = newSingle.intValue();
			
			double toDouble = BatterData.batters.get(i).getDoubleAverage() * 100;
			Double newDouble = new Double(toDouble);
			int hitDouble = newDouble.intValue();
			
			double toTriple = BatterData.batters.get(i).getTripleAverage() * 100;
			Double newTriple = new Double(toTriple);
			int triple = newTriple.intValue();
			
			double toHomeRun = BatterData.batters.get(i).getHomeRunAverage() * 100;
			Double newHomeRun = new Double(toHomeRun);
			int homeRun = newHomeRun.intValue();
			
			double toWalk = BatterData.batters.get(i).getWalkAverage() * 100;
			Double newWalk = new Double(toWalk);
			int walk = newWalk.intValue();
			
			double toHitByPitch =  BatterData.batters.get(i).getHitByPitchAverage() * 100;
			Double newHBP = new Double(toHitByPitch);
			int hitByPitch = newHBP.intValue();
			
			int doubleCompare = single + hitDouble;
			int tripleCompare = doubleCompare + triple;
			int homeRunCompare = tripleCompare + homeRun;
			int walkCompare = homeRunCompare + walk;
			int hbpCompare = walkCompare + hitByPitch;
			
			if (typeOfHit <= single)
			{
				System.out.println(BatterData.batters.get(i).getName() + " got a single!");
				onFirstBase = true;
			}
			else if (typeOfHit <= doubleCompare)
			{
				System.out.println(BatterData.batters.get(i).getName() + " got a double!");
				 onSecondBase = true;
			}
			else if (typeOfHit <= tripleCompare)
			{
				System.out.println(BatterData.batters.get(i).getName() + " got a triple!");
				onThirdBase = true;
			}
			else if(typeOfHit <= homeRunCompare)
			{
				System.out.println(BatterData.batters.get(i).getName() + " got a home run!");
				onHome = true;
			}
			else if (typeOfHit <= walkCompare)
			{
				System.out.println(BatterData.batters.get(i).getName() + " got walked!");
				onFirstBase = true;
			}
			else if (typeOfHit <= hbpCompare)
			{
				System.out.println(BatterData.batters.get(i).getName() + " got hit by the pitch!");
			}
			System.out.println();
		}
		else if (ifOnBase >= onBase)
		{
			System.out.println(BatterData.batters.get(i).getName() + " got out!");
			outCounter += 1;
		}
		}
		}
		System.out.println("Opponent's turn to hit");
		opponentScore = (int) (Math.random() * 1000 + 1);
		if (opponentScore > 500)
		{
			System.out.println("The opponent scored one run that inning!");
		}
		else 
		{
			System.out.println("The opponent didn't score that inning!");
		}
		inningCounter += 1;
		}
	}
}
