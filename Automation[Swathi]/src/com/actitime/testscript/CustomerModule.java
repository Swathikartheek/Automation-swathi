package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListnerImplementation.class)

public class CustomerModule extends BaseClass {
	@Test(groups = {"SmokeTest","RegressionTest"})
	public void createCustomer()
	{
		Assert.fail();
		Reporter.log("Create Customer",true);
	}
	@Test(groups="RegressionTest", dependsOnMethods = "createCustomer")
	public void modifyCustomer()
	{
		Reporter.log("modify customer", true);
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("Delete customer", true);
	}
	

}
