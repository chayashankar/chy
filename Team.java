package util.java;

public class Team {
   String TeamName = "vtu";
   void conductExams() {
	   System.out.println("VTU is conductiong exams");
   }
}
  class College{
	   String CollegeName = "RRCE";
	 void conductInternals() {
		   System.out.println("RRCE is conductiong Internals");
	   }
  }
  
  class Department{
	  String departmentName = "computer science";
		void provideAssignments() {
		  System.out.println("provides assignments");  
	  }

		
	}
  
  class Solution{
	 public static void main(String[]args) {
		 Team tem = new Team();
		 System.out.println("TeamName is"+tem.TeamName);
		 College clg = new College();
		 System.out.println("Collegename is"+clg.CollegeName);
		 Department dept = new Department();
	 System.out.println("departmentname is"+dept.departmentName);
	 dept.provideAssignments();
	 clg.conductInternals();
	 tem.conductExams();	  
  }
  }
  
	 