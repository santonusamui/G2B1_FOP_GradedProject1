package com.greatlearning.javafsd.departmentalinfo;

public class TechDepartment extends SuperDepartment {
	
	 String departmentName;
     String todaysWork;
     String workDeadline;
     String  techStackInfo;


     public String departmentName() {

            this.departmentName = "Tech Department";
            return departmentName;

     }

     public String getTodaysWork() {

            this.todaysWork = "Complete coding of Module 1";
            return todaysWork;

     }


     public String getWorkDeadline() {

            this.workDeadline = "Complete by EOD";
            return workDeadline;

     }
     
     public String techStackInformation() {
    	 
    	   this.techStackInfo = "Core Java";
    	   return techStackInfo;
     }

}
