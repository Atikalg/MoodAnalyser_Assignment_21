package com.bridgelab.moodAnalyser;

public class MoodAnalyser extends Exception{
    public enum Exception_Type {
        NULL, EMPTY
    }
    public Exception_Type type;

    public MoodAnalyser(String message, Exception_Type type) {
        super(message);
        this.type=type;
    }
}
