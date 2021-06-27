package com.example.honourproject;

public class Question {

    public String mQuestion[] = {
            "Which loop function is use for repeats a statement or group?",
            "Which data types is not include in non-primitive data?",
            "Which options can not be a string?",
            "Can we have multiple object in one class? ",
            "Which Data type is not correct?" +
                    " boolean = Hello " +
                    " String = 'Hello' " +
                    " int = 4 " +
                    " float = 5.9f ",

    };

    private String mChoices[][] = {
            {"While Loop", "For Loop", "Do...While Loop", "Not these three"},
            {"Classes", "boolean", "Array", "Interface"},
            {"Hello","333", "Good ! Job!", "Java Script"},
            {"Yes","Not sure", "No", "I don't know"},
            {"float","int", "String", "boolean"},


    };

    private String mCorrectAnswers[] = {"While Loop", "boolean", "333", "Yes", "boolean"};

    public String getQuestion(int a){
        String question = mQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
