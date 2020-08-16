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
        if(message.contains("sad"))
            return "SAD";
        else if (message.contains("happy"))
            return "HAPPY";
        else
            return null;
        } catch ( NullPointerException exception ) {
            return "HAPPY";
        }
    }
}


