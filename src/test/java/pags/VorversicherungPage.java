package pags;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VorversicherungPage {

	public @FindBy(xpath = "//*[@data-c24-test=\"vorversicherungVorhanden\"]//*[text()=\"ja\"]")
	WebElement vorverischerung;
	
	
	public @FindBy(xpath = "//div[@id=\"c24_ref_vorversicherer\"]//input[@id=\"vorversicherer\"]")
	WebElement huk24Auswaehlen;
	
	
	public @FindBy(xpath = "//*[@data-c24-test=\"vorversicherungDauer/D2_1_TO_3_YEARS\"]//*[text()=\"länger als 1 Jahr\"]")
	WebElement laengerAlseinemJahr;
	
	
	public @FindBy(xpath = "//*[@data-c24-test=\"kuendigungDurch/VERSICHERUNGSNEHMER\"]//*[text()=\"ich selbst (Versicherungsnehmer)\"]")
	WebElement kuendigungDurchVersicherungsnehmer;
	

	
	@FindBy(xpath= "//button[contains(text(),'weiter')]")
	public WebElement Weiter;
	
	
WebDriver driver;
	
	public VorversicherungPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver ,this);
	}
}


