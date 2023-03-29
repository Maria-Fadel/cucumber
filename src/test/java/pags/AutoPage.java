package pags;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoPage {


	public @FindBy(xpath = "//*[@data-c24-test='vehicle-search-hsn-tsn']")
	WebElement fahrzeugscheinButton;
	//div[normalize-space()='(HSN/TSN)']
	public @FindBy(xpath = "//*[@data-c24-test=\"hsn\"]")
	WebElement hsn;
	
	public @FindBy(xpath = "//*[@data-c24-test=\"tsn\"]")
	WebElement tsn;
	
	public @FindBy(xpath = "//*[@data-c24-test=\"weiteresFahrzeugIstErstfahrzeug\"]//*[text()=\"nein\"]")
	WebElement zweitesWagenNein;
	
	
	public @FindBy(xpath = "//input[@name='erstzulassung']")
	WebElement erstzulassung;
	
	public @FindBy(xpath = "//input[@data-c24-test=\"neuwert\"][@name=\"neuwert\"]")
	WebElement neuwert;
	
	public @FindBy(xpath = "//input[@name=\"versicherungsbeginn\"][@placeholder=\"TT.MM.JJJJ\"]")
	WebElement versicherungsbeginn;
	
	
	@FindBy(xpath= "//button[contains(text(),'weiter')]")
	public WebElement Weiter;
	


	WebDriver driver;
	
	public AutoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver ,this);
	}

}
