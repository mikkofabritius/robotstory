package fi.mikkofabritius.robotstory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * the main class
 */
@Controller
@EnableAutoConfiguration
public class RobotStoryCommander {

    @RequestMapping("/")
    @ResponseBody
    String root() {
        return "Robot commander ready!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RobotStoryCommander.class, args);
    }
}
