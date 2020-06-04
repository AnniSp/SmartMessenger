package SmartMessenger;

import java.util.Scanner;

/*
Beim Aufrufen des Eclipse marketplace ist ein Fehler aufgetreten.
Daher war es uns nicht möglich, dass Cucumber plugin zu installieren.
Deswegen habe ich hier provisorisch den Ablauf des Programms in given, when und then aufgeteilt.
 */


public class Gherkin {
	public String message, messageTranslated;
		
//	@Given("der Nutzer hat einen Text eingegeben")
	public void der_Nutzer_hat_einen_Text_eingegeben() {
		message = ChatView.readMessage();
	}
	
//	@When("dieser übersetzt wurde")
	public void dieser_übersetzt_wurde() {
		messageTranslated = ChatModel.translate(message);
	}
	
//	@Then("erhält der Gesprächspartner folgende Nachricht")
	public void erhält_der_Gesprächspartner_folgende_Nachricht() {
		ChatView.showTranslation(messageTranslated);
	}
}
