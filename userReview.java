package com.example.project;
//package com.example.thymeleafdemo;

public class userReview {
    private String name;
    private String review;
    private int rating;

   public userReview(String name, String review, int rating){
        this.name = name;
        this.review = review;
        this.rating = rating;
    }


    public String getName(){
        return name;
    }
    public String getReview(){
        return name;
    }
    public int getRating(){
        return rating;
    }
}
