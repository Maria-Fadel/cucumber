package pags;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RabattePage {

	
	public @FindBy(xpath = "//*[@data-c24-test=\"erstfahrzeugVorhanden\"]//*[text()=\"nein\"]")
	WebElement weiterAutosVersichertNEiN ;
	
	public @FindBy(xpath = "//*[@data-c24-test=\"erstinformationAccepted\"]")
	WebElement  ichBeschtaetige;
	
	public @FindBy(xpath = "//button[text()=\"Ergebnis anzeigen\"]")
	WebElement  ergebnisErzeigen;
	
	public @FindBy(xpath = "//button[contains(text(),'Ergebnis anzeigen')]")
	WebElement tarifOptionErgebnisAnzeigen;
	

	
	@FindBy(xpath= "//button[contains(text(),'weiter')]")
	public WebElement Weiter;

	WebDriver driver;

	public RabattePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
/*
 * 
 * get (){
        return cy.xpath(' ')
    }
    get beruf(){
        return cy.xpath('//input[@id="beruf"][@placeholder="Bitte eingeben oder wählen"]')
    }
    get brunch(){
        return cy.xpath('//input[@id="branche"][@placeholder="Bitte eingeben oder wählen"]')
    }
    get arbeitsweise(){
        return cy.xpath(' //input[@id="arbeitsweise"][@placeholder="Bitte eingeben oder wählen"]')
    }
    get arbeitsgeber(){
        return cy.xpath('//input[@id="firma"][@placeholder="Bitte eingeben oder wählen"]')
    }
    get kinderUnter17Vorhanden(){
        return cy.xpath('//*[@data-c24-test="kinderUnter17Vorhanden"]//*[text()="nein"]')
    }
    get wohneingenturm(){
        return cy.xpath(' //*[@data-c24-test="wohneigentumVorhanden"]//*[text()="nein"]')
    }
    get jahreskarteNahverkehr(){
        return cy.xpath('//*[@data-c24-test="jahreskarteOepv"]//*[text()="nein"]')
    }
    get bahncardBesitz(){
        return cy.xpath(' //*[@data-c24-test="bahncardVorhanden"]//*[text()="nein"]')
    }
    get automobileClubMitglied(){
        return cy.xpath('//*[@data-c24-test="automobilclubVorhanden"]//*[text()="nein"]')
    }
    get moterradBesitz(){
        return cy.xpath('//*[@data-c24-test="motorradBesitzer"]//*[text()="nein"]')
    }
    get vergleichsergebnisPerMail(){
        return cy.xpath('//*[@data-c24-test="eingabenSichern"]//*[text()="nein"]')
    }
    get ichBestätige(){
        return cy.xpath(')
       
    }
    get ergebnisAnzeigen(){
        return cy.xpath('')
        
        
    }
    get tarifoptionAnziegen(){
       return cy.get('.jsLayerTarifOptionenPrimary')
    }*/
 