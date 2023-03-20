package com.greatlearning.javafsd.departmentalinfo;

public class AdminDepartment extends SuperDepartment {
	

	   String departmentName;
	   String todaysWork;
	   String workDeadline;
	
	
       public String departmentName() {
		
		      this.departmentName = "Admin Department";
		      return departmentName;
		
	   }
	
	   public String getTodaysWork() {
		
		      this.todaysWork = "Complete your documents submission";
		      return todaysWork;
		
	   }
	
	
	    public String getWorkDeadline() {
		
		       this.workDeadline = "Complete by EOD";
		       return workDeadline;
		
	    }
	

}
