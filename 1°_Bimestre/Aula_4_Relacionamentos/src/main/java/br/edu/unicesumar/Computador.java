package br.edu.unicesumar;

public class Computador {
    private Monitor monitor;

    public Computador(){

    }

    private void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }

    public void conectarMonitor(Monitor monitor){
        setMonitor(monitor);
    }

}
