package pags;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SituationPage {



	public @FindBy(xpath = "//*[text()='Neu angeschafftes Auto']")
	WebElement Neues_angeschafftes_Auto;
	
	@FindBy(xpath= "//button[contains(text(),'weiter')]")
	public WebElement Weiter;
	


	WebDriver driver;
	
	public SituationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver ,this);
	}
	

}
