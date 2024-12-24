package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass{
	@Test
	public void createProject()
	{
		Reporter.log("Create project", true);
	}
	@Test
	public void modifyProject()
	{
		Reporter.log("Modify Project", true);
	}
	@Test
	public void deleteProject()
	{
		Reporter.log("DeleteProject", true);
	}

}
