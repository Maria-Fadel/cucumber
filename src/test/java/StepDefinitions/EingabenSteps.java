package StepDefinitions;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import junit.framework.Assert;
import pags.StartPage;
import pags.SituationPage;
import pags.AutoPage;
import pags.FahrerDesAutoPage;
import pags.versicherunsnehmerDatenPage;
import pags.FahrzeugsnutzunsPage;
import pags.RabattePage;
import pags.VorversicherungPage;
import pags.SchadenfreiheitsrabattPage;

public class EingabenSteps {
	
	
	WebDriver driver = new FirefoxDriver();
	AutoPage autoPage = new AutoPage(driver);
	FahrerDesAutoPage fahrerDesAutoPage= new FahrerDesAutoPage(driver);
	versicherunsnehmerDatenPage versicherunsnehmerDatenPage = new versicherunsnehmerDatenPage(driver);
	FahrzeugsnutzunsPage fahrzeugsnutzunsPage = new FahrzeugsnutzunsPage(driver);
	VorversicherungPage vorversicherungPage = new VorversicherungPage(driver);
	SchadenfreiheitsrabattPage schadenfreiheitsrabattPage = new SchadenfreiheitsrabattPage(driver);
	RabattePage rabattePage = new RabattePage(driver);
	
	@Before
	public void browserSetup() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.check24.de/kfz-versicherung/");
		
		
	}
	@After
	public void teardown(Scenario scenario) throws Exception {
		
		if(scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			Allure.addAttachment("Faild Scrennshot",new ByteArrayInputStream(screenshot));
		}
		driver.close();
		//Thread.sleep(TimeUnit.SECONDS.toMillis(100));
	//	driver.quit();
	}
	
		
	@Given("der user ruft die KFZ Versicherung Homepage von Check24")
	public void der_user_ruft_die_kfz_versicherung_homepage_von_check24() {
		StartPage startPage = new StartPage(driver);
		startPage.Akzeptieren.click();
		startPage.Tarif_Vergleich.click();


	}

	@When("Neu angeschafftes Auto auswaehlen")
	public void neu_angeschafftes_auto_auswaehlen() {
		SituationPage sitrationPage = new SituationPage(driver);
	    sitrationPage.Neues_angeschafftes_Auto.click();
	    sitrationPage.Weiter.click();
	}

	@When("Radio-button Fahrzeugschein auswaehlen")
	public void radio_button_fahrzeugschein_auswaehlen() {
		
		autoPage.fahrzeugscheinButton.click();
		
	   
	}

	@When("Fahrzeugdaten {string} und {string} mit Daten ausfuehllen")
	public void fahrzeugdaten_und_mit_daten_ausfuehllen(String hsn, String tsn) {
		
		autoPage.hsn.sendKeys(hsn);
		autoPage.tsn.sendKeys(tsn);
	  
	}

	@When("Erstzulassung des Auto {string}")
	public void erstzulassung_des_auto(String erstzulassungdatum) throws InterruptedException {
		Thread.sleep(1000);
		autoPage.erstzulassung.click();
		autoPage.erstzulassung.sendKeys(erstzulassungdatum);
	}

	@When("Ungefaehrer {string} des Autos")
	public void ungefaehrer_des_autos(String neuwert) {
		
		autoPage.neuwert.click();
		autoPage.neuwert.sendKeys(neuwert);
		autoPage.Weiter.click();
	}

	@When("Verwendung Nur Privat")
	public void verwendung_nur_privat() {
		fahrzeugsnutzunsPage.verwendungDesFahrzeugs.click();
	}

	@When("Jaehrliche Fahrleistung {string}")
	public void jaehrliche_fahrleistung(String jaehrlichrNutzung) {
		fahrzeugsnutzunsPage.jaehrlichrNutzung.sendKeys(jaehrlichrNutzung);
	}

	@When("Naechtlicher Stellplatz: Einzelgarage")
	public void naechtlicher_stellplatz_einzelgarage() {
		fahrzeugsnutzunsPage.naechtlicherStellplatz.click();
		fahrzeugsnutzunsPage.einzelgaragge.click();
	}

	@When("Finanz des Autos: Barkauf")
	public void finanz_des_autos_barkauf() {
		fahrzeugsnutzunsPage.finanzierungBarkauf.click();
		fahrzeugsnutzunsPage.Weiter.click();
	}

	@When("Versicherungsnehmer \\(Sie selbst) ist vorhanden")
	public void versicherungsnehmer_sie_selbst_ist_vorhanden() {
	
	}

	@When("Geschlecht {string} auswaehlen")
	public void geschlecht_auswaehlen(String string) {
		versicherunsnehmerDatenPage.geschlechtMaennlich.click();
	  
	}

	@When("Geburtsdatum {string} eingeben")
	public void geburtsdatum_eingeben(String geburtsdatum) {
		versicherunsnehmerDatenPage.geburtsdatum.sendKeys(geburtsdatum);
	}

	@When("Datum {string} Erwerb")
	public void datum_erwerb(String fuehrerscheinErwerb) {
		versicherunsnehmerDatenPage.fuehrerscheinErwerb.sendKeys(fuehrerscheinErwerb);
	}

	@When("Familienstand des Versicherungsnehmer {string}")
	public void familienstand_des_versicherungsnehmer(String string) {
		versicherunsnehmerDatenPage.familienstand.click();
		versicherunsnehmerDatenPage.verheiratet.click();  
	}

	@When("Beruf des Versicherungsnehmer auswaehlen  {string}")
	public void beruf_des_versicherungsnehmer_auswaehlen(String string) {
		versicherunsnehmerDatenPage.beruf.click();
		versicherunsnehmerDatenPage.angestellter.click();
	}

	@When("die PLZ vom Versicherungsnhmer eingeben {string}")
	public void die_plz_vom_versicherungsnhmer_eingeben(String plz) {
		versicherunsnehmerDatenPage.plz.sendKeys(plz);
	}

	@When("Punkte in Flensburg Nein")
	public void punkte_in_flensburg_nein() {
		 versicherunsnehmerDatenPage.punkteInFlensburg.click();
	}

	@When("Zugriff auf weitere Autos Nein")
	public void zugriff_auf_weitere_autos_nein() {
		versicherunsnehmerDatenPage.zugriffAufAnereAuto.click();
		versicherunsnehmerDatenPage.Weiter.click(); 
	}

	@When("wer ist der Autofahrer {string}")
	public void wer_ist_der_autofahrer(String string) {
		fahrerDesAutoPage.versicherungsnehmer.click();
		fahrerDesAutoPage.Weiter.click();
	}

	@When("Vorversichung ist vorhanden ja")
	public void vorversichung_ist_vorhanden_ja() {
		 vorversicherungPage.vorverischerung.click(); 
	}



	@When("wer ist die alte Versicherung {string}")
	public void wer_ist_die_alte_versicherung(String HUK24) {
		vorversicherungPage.huk24Auswaehlen.sendKeys(HUK24);
	}

	@When("Vorversicherung Dauer eingeben {string}")
	public void vorversicherung_dauer_eingeben(String string) {
		 vorversicherungPage.laengerAlseinemJahr.click();
	}

	@When("Kuendigung durch Versicherungsnehmer ja")
	public void kuendigung_durch_versicherungsnehmer_ja() {
		vorversicherungPage.kuendigungDurchVersicherungsnehmer.click();
		vorversicherungPage.Weiter.click();
	}
	
	@When("regulierte Schaeden in den letzten 3 Jahren")
	public void regulierte_Schaeden_in_den_letzten_3_Jahren() {
		schadenfreiheitsrabattPage.schadenInDenLetzten3Jahren.click();
	}
	
	@When("Schadenfreinheitsrabat ist vorhanden ja")
	public void schadenfreinheitsrabat_ist_vorhanden_ja() {
		
	}
	

	@When("{string} SF-Klasse eingeben")
	public void sf_klasse_eingeben(String string) {
		 schadenfreiheitsrabattPage.sfkDropdownListe.click();        // SFK click
		 schadenfreiheitsrabattPage.sfk5Auswaehlen.click();    
	}
	
	@When("Bisher keine {string} eingeben")
	public void bisher_keine_eingeben(String string) {
		 schadenfreiheitsrabattPage.bisherKeinVollkasko.click();
		 schadenfreiheitsrabattPage.Weiter.click();
	}



	@When("Weiteres Auto auf Sie oder Familienmitglieder versichert Nein")
	public void weiteres_auto_auf_sie_oder_familienmitglieder_versichert_nein() {
		rabattePage.weiterAutosVersichertNEiN.click();
	}

	@When("Ich bestaetige")
	public void ich_bestaetige() {
		 rabattePage.ichBeschtaetige.click();
		 	}

	@When("Ergebnis Anzeigen")
	public void ergebnis_anzeigen() throws InterruptedException {
		rabattePage.ergebnisErzeigen.click();
		Thread.sleep(1000);
		rabattePage.tarifOptionErgebnisAnzeigen.click();
	}

	@Then("Versicherung-Angebot mit den Preisen werden aufgeliestet")
	public void versicherung_angebot_mit_den_preisen_werden_aufgeliestet() {
		boolean txt = driver.getPageSource().contains("KFZ-Versicherungsvergleich");
		Assert.assertEquals(txt, true);
	}
		
}
