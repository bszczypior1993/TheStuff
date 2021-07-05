package pl.futurecollars.lesson5.task5;

public class Vehicle {
    protected static boolean enginePresent;
    protected static boolean engineStarted;

    protected void startEngine() {
        if (enginePresent = true) {
            engineStarted = true;
        } else {
            throw new UnsupportedOperationException("This vehicle does not have an engine");
        }
    }

    protected void stopEngine() {
        if (enginePresent = true) {
            engineStarted = false;
        } else {
            throw new UnsupportedOperationException("This vehicle does not have an engine");
        }
    }
    protected boolean isEngineStarted() {
        if (enginePresent = true) {
            return engineStarted;
        } else {
            throw new UnsupportedOperationException("This vehicle does not have an engine");
        }
    }
}