package SmartMessenger;

public class ChatModel {
	
	public static String translate(String message) {
		String messageTranslated = null;
		switch(message) {
		case "Hallo!":
			messageTranslated = "Hola!";
			break;
		case "Wie geht es dir?":
			messageTranslated = "¿Cómo estás?";
			break;
		case "Ich verstehe nur Bahnhof!":
			messageTranslated = "No entiendo ni jota!";
			break;
		case "Gute Nacht.":
			messageTranslated = "Buenas noches.";
			break;
		default:
			messageTranslated = "Diesen Satz kenne ich nicht";
		}
		
		return messageTranslated;
	}
}
