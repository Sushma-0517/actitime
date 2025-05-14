	package com.actitime.testscripts;

	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;

	import com.actitime.generic.BaseClass;

	@Listeners(com.actitime.generic.ListenerImplementation.class)

	public class customerModule extends BaseClass {
		
		@Test
		public void createCustomer() {
		Reporter.log("CreateCustomer",true);
		
		}

	}

