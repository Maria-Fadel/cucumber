package pags;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FahrerDesAutoPage {
	public @FindBy(xpath = "//*[@data-c24-test=\"versicherungsnehmerIstFahrer/true\"]//*[text()=\"Versicherungsnehmer\"]")
	WebElement versicherungsnehmer;
	
	
	@FindBy(xpath= "//button[contains(text(),'weiter')]")
	public WebElement Weiter;
	
	
WebDriver driver;
	
	public FahrerDesAutoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver ,this);
	}
}
