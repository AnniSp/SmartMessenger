package SmartMessenger;

public class ChatController {
	
	// lässt die Nachricht von ChatModel übersetzen und leitet sie wieder an ChatView
	public static void openTranslation(String message) {
		String messageTranslated = ChatModel.translate(message);
		ChatView.showTranslation(messageTranslated);
	}
}
