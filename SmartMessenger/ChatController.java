package SmartMessenger;

public class ChatController {
//	public static String message = ChatView.scanner();
	
	public static void openTranslation(String message) {
		String messageTranslated = ChatModel.translate(message);
		ChatView.showTranslation(messageTranslated);
	}
}
