package packagemain1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends baseclass {
	@FindBy(xpath = "//div[@id='block_top_menu']//a[@title='Women']")
	private WebElement womentab;

	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dressestab;

	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dresstab;

	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[3]/a")
	private WebElement tshirttab;
	@FindBy(id = "newsletter-input")
	private WebElement enteremail;
	@FindBy(xpath = "//div//button[@name='submitNewsletter']")
	private WebElement arrowbutton;
	@FindBy(xpath = "//*[@class='alert alert-success']")
	private WebElement successmsg;
	
	@FindBy(name = "submitNewsletter")
	private WebElement arrowSubmitBtn;
	
	@FindBy(xpath = "//span[@class='cat-name']")
	private WebElement naviwomen;
	
	
	@FindBy(id = "uniform-selectProductSort")
	private WebElement navitshirt;

	public HomePageObject() {
		PageFactory.initElements(driver, this);

	}
	public WebElement msgalertsub(){
		return successmsg;
	}


	public WebElement header() {
		return naviwomen;
	}

	public void setemailadress(String email) {
		setText(enteremail, email);
		// enteremail.click();

	}

	public void arrorclick() {
		arrowSubmitBtn.click();
	}

	public WebElement dresses() {
		return dressestab;
	}

	public void clickdresses() {
		dressestab.click();
	}

	public WebElement getwomen() {
		return womentab;
	}

	public WebElement getdress() {
		return dresstab;
	}

	public WebElement gettshirt() {
		return tshirttab;
	}

}
