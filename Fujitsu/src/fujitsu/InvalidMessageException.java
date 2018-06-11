/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fujitsu;

import java.util.List;

/**
 *
 * @author Agarimo
 */
public class InvalidMessageException extends Exception {

    public InvalidMessageException() {
    }

    public InvalidMessageException(String detailMessage) {
        super(detailMessage);
    }

    public InvalidMessageException(Throwable throwable) {
        super(throwable);
    }

    public InvalidMessageException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public InvalidMessageException(String detailMessage, List<Exception> exceptions) {
        super(detailMessage, exceptions.get(0));
    }
}
