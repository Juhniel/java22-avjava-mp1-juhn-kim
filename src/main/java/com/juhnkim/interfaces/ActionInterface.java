package com.juhnkim.interfaces;

public interface ActionInterface {

    public void changeMode(); // Byt State
    public void set(); // Visa tid eller datum
    public void readyToSet(String userInput);  // Skriva in nya tid eller datum
}

