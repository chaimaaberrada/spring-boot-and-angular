package ma.atos.agency.exceptions;

import lombok.Data;
import org.apache.http.HttpStatus;
@Data
public class AccountNotFoundException extends Exception {
    public AccountNotFoundException (String message)
    {
        super(message);
    }

    private HttpStatus httpStatus;

}

