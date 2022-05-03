package com.bridgelab.moodAnalyser;
/*
* @author atik
* Moode analyser program
* */
public class MoodAnalyserMain {
    public static void main(String[] args) {
        MoodAnalyser mood = new MoodAnalyser("I am in happy Mood");
        System.out.println(mood.analyseMood());
    }
}
