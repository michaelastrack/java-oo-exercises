import java.util.Objects;

public class Student {
	

	private String Name;
	private int StudentID;
	private int Credits;
	private double GPA;
	private double qualityScore;
	
	public Student (String firstname, String lastname, int ID) {
		this.Name = firstname + " " + lastname;
		this.StudentID = ID;
		this.Credits = 0;
		this.GPA = 0;
		this.qualityScore = 0.0;
	}
	
	public Student (String firstname, String lastname, int ID, double GPA, int Credits) {
		this.Name = firstname + " " + lastname;
		this.StudentID = ID;
		this.Credits = Credits;
		this.GPA = GPA;
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
		double t;
		int s = this.getCredits()/15;
		int c = this.getCredits()%15;
		//System.out.println(c);
		//System.out.println(s);
		t = (s*20000) + (c*1333.33);
		return t;
	}
	
	public static Student createLegacy (Student parent1, Student parent2) {
		String firstname = parent1.getName();
		String lastname = parent2.getName();
		int ID = parent1.getStudentID() + parent2.getStudentID();
		double GPA = (parent1.getGPA() + parent2.getGPA())/2.0;
		int credits = Math.max(parent1.getCredits(), parent2.getCredits());
		return new Student (firstname, lastname, ID, GPA, credits);
	}
	
	public String toString () {
		return "Name: " + this.Name + " Student ID: " + this.StudentID;
	}
	
	@Override 
	public boolean equals (Object o) {
		if (this == o) 
			return true;
		
		if (o == null)
			return false;
		
		if (getClass() != o.getClass())
			return false;
		
		Student s = (Student) o;
		
		return Objects.equals(Name, s.Name) && Objects.equals(StudentID, s.StudentID);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student ("Mike", "Smith", 17);
		Student t = new Student ("Mike", "Smith", 53);
		Student u = new Student ("Mike", "Smith", 17);
		System.out.println(s.equals(t));
		System.out.println(s.equals(u));
		
	}

}
