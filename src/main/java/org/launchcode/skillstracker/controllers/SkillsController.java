package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String home() {
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Python</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String form() {
        return "<html>" +
                    "<body>" +
                        "<form method='post' action=''>" +
                            "<p><input placeholder='name' name='name'></p>" +
                            "<p><label for='firstFav'>First favorite language:</label>" +
                            "<select name='favoriteOne' id='firstFav'>" +
                                "<option value='java'>Java</option>" +
                                "<option value='javaScript'>JavaScript</option>" +
                                "<option value='python'>Python</option>" +
                            "</select></p>" +
                            "<p><label for='secondFav'>Second favorite language:</label>" +
                            "<select name='favoriteTwo' id='secondFav'>" +
                                "<option value='java'>Java</option>" +
                                "<option value='javaScript'>JavaScript</option>" +
                                "<option value='python'>Python</option>" +
                            "</select></p>" +
                            "<p><label for='thirdFav'>Third favorite language:</label>" +
                            "<select name='favoriteThree' id='thirdFav'>" +
                                "<option value='java'>Java</option>" +
                                "<option value='javaScript'>JavaScript</option>" +
                                "<option value='python'>Python</option>" +
                            "</select></p>" +
                            "<p><input type='submit' value='Submit'></p>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String formResults(@RequestParam String name, @RequestParam String favoriteOne, @RequestParam String favoriteTwo, @RequestParam String favoriteThree) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<h3>Your Favorite Languages</h3>" +
                "<ol>" +
                "<li>" + favoriteOne + "</li>" +
                "<li>" + favoriteTwo + "</li>" +
                "<li>" + favoriteThree + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}
