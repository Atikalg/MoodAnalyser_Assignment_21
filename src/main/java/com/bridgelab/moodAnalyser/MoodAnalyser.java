package com.bridgelab.moodAnalyser;

public class MoodAnalyser {
    static String message;
    //constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }
    //Method for mood analyse
    public static String analyseMood() {
        if (message.equalsIgnoreCase("I am in sad mood"))
            return "SAD";
        else if (message.equalsIgnoreCase("I am in happy mood"))
            return "HAPPY";
        else
            return "No Match";
    }
}
