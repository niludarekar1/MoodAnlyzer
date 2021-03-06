package com.bridgelabz;

public class MoodAnalyzer {
    public String message;

    //DEFAULT CONSTRUCTOR
    public MoodAnalyzer() {

    }

    //PARAMETERISED CONSTRUCTOR
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    //METHOD TO ANALYZE MOOD
    public String analyseMood() {
        {
            try {
                if (message.contains("Sad"))
                    return "SAD";
                else
                    return "HAPPY";
            } catch (Exception e) {
                e.getStackTrace();
            }
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        System.out.println("******************** WELCOME TO MOOD ANALYSER ********************");
    }
}