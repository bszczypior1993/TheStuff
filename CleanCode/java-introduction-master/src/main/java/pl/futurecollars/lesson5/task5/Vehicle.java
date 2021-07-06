package pl.futurecollars.lesson5.task5;

public class Vehicle {
    protected static boolean engineStarted;

    protected void startEngine() {
        engineStarted = true;
    }

    protected void stopEngine() {
        engineStarted = false;
    }

    protected boolean isEngineStarted() {
        return engineStarted;
    }
}