package tema3.exception;

/**
 * @author Razvan
 *
 */
public class RzvException extends Exception{

	/**
	 * Auto Generated.
	 */
	private static final long serialVersionUID = 513287297883150338L;

	private String extraErrorInfo;

	/**
	 * @param String errorMessage
	 * @param String extraInfo
	 */
	public RzvException(String errorMessage, String extraInfo)
	{
		super(errorMessage);
		extraErrorInfo = extraInfo;	
	}

	/**
	 * @param errorMessage
	 */
	public RzvException(String errorMessage)
	{
		super(errorMessage);
		extraErrorInfo = "No aditional information provided.";	
	}

	/**
	 * 
	 */
	public RzvException()
	{
		super();
		extraErrorInfo = "No aditional information provided.";
	}

	/**
	 * @return String extraErrorInfo
	 */
	public String getExtraErrorInfo() {
		return extraErrorInfo;
	}

}
