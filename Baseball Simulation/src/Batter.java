
public class Batter
	{

		private String position;
		private String leftOrRight;
		private String name;
		private double onBasePercentage;
		private double singleAverage;
		private double doubleAverage;
		private double tripleAverage;
		private double homeRunAverage;
		private double walkAverage;
		private double strikeoutAverage;
		private double hitByPitchAverage;

		public Batter(String p, String lor, String n, double obp, double sa, double da, double ta, double hra, double wa, double soa,
				double hbpa)
			{
				position = p;
				leftOrRight = lor;
				name = n;
				onBasePercentage = obp;
				singleAverage = sa;
				doubleAverage = da;
				tripleAverage = ta;
				homeRunAverage = hra;
				walkAverage = wa;
				strikeoutAverage = soa;
				hitByPitchAverage = hbpa;
			}

		public String getPosition()
			{
				return position;
			}

		public void setPosition(String position)
			{
				this.position = position;
			}

		public String getLeftOrRight()
			{
				return leftOrRight;
			}

		public void setLeftOrRight(String leftOrRight)
			{
				this.leftOrRight = leftOrRight;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public double getOnBasePercentage()
			{
				return onBasePercentage;
			}

		public void setOnBasePercentage(double onBasePercentage)
			{
				this.onBasePercentage = onBasePercentage;
			}

		public double getSingleAverage()
			{
				return singleAverage;
			}

		public void setSingleAverage(double singleAverage)
			{
				this.singleAverage = singleAverage;
			}

		public double getDoubleAverage()
			{
				return doubleAverage;
			}

		public void setDoubleAverage(double doubleAverage)
			{
				this.doubleAverage = doubleAverage;
			}

		public double getTripleAverage()
			{
				return tripleAverage;
			}

		public void setTripleAverage(double tripleAverage)
			{
				this.tripleAverage = tripleAverage;
			}

		public double getHomeRunAverage()
			{
				return homeRunAverage;
			}

		public void setHomeRunAverage(double homeRunAverage)
			{
				this.homeRunAverage = homeRunAverage;
			}

		public double getWalkAverage()
			{
				return walkAverage;
			}

		public void setWalkAverage(double walkAverage)
			{
				this.walkAverage = walkAverage;
			}

		public double getStrikeoutAverage()
			{
				return strikeoutAverage;
			}

		public void setStrikeoutAverage(double strikeoutAverage)
			{
				this.strikeoutAverage = strikeoutAverage;
			}

		public double getHitByPitchAverage()
			{
				return hitByPitchAverage;
			}

		public void setHitByPitchAverage(double hitByPitchAverage)
			{
				this.hitByPitchAverage = hitByPitchAverage;
			}
		
	}
