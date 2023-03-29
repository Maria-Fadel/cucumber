package pags;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FahrzeugsnutzunsPage {

	public @FindBy(xpath = "//*[@data-c24-test=\"fahrzeugnutzungexklusiv/NUR_PRIVAT\"]//*[text()=\"nur privat (inkl. Arbeitsweg)\"]") 
	WebElement verwendungDesFahrzeugs;

	
	public @FindBy(xpath = "//input[@data-c24-test=\"fahrleistung\"][@name=\"fahrleistung\"]") 
	WebElement jaehrlichrNutzung;
	
	
	public @FindBy(xpath = "//*[@data-c24-test=\"stellplatz/open\"]") 
	WebElement naechtlicherStellplatz;
	
	
	public @FindBy(xpath = "//*[@data-c24-test=\"stellplatz/EINZELGARAGE\"][@role=\"option\"]") 
	WebElement einzelgaragge;
	
	
	public @FindBy(xpath = "//*[@data-c24-test=\"fahrzeugfinanzierung/BARKAUF\"]//*[text()=\"Barkauf\"]") 
	WebElement finanzierungBarkauf;
	
	
	public @FindBy(xpath = "//*[@data-c24-test=\"saisonkennzeichen/false\"]//*[text()=\"nein\"]") 
	WebElement sasionKennezeiechen;
	
	
	@FindBy(xpath= "//button[contains(text(),'weiter')]")
	public WebElement Weiter;
	
	
	
	
	
	WebDriver driver;

	public FahrzeugsnutzunsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver ,this);
	}

}

//
//
//get verwendungDesFahrzeugs(){
//   return cy.xpath('')
//}
//
//get  (){
//    return cy.xpath('')
//}
//
//get (){
//    return cy.xpath('')
//}
//
//get (){
//     return cy.xpath('')
//}
//
//get (){
//
//    return  cy.xpath('')
//}
//get (){
//   
//return cy.xpath('')
//
//
//}