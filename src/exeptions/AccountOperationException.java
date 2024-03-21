package exeptions;

public class AccountOperationException extends RuntimeException {
	
    private static final long serialVersionUID = 1L;

    public AccountOperationException(String e) {
        super(e);
    }
    
}

