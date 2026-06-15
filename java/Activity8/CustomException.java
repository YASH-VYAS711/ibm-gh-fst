package Activity8;

public class CustomException extends Exception {
	private String Message;
	
	public CustomException(String customStr){
		this.Message = customStr;
	}
	
	@Override
	public String getMessage() {
		return this.Message;
	}
	
}
