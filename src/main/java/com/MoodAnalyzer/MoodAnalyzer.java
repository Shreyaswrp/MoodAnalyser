package com.MoodAnalyzer;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if ( message.length() == 0 )
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Please enter proper mood");
            else if ( message.contains("sad") )
                return "SAD";
            else if ( message.contains("happy") )
                return "HAPPY";
            else
                return null;
        } catch ( NullPointerException exception ) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Please enter proper mood");
        }
    }
}


