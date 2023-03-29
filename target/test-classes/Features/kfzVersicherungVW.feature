

Feature: hier wird ein KFZ Versicherung Angebot erstellt.
  @KFZ-Versicherung-Test
  Scenario: VW KFZ-Versicherung
    Given der user ruft die KFZ Versicherung Homepage von Check24
    When Neu angeschafftes Auto auswaehlen
    And Radio-button Fahrzeugschein auswaehlen
    And Fahrzeugdaten "<HSN>" und "<TSN>" mit Daten ausfuehllen
    And Erstzulassung des Auto "<Erstzulassung>"
    And Ungefaehrer "<Neuwert>" des Autos
    And Verwendung Nur Privat
    And Jaehrliche Fahrleistung "<km>"
    And Naechtlicher Stellplatz: Einzelgarage
    And Finanz des Autos: Barkauf
    And Versicherungsnehmer (Sie selbst) ist vorhanden
    And Geschlecht "<Geschlecht>" auswaehlen
    And Geburtsdatum "<Geburtsdatum>" eingeben
    And Datum "<Fuehrerschein>" Erwerb 
    And Familienstand des Versicherungsnehmer "<Familienstand>"  
    And Beruf des Versicherungsnehmer auswaehlen  "<Beruf>" 
    And die PLZ vom Versicherungsnhmer eingeben "<PLZ>" 
    And Punkte in Flensburg Nein
    And Zugriff auf weitere Autos Nein
    And wer ist der Autofahrer "<Autofahrer>"
    And Vorversichung ist vorhanden ja
    And Schadenfreinheitsrabat ist vorhanden ja 
    And wer ist die alte Versicherung "<alteVersicherung>" 
    And Vorversicherung Dauer eingeben "<vorversicherungsDauer>"
    And Kuendigung durch Versicherungsnehmer ja
    And regulierte Schaeden in den letzten 3 Jahren
    And "<Haftpflicht>" SF-Klasse eingeben
    And Bisher keine "<Vollkasko>" eingeben
    And Weiteres Auto auf Sie oder Familienmitglieder versichert Nein
    And Ich bestaetige
    And Ergebnis Anzeigen
    Then Versicherung-Angebot mit den Preisen werden aufgeliestet
    

    Examples: 
      | HSN  | TSN | Erstzulassung | Neuwert | km  | Geschlecht |Geburtsdatum | Fuehrerschein | Familienstand | Beruf       | PLZ  | Autofahrer          | alteVersicherung | vorversicherungsDauer | Haftpflicht | Vollkasko |                           
      | 0603 | CBL | 13.03.2017    | 15000   |15000| maennlich  |07051988     | 15032015      | verheiratet   | Angesteller | 24149| Versicherungsnehmer | HUK24            | bis zu zwei Jahre     |				5		  |     5     |
   
