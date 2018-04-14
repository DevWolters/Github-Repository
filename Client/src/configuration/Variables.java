package configuration;

public class Variables {
	
	public static final int PORT = 5555;
	public static final String IP_ADDRESS = "localhost";
	
	private static String clientLocation;
	
	private static String username;
	private static String password;
	
	private static String sendToServer;
	private static String receiveFromServer;
	
	public static String getClientLocation() {
		return clientLocation;
	}
	public static void setClientLocation(String clientLocation) {
		Variables.clientLocation = clientLocation;
	}
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		Variables.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		Variables.password = password;
	}
	public static String getSendToServer() {
		return sendToServer;
	}
	public static void setSendToServer(String sendToServer) {
		Variables.sendToServer = sendToServer;
	}
	public static String getReceiveFromServer() {
		return receiveFromServer;
	}
	public static void setReceiveFromServer(String receiveFromServer) {
		Variables.receiveFromServer = receiveFromServer;
	}

}
