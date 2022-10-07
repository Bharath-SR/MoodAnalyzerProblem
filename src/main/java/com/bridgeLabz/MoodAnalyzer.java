package com.bridgeLabz;

public class MoodAnalyzer {

    String message;

//    public MoodAnalyzer() {
//    }
//
//    public MoodAnalyzer(String message) {
//        this.message = message;
//
//    }
//
//    public String analyseMood() {
//        try {
//            if (this.message.contains("sad")) {
//                return "sad";
//            } else {
//                return "happy";
//            }
//        } catch (NullPointerException e) {
//            return "Entered value is null";
//        }
//    }
public static void main(String[] args) {
    try{
       String message=null;
        if(message==null){
            throw new CustomExceptions("Given String is null");
        }
        else if(message.contains("Happy")){
            System.out.println("Happy");
        }else{
            System.out.println("Sad");
        }
    }catch(CustomExceptions ex){
        System.out.println(ex);
    }
}
}
