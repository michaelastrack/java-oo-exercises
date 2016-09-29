package Studio1;

public class baseballplayer {
	
		
		private String name;
		private int jersey;
		private String bats;
		private int games;
		private int rbi;
		private int runs;
		private int hits;
		
		public baseballplayer (String name, int jersey, String bats) {
			this.name = name;
			this.jersey = jersey;
			this.bats = bats;
			this.games = 0;
			this.rbi = 0;
			this.runs = 0;
			this.hits = 0;
		}

		public int getGames() {
			return games;
		}

		public int getRbi() {
			return rbi;
		}

		public int getRuns() {
			return runs;
		}

		public int getHits() {
			return hits;
		}
		public void playGame (int run, int hit, int rbi) {
			this.games = this.games + 1;
			this.hits = this.hits + hit;
			this.runs = this.runs + run;
			this.rbi = this.rbi + rbi;
		}
		
		public String toString () {
			return "Name: " + this.name + " Jersey No: " + this.jersey + " Bats: " + this.bats;
		}
		public String stats() {
			return "Games Played: " + this.games + " Runs Scored: " + this.runs + " Hits: " + this.hits + " RBI: " + this.rbi;
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseballplayer A = new baseballplayer ("Mike", 23, "right");
		A.playGame(1, 2, 2);
		A.playGame(1, 1, 2);
		A.playGame(0, 1, 0);
		A.playGame(2, 3, 4);
		A.playGame(0, 0, 0);
		System.out.println(A.toString());
		System.out.println(A.stats());
		

	}

}
