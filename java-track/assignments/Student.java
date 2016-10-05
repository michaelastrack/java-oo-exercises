
public class Student {
	
	private String firstname;
	private String lastname;
	private String Name;
	private int StudentID;
	private String ClassStanding;
	private int Credits;
	private double GPA;
	private double qualityScore;
	
	public Student (String firstname, String lastname, int ID) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.Name = firstname + " " + lastname;
		this.StudentID = ID;
		this.Credits = 0;
		this.GPA = 0;
		this.ClassStanding = "Freshman";
		this.qualityScore = 0.0;
	}
	
	public Student (String firstname, String lastname, int ID, double GPA, int Credits) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.Name = firstname + " " + lastname;
		this.StudentID = ID;
		this.Credits = Credits;
		this.GPA = GPA;
		this.ClassStanding = "";
		this.qualityScore = 0.0;		
	}

	public String getName() {
		return this.Name;
	}

	public int getStudentID() {
		return this.StudentID;
	}

	public int getCredits() {
		return this.Credits;
	}

	public double getGPA() {
		return this.GPA;
	}
	
	public double getqualityScore () {
		return this.qualityScore;
	}

	public void setQualityScore(double qualityScore) {
		this.qualityScore = qualityScore;
	}

	public void setCredits(int credits) {
		this.Credits = credits;
	}

	public void setGPA(double gPA) {
		this.GPA = gPA;
	}

	public String getClassStanding () {
		String standing = "";
		if (this.getCredits() < 30) {
			standing = "Freshman";
		}
		else if (this.getCredits() < 60) {
			standing = "Sophomore";
		}
		else if (this.getCredits() < 90) {
			standing = "Junior";
		}
		else if (this.getCredits() >= 90) {
			standing = "Senior";
		}
		return standing;
	}
	
	public void submitGrade (double grade, int credits) {
		double q = this.getqualityScore();
		q = q + (grade * credits);
		int c = this.getCredits();
		c = c + credits;
		double g = q/c;
		// Rounding GPA
		g = g*1000;
		g = Math.round(g);
		g = (double) g/1000;
		
		this.setGPA(g);
		this.setCredits(c);
		this.setQualityScore(q);
	}
	public double computeTuition () {
		int semesters = this.getCredits()/15;
		if (this.getCredits() % 15 != 0) {
			semesters++;
		}
		double t = 20000 * semesters;
		return t;
	}
	
	public Student createLegacy (Student parent2) {
		String firstname = this.getName();
		String lastname = parent2.getName();
		int ID = this.getStudentID() + parent2.getStudentID();
		double GPA = (this.getGPA() + parent2.getGPA())/2.0;
		int credits = Math.max(this.getCredits(), parent2.getCredits());
		return new Student (firstname, lastname, ID, GPA, credits);
	}
	
	public String toString () {
		return "Name: " + this.Name + " Student ID: " + this.StudentID;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
