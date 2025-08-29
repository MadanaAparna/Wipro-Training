package com.orangehrm.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	private static ExtentReports extent;
	static String projectpath=System.getProperty("user.dir")  ;
	public static ExtentReports getinstance()
	{
		if(extent==null)
		{
		String reportpath=projectpath+"D:\\PROGRAMS\\wipro\\src\\main\\resources\\Reports";
		ExtentSparkReporter spark=new ExtentSparkReporter(reportpath);
		extent.attachReporter(spark);
		}
		return extent;
	}
	}