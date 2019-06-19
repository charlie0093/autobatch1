package packagetest1;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import packagemain1.HomePageObject;
import packagemain1.dresspageobject;

public class HomePageTest {

	HomePageObject hp;
	dresspageobject dp;

	int random = new Random().nextInt(50000);
	String email = "cartest" + random + "@yahoo.com";

	public HomePageTest() {

		hp = new HomePageObject();

		dp = new dresspageobject();
	}

	@Test
	public void verifywomentab() {
		Assert.assertTrue(hp.elementFound(hp.getdress()));
		Assert.assertTrue(hp.elementFound(hp.gettshirt()), "failed: tshirt tab not found");
		Assert.assertTrue(hp.elementFound(hp.getwomen()), "failed: women tab not found");

	}

	@Test
	public void verifyemailaddress() {
		hp.setemailadress(email);
		hp.arrorclick();
		System.out.println(hp.msgalertsub().getText());
		Assert.assertTrue(hp.msgalertsub().getText().contains("successfully"), "failed");
		
	}

	@Test
	public void verifynavigatebutton() {
		hp.getwomen().click();
		Assert.assertTrue(hp.header().getText().trim().equalsIgnoreCase("women"), "failed");
		hp.getdress().click();

		Assert.assertTrue(dp.header().getText().trim().equalsIgnoreCase("DRESSES"), "failed");
		hp.gettshirt().click();

		Assert.assertTrue(hp.header().getText().trim().equalsIgnoreCase("T-SHIRTS"), "failed");
	}
}
