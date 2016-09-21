package fi.mikkofabritius.robotstory.domain.robot;

import fi.mikkofabritius.robotstory.domain.stage.StageCoordinate;

/**
 * Class representing robot information.
 *
 * @author mikko.fabritius
 */
public class Robot {
    private String id;
    private String name;
    private StageCoordinate coordinate;

    public Robot() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StageCoordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(StageCoordinate coordinate) {
        this.coordinate = coordinate;
    }
}
