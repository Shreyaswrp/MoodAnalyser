package com.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenSad_ShouldReturn_SAD() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
        String moodType = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", moodType);
    }

    @Test
    public void givenHappy_ShouldReturn_HAPPY() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in happy mood");
        String moodType = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", moodType);
    }
}
