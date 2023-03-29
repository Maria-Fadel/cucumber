package pags;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage {



	public @FindBy(xpath = "//button[@type='submit'][contains(text(),'Tarife vergleichen')]")
	WebElement Tarif_Vergleich;
	
	@FindBy(xpath= "//*[text()='Akzeptieren']")
	public WebElement Akzeptieren;
	


	WebDriver driver;
	
	public StartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver ,this);
	}
	


}
