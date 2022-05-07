package com.bridgelab.moodAnalyser;
/*
* @author atik
* Moode analyser program
* */
public class MoodAnalyserMain {
    private static String message;
    public MoodAnalyserMain() {
    }

    public MoodAnalyserMain(String message) {
        this.message = message;
    }
    /**
     * create a default constructor name as MoodAnalyserMain
     */
    public static void main(String[] args) throws MoodAnalyser{
        try {
            if (message.contains("Sad"))
                System.out.println("SAD");
            else
                System.out.println("HAPPY");
        }
        catch (Exception e) {
            if (message == null)
                throw new MoodAnalyser("Please provide valid mood, dont provide null in arguments",
                        MoodAnalyser.Exception_Type.NULL);
            else
                throw new MoodAnalyser("Please provide valid mood, dont keep empty in arguments",
                        MoodAnalyser.Exception_Type.EMPTY);
        }
    }
}
