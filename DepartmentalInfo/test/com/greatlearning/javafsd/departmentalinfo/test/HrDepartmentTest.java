package com.greatlearning.javafsd.departmentalinfo.test;

import com.greatlearning.javafsd.departmentalinfo.HrDepartment;

public class HrDepartmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        HrDepartment hrDepartment = new HrDepartment();
		
		
		
		String departmentName = hrDepartment.departmentName();
		System.out.println("Welcome to " + departmentName);
		
		String hrActivity = hrDepartment.doActivity();
		System.out.println(hrActivity);
		
		String todaysWork = hrDepartment.getTodaysWork();
		System.out.println(todaysWork);
		
		
		String workDeadline = hrDepartment.getWorkDeadline();
		System.out.println(workDeadline);
		
		String isTodayAHoliday = hrDepartment.isTodayAHoliday();
		System.out.println(isTodayAHoliday);

	}

}
