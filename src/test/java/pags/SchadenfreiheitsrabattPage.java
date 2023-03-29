package pags;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchadenfreiheitsrabattPage {

	public @FindBy(xpath = "//*[@data-c24-test=\"schaedenletzte3jahre\"]//*[text()=\"nein\"]")
	WebElement schadenInDenLetzten3Jahren ;
	
	public @FindBy(xpath = "//*[@data-c24-test=\"schadenfreiheitsklasse.kh/open\"]")
	WebElement  sfkDropdownListe;
	
	public @FindBy(xpath = "//*[@data-c24-test=\"schadenfreiheitsklasse.kh/SFK_KH_S\"][@role=\"option\"]")
	WebElement  sfk5Auswaehlen;
	
	public @FindBy(xpath = "#c24_ref_sfkVollkaskoVersicherung > .css-79elbk > .css-g96nnt > .css-msciw7")
	WebElement vollkankoListe ;
	
	public @FindBy(xpath = "[data-c24-test=\"sfkVollkaskoVersicherung/SFK_VK_5\"]")
	WebElement vollkasko5Auswaehlen;
	
	public @FindBy(xpath = "//div[text()=\"bisher keine Vollkasko\"]")
	WebElement  bisherKeinVollkasko;
	
	
	@FindBy(xpath= "//button[contains(text(),'weiter')]")
	public WebElement Weiter;

	WebDriver driver;

	public SchadenfreiheitsrabattPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}

