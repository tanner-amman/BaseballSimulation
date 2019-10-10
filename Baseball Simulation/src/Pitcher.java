
public class Pitcher
	{
		private String name;
		private String leftOrRight;
		private double earnedRunAverage;
		private double pitcherBattingAverage;
		private double pitcherSingleAverage;
		private double pitcherDoubleAverage;
		private double pitcherTripleAverage;
		private double pitcherHomeRunAverage;
		private double pitcherStrikeoutAverage;
		private double pitcherWalkAverage;
		private double pitcherHitByPitchAverage;
		
		public Pitcher (String n, String lor, double era, double pba, double psa, double pda, double pta, double phra, double psoa, double pwa, double phbpa)
		{
			name = n; 
			leftOrRight = lor;
			earnedRunAverage = era;
			pitcherBattingAverage = pba;
			pitcherSingleAverage = psa;
			pitcherDoubleAverage = pda;
			pitcherTripleAverage = pta;
			pitcherHomeRunAverage = phra;
			pitcherStrikeoutAverage = psoa;
			pitcherWalkAverage = pwa;
			pitcherHitByPitchAverage = phbpa;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getLeftOrRight()
			{
				return leftOrRight;
			}

		public void setLeftOrRight(String leftOrRight)
			{
				this.leftOrRight = leftOrRight;
			}

		public double getEarnedRunAverage()
			{
				return earnedRunAverage;
			}

		public void setEarnedRunAverage(double earnedRunAverage)
			{
				this.earnedRunAverage = earnedRunAverage;
			}

		public double getPitcherBattingAverage()
			{
				return pitcherBattingAverage;
			}

		public void setPitcherBattingAverage(double pitcherBattingAverage)
			{
				this.pitcherBattingAverage = pitcherBattingAverage;
			}

		public double getPitcherSingleAverage()
			{
				return pitcherSingleAverage;
			}

		public void setPitcherSingleAverage(double pitcherSingleAverage)
			{
				this.pitcherSingleAverage = pitcherSingleAverage;
			}

		public double getPitcherDoubleAverage()
			{
				return pitcherDoubleAverage;
			}

		public void setPitcherDoubleAverage(double pitcherDoubleAverage)
			{
				this.pitcherDoubleAverage = pitcherDoubleAverage;
			}

		public double getPitcherTripleAverage()
			{
				return pitcherTripleAverage;
			}

		public void setPitcherTripleAverage(double pitcherTripleAverage)
			{
				this.pitcherTripleAverage = pitcherTripleAverage;
			}

		public double getPitcherHomeRunAverage()
			{
				return pitcherHomeRunAverage;
			}

		public void setPitcherHomeRunAverage(double pitcherHomeRunAverage)
			{
				this.pitcherHomeRunAverage = pitcherHomeRunAverage;
			}

		public double getPitcherStrikeoutAverage()
			{
				return pitcherStrikeoutAverage;
			}

		public void setPitcherStrikeoutAverage(double pitcherStrikeoutAverage)
			{
				this.pitcherStrikeoutAverage = pitcherStrikeoutAverage;
			}

		public double getPitcherWalkAverage()
			{
				return pitcherWalkAverage;
			}

		public void setPitcherWalkAverage(double pitcherWalkAverage)
			{
				this.pitcherWalkAverage = pitcherWalkAverage;
			}

		public double getPitcherHitByPitchAverage()
			{
				return pitcherHitByPitchAverage;
			}

		public void setPitcherHitByPitchAverage(double pitcherHitByPitchAverage)
			{
				this.pitcherHitByPitchAverage = pitcherHitByPitchAverage;
			}
		
		
	}
