package Utilities;

public class DSHMensaje {

	private String key;
	private String message;
	
	public DSHMensaje(String k, String m) {
		this.key = k;
		this.message = m;
	}
	
	public DSHMensaje() {
		
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
