package pags;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class versicherunsnehmerDatenPage {
	public @FindBy(xpath = "//*[@data-c24-test=\"versicherungsnehmer/geschlecht/MAENNLICH\"]//*[text()=\"männlich\"]") WebElement geschlechtMaennlich;

	public @FindBy(xpath = "//input[@name=\"versicherungsnehmer[geburtsdatum].geburtsdatum\"][@placeholder=\"TT.MM.JJJJ\"]") WebElement geburtsdatum;

	public @FindBy(xpath = "//input[@name=\"versicherungsnehmer[pkwFsErteilung].pkwFsErteilung\"][@placeholder=\"TT.MM.JJJJ\"]") WebElement fuehrerscheinErwerb;

	public @FindBy(xpath = "//*[@data-c24-test=\"versicherungsnehmer/familienstand/open\"]") WebElement familienstand;

	public @FindBy(xpath = "//*[@data-c24-test=\"versicherungsnehmer/familienstand/VERHEIRATET\"][@role=\"option\"]") WebElement verheiratet;

	public @FindBy(xpath = "//*[@data-c24-test=\"versicherungsnehmer/berufsgruppe/open\"]") WebElement beruf;

	public @FindBy(xpath = "//*[@data-c24-test=\"versicherungsnehmer/berufsgruppe/B20_ANGESTELLTE\"][@role=\"option\"]") WebElement angestellter;

	public @FindBy(xpath = "//input[@name=\"versicherungsnehmer[plz].plz\"][@data-c24-test=\"versicherungsnehmer/ort/plz\"]") WebElement plz;

	public @FindBy(xpath = "//*[@data-c24-test=\"versicherungsnehmer/punkteFlensburg\"]//*[text()=\"nein\"]") WebElement punkteInFlensburg;

	public @FindBy(xpath = "//*[@data-c24-test=\"versicherungsnehmer/pkwZugriff\"]//*[text()=\"nein\"]") WebElement zugriffAufAnereAuto;

	@FindBy(xpath = "//button[contains(text(),'weiter')]")
	public WebElement Weiter;

	WebDriver driver;

	public versicherunsnehmerDatenPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}

/*



 
 */