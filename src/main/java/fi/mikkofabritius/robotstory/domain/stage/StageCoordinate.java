package fi.mikkofabritius.robotstory.domain.stage;

/**
 * Class containing coordinate information within {@link Stage}.
 *
 * @author mikko.fabritius
 */
public class StageCoordinate {
    private int x;
    private int y;

    public StageCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
