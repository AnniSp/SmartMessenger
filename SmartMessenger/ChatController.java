package SmartMessenger;

public class ChatController {
	
	// l�sst die Nachricht von ChatModel �bersetzen und leitet sie wieder an ChatView
	public static void openTranslation(String message) {
		String messageTranslated = ChatModel.translate(message);
		ChatView.showTranslation(messageTranslated);
	}
}
