package com.bridgeLabz;

public class MoodAnalyzer {

    String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;

    }

    public String analyseMood() {
        try {
            if (this.message.contains("sad")) {
                return "sad";
            } else {
                return "happy";
            }
        } catch (NullPointerException e) {
            return "happy";
        }
    }
}
