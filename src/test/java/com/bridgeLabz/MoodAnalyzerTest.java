package com.bridgeLabz;
import org.junit.Assert;
import org.testng.annotations.Test;

public class MoodAnalyzerTest {

//    @Test
//    public void checking_Mood_Analyser_Returns_Sad(){
//        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
//        Assert.assertEquals("sad",moodAnalyser.validate("I am in sad mood "));
//    }
//    @Test
//    public void checking_Mood_Analyser_Returns_happy(){
//        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
//        Assert.assertEquals("happy",moodAnalyser.validate("I am in Any Mood"));
//    }
    @Test
    public void checking_Mood_Analyser_Null_Pointer_Exception(){
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        Assert.assertEquals("happy",moodAnalyser.analyseMood());


}

}
