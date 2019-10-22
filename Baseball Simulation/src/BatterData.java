import java.util.ArrayList;
import java.util.Scanner;
public class BatterData
	{
		static ArrayList <Batter> batters = new ArrayList <Batter>();
		public static void loadData ()
		{
			batters.add(new Batter("Catcher", "Right", "Jonathan Lucroy", .310, .554, .106, .012, .084, .253, .146, .048));
			batters.add(new Batter("First Base", "Right", "Albert Pujols", .305, .452, .133, .000, .139, .265, .125, .018));
			batters.add(new Batter("Second Base", "Right", "Luis Rengifo", .321, .477, .138, .023, .054, .308, .229, .038));
			batters.add(new Batter("Shortstop", "Right", "Andrelton Simmons", .309, .618, .145, .000, .053, .190, .089, .015));
			batters.add(new Batter("Third Base", "Right", "David Fletcher", .350, .554, .106, .012, .084, .253, .146, .048));
			batters.add(new Batter("Left Field", "Right", "Justin Upton", .310, .554, .106, .012, .084, .253, .146, .048));
			batters.add(new Batter("Center Field", "Right", "Mike Trout", .310, .554, .106, .012, .084, .253, .146, .048));
			batters.add(new Batter("Right Field", "Right", "Kole Calhoun", .310, .554, .106, .012, .084, .253, .146, .048));
			batters.add(new Batter("Designated Hitter", "Right", "Shoeni Ohtani", .310, .554, .106, .012, .084, .253, .146, .048));
		}
		public static void announceLineup()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("What would you like your team name to be?");
			String teamName = input.nextLine();
			System.out.println("Hello " + teamName + "! Here is your lineup for today!");
			for (Batter s : batters)
			{
				System.out.println(s.getName());
			}
		}
	}
