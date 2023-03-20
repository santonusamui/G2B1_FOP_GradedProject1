package com.greatlearning.javafsd.departmentalinfo;

public class HrDepartment extends SuperDepartment {
	
	 String departmentName;
     String todaysWork;
     String workDeadline;
     String  ActivityHr;


     public String departmentName() {

            this.departmentName = "HR Department";
            return departmentName;

     }

     public String getTodaysWork() {

            this.todaysWork = "Fill today's timesheet and mark your attendance";
            return todaysWork;

     }


     public String getWorkDeadline() {

            this.workDeadline = "Complete by EOD";
            return workDeadline;

     }
     
     public String doActivity() {
    	 
    	   this.ActivityHr = "team Lunch";
    	   return ActivityHr;
    	   
     }

}
