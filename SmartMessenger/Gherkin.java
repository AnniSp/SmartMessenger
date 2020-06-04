package SmartMessenger;

import java.util.Scanner;

/*
Beim Aufrufen des Eclipse marketplace ist ein Fehler aufgetreten.
Daher war es uns nicht m�glich, dass Cucumber plugin zu installieren.
Deswegen habe ich hier provisorisch den Ablauf des Programms in given, when und then aufgeteilt.
 */


public class Gherkin {
	public String message, messageTranslated;
		
//	@Given("der Nutzer hat einen Text eingegeben")
	public void der_Nutzer_hat_einen_Text_eingegeben() {
		message = ChatView.readMessage();
	}
	
//	@When("dieser �bersetzt wurde")
	public void dieser_�bersetzt_wurde() {
		messageTranslated = ChatModel.translate(message);
	}
	
//	@Then("erh�lt der Gespr�chspartner folgende Nachricht")
	public void erh�lt_der_Gespr�chspartner_folgende_Nachricht() {
		ChatView.showTranslation(messageTranslated);
	}
}
