
public class BaseballRunner
	{

		public static void main(String[] args)
			{
				BatterData.loadData();
				BatterData.announceLineup();
				BatterInning.playInning();
			}

	}
