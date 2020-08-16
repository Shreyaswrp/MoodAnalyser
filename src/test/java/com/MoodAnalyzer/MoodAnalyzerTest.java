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
    @Test
    public void givenNull_ShouldThrow_ExceptionWithType() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
            String moodType = moodAnalyzer.analyseMood();
        } catch ( MoodAnalysisException exception ) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, exception.type);
            exception.getMessage();
        }
    }
    @Test
    public void givenEmpty_ShouldThrow_ExceptionWithType() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
            String moodType = moodAnalyzer.analyseMood();
        } catch ( MoodAnalysisException exception ) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, exception.type);
            exception.getMessage();
        }
    }
}
