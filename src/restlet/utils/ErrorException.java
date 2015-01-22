package restlet.utils;

@SuppressWarnings("serial")
public class ErrorException extends Exception {
	public int errorcode;
	public String errormsg;
	public ErrorException(int errorcode, String errormsg) {
		// TODO Auto-generated constructor stub
		this.errorcode = errorcode;
		this.errormsg = errormsg;
	}
}
