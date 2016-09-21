package fi.mikkofabritius.robotstory.domain.stage;

/**
 * Class containing information about stages corner.
 *
 * @author mikko.fabritius
 */
class StageCorner {
    private StageCoordinate coordinate;

    public StageCoordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(StageCoordinate coordinate) {
        this.coordinate = coordinate;
    }
}
