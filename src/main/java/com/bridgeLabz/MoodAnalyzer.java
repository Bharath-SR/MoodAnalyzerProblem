package com.bridgeLabz;

public class MoodAnalyzer {



    String validate(String str){
        if(str.contains("Any Mood")){
            return "happy";
        }else{
            return "sad";
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer md=new MoodAnalyzer();
        System.out.println(md.validate("I am in Any Mood"));
    }
}
