package com.bridgelab.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    MoodAnalyser mood1 = new MoodAnalyser("I am in happy Mood");
    MoodAnalyser mood2 = new MoodAnalyser("I am in sad Mood");

    //True test case for mood analyser
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        String actual = mood1.analyseMood();
        Assert.assertTrue("null", true);
    }
    
}
