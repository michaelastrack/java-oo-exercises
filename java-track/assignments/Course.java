import java.util.ArrayList;

public class Course {
	
	private String Name;
	private int Credits;
	private int RemainingSeats;
	private Student[] Roster;
	private int numStudents;
	private static ArrayList<Course> CourseList = new ArrayList<Course>();
	
	public Course (String name, int credits, int seats) {
		this.Name = name;
		this.Credits = credits;
		this.RemainingSeats = seats;
		this.Roster = new Student [seats];
		this.numStudents = 0;
		CourseList.add(this);
	}

	public String getName() {
		return this.Name;
	}


	public int getRemainingSeats() {
		return this.RemainingSeats;
	}
	
	public int getCredits() {
		return this.Credits;
	}
	
	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public void setRemainingSeats(int remainingSeats) {
		this.RemainingSeats = remainingSeats;
	}

	public boolean addStudent (Student s) {
		//System.out.println(s.getStudentID());
		for (int j = 0; j < this.getNumStudents(); j++) {
			
			if (this.Roster[j].getName().equals(s.getName())) {
				//System.out.println("False");
				return false;
			}
			
		} 
		
		if (this.getRemainingSeats() == 0) {
			return false;
		}
		
		else {
			this.setRemainingSeats(this.getRemainingSeats() - 1);
			int i = 0;
			boolean result = true;
			while (i < this.Roster.length && result) {
				if (this.Roster[i] == null) {
					this.Roster[i] = s;
					this.setNumStudents(this.getNumStudents() + 1);
					result = false;
				}
				i++;
			}
			return true;
		}
	}
	
	public String GenerateRoster () {
		int l = this.Roster.length;
		String out = "";
		for (int i = 0; i < l; i++) {
			if (Roster[i] != null) {
				out = out + this.Roster[i].toString() + "\n";
			}
		}
		return out;
	}
	
	public double averageGPA () {
		int l = this.Roster.length;
		double g = 0;
		for (int i = 0; i < l; i++) {
			if (Roster[i] != null) {
				g = g + Roster[i].getGPA();
				
			}
		}
		g = g/this.getNumStudents();
		return g;
	}

	public String toString () {
		return "Course: " + this.getName() + " Credits: " + this.getCredits();
	}
	
	public static ArrayList<Course> getAllCourses () {
		return CourseList;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Course C = new Course ("Bob", 5, 5);
		// System.out.println(C);
	}

}
