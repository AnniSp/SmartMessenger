package SmartMessenger;

import java.util.Scanner;

public class ChatView {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihre Nachricht ein.");
		String message = sc.nextLine(); // Liest eingaben aus der Konsole ein
		ChatController.openTranslation(message);
	}
	
	// Gibt die übersetzte Nachricht in der Konsole aus
	public static void showTranslation(String messageTranslated) {
		System.out.println(messageTranslated);
	}

}
