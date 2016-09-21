package fi.mikkofabritius.robotstory;

import fi.mikkofabritius.robotstory.service.CommanderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * The main class.
 *
 * @author mikko.fabritius
 */
@EnableAutoConfiguration
@ComponentScan
public class RobotStoryCommander {
    private static final Logger LOG = LoggerFactory.getLogger(RobotStoryCommander.class);

    public static void main(String[] args) throws Exception {
        LOG.info("Booting up Robot Commander");
        ConfigurableApplicationContext context = SpringApplication.run(RobotStoryCommander.class, args);
        context.getBean(CommanderService.class).initialize();
    }
}
