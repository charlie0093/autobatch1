package packagemain1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dresspageobject extends baseclass {

	@FindBy(id = "layered_id_attribute_group_1")
	private WebElement stab;
	@FindBy(id = "layered_id_attribute_group_2")
	private WebElement mtab;
	@FindBy(id = "layered_id_attribute_group_3")
	private WebElement ltab;

	

	@FindBy(xpath = "//span[@class='cat-name']")
	private WebElement naviwomen;
	
	@FindBy(xpath = "//*[@id='center_column']/ul/li[2]/div/div[2]/div[2]/a[1]/span")
	private WebElement addtocart;
	
	@FindBy(xpath = "//div[@id='layer_cart']//div//div[@class='button-container']/a/span")
	private WebElement prd2chckout;
	
	public dresspageobject() {
		PageFactory.initElements(driver, this);

	}
	public void clickprdchckout(){
		addtocart.click();
	}
	 public void clickprd2proceed(){
		 prd2chckout.click();
	 }
	
	public WebElement header() {
		return naviwomen;
	}

	public WebElement smalltab() {
		return stab;
	}

	public WebElement mediumtab() {
		return mtab;

	}

	public WebElement largetab() {
		return ltab;
	}

}
