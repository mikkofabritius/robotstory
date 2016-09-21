package fi.mikkofabritius.robotstory.service;

import fi.mikkofabritius.robotstory.domain.stage.StageCoordinate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author mikko.fabritius
 */
@Component
public class RobotServiceImpl implements RobotService {
    private static final Logger LOG = LoggerFactory.getLogger(RobotServiceImpl.class);

    @Autowired
    private StageService stageService;

    public RobotServiceImpl() {
        LOG.info("Robot service instantiated");
    }

    @Override
    public void detectRobots() {
    }

    @Override
    public void driveRobotTo(StageCoordinate coordinate) {

    }
}
