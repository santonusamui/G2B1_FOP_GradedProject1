package com.greatlearning.javafsd.departmentalinfo;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Displaying Super Department Information
		
		
 /*      SuperDepartment superDepartment = new SuperDepartment();
		
		String departmentName = superDepartment.departmentName();
		System.out.println("Welcome to "+departmentName);
		
		String todaysWork = superDepartment.getTodaysWork();
		System.out.println(todaysWork);
		
		
		String workDeadline = superDepartment.getWorkDeadline();
		System.out.println(workDeadline);
		
		String isTodayAHoliday = superDepartment.isTodayAHoliday();
		System.out.println(isTodayAHoliday);
	*/	
				
		// Object  creation of AdminDepartment Class

		AdminDepartment adminDepartment = new AdminDepartment();

		//Displaying AdminDepartment Class Information
		
		String departmentNameAdmin = adminDepartment.departmentName();
		System.out.println("Welcome to " + departmentNameAdmin);
		
		String todaysWorkAdmin = adminDepartment.getTodaysWork();
		System.out.println(todaysWorkAdmin);
		
		
		String workDeadlineAdmin = adminDepartment.getWorkDeadline();
		System.out.println(workDeadlineAdmin);
		
		String isTodayAHolidayAdmin = adminDepartment.isTodayAHoliday();
		System.out.println(isTodayAHolidayAdmin);
		
		//End of AdminDepartment Class Information
		//Inserting new lines
		
		System.out.println();
		System.out.println();
		
		
		// Object  creation of HrDepartment Class
		
		HrDepartment hrDepartment = new HrDepartment();
		
		//Displaying HrDepartment Class Information

		String departmentNameHr = hrDepartment.departmentName();
		System.out.println("Welcome to " + departmentNameHr);
		
		String ActivityHr = hrDepartment.doActivity();
		System.out.println(ActivityHr);
		
		String todaysWorkHr = hrDepartment.getTodaysWork();
		System.out.println(todaysWorkHr);
		
		
		String workDeadlineHr = hrDepartment.getWorkDeadline();
		System.out.println(workDeadlineHr);
		
		String isTodayAHolidayHr = hrDepartment.isTodayAHoliday();
		System.out.println(isTodayAHolidayHr);
		
		//End of HrDepartment Class Information
	   //Inserting new lines
				
	   	System.out.println();
		System.out.println();
		
		// Object  creation of TechDepartment Class
        TechDepartment techDepartment = new TechDepartment();
		
      //Displaying TechDepartment Class Information
		
		String departmentNameTech = techDepartment.departmentName();
		System.out.println("Welcome to " + departmentNameTech);
						
		String todaysWorkTech = techDepartment.getTodaysWork();
		System.out.println(todaysWorkTech);
		
		
		String workDeadlineTech = techDepartment.getWorkDeadline();
		System.out.println(workDeadlineTech);
		
		String techStackInfo = techDepartment.techStackInformation();
		System.out.println(techStackInfo);
		
		String isTodayAHolidayTech = techDepartment.isTodayAHoliday();
		System.out.println(isTodayAHolidayTech);
		
		//End of TechDepartment Class Information
				
		//End of Execution	
		
		
		

	}

}
