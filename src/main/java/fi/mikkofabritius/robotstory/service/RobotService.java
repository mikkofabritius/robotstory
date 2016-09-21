package fi.mikkofabritius.robotstory.service;

import fi.mikkofabritius.robotstory.domain.stage.StageCoordinate;

/**
 * @author mikko.fabritius
 */
public interface RobotService {

    void detectRobots();
    void driveRobotTo(StageCoordinate coordinate);

}
