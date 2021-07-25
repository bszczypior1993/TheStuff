package pl.futurecollars.lesson5.task5;

public class Car extends Vehicle implements HasEngine {
    private boolean engineStarted;

    @Override
    public void startEngine() {
        engineStarted = true;
    }

    @Override
    public void stopEngine() {
        engineStarted = false;
    }

    @Override
    public boolean isEngineStarted() {
        return engineStarted;
    }
}