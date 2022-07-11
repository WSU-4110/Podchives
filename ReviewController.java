package com.example.project;
//package com.example.thymeleafdemo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Arrays;
@Controller

public class ReviewController {

    @GetMapping ("/review")
    String getReview(Model model){
        model.addAttribute("review",Arrays.asList(
                new userReview("Still Processing", "I liked it, can listen to it all day" ,5),
        new userReview("BBC", "Works everytime, and they update this line up!" ,10)

               // new userReview(userReview.getName(), userReview.getReview() ,userReview.getRating())
        ));

        return "review";
    }
}
