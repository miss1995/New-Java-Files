package Exceptiondemo;

public class BankATMGreaterException extends Throwable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BankATMGreaterException() {
		System.out.println("Sorry!You cannot withdraw more than available balance");
	}

}
