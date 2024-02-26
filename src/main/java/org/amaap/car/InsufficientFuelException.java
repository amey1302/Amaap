package org.amaap.car;

public class InsufficientFuelException extends Throwable {
    public InsufficientFuelException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
