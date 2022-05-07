package com.bridgelab.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void given_SadMood_Should_Return_SAD() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am in Sad Mood");
        String mood;
        try {
            Assert.assertSame("SAD", MoodAnalyser.Exception_Type.NULL);
            System.out.println(moodAnalyser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am in Happy Mood");
        String mood;
        try {
            //mood = moodAnalyser.analyseMood();
           Assert.assertSame("HAPPY", MoodAnalyser.Exception_Type.EMPTY);
            System.out.println(moodAnalyser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
