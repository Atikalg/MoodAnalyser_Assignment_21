package com.bridgelab.moodAnalyser;
/*
* @author atik
* Moode analyser program
* */
public class MoodAnalyserMain {
    public static void main(String[] args) {
        MoodAnalyser mood = new MoodAnalyser(null);
        System.out.println(mood.analyseMood());
    }
}
