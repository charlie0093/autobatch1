package packagetest1;

import org.testng.Assert;
import org.testng.annotations.Test;

import packagemain1.HomePageObject;
import packagemain1.dresspageobject;

public class dresspagetest {

	dresspageobject dp;
	HomePageObject hp;

	public dresspagetest() {
		dp = new dresspageobject();
		hp = new HomePageObject();
	}

	@Test
	public void verifytabs() {
		hp.clickdresses();
		Assert.assertTrue(dp.smalltab().isEnabled(), "s tab is not found");
		Assert.assertTrue(dp.mediumtab().isEnabled(), "m tab is not found");
		Assert.assertTrue(dp.largetab().isEnabled(), "l tab is not found");
	}
	@Test
	public void cartbtn(){
		hp.clickdresses();
		System.out.println("setprdchckout");
		dp.clickprdchckout();
		dp.clickprd2proceed();
	}

}
