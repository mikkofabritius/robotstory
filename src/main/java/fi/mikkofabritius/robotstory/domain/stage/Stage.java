package fi.mikkofabritius.robotstory.domain.stage;

/**
 * @author mikko.fabritius
 */
public class Stage {
    private StageCorner topLeft;
    private StageCorner topRight;
    private StageCorner bottomRight;
    private StageCorner bottomLeft;

    private int widthCm;
    private int heightCm;
    private int widthPx;
    private int heightPx;

    public Stage() {

    }

    public StageCorner getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(StageCorner topLeft) {
        this.topLeft = topLeft;
    }

    public StageCorner getTopRight() {
        return topRight;
    }

    public void setTopRight(StageCorner topRight) {
        this.topRight = topRight;
    }

    public StageCorner getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(StageCorner bottomRight) {
        this.bottomRight = bottomRight;
    }

    public StageCorner getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(StageCorner bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public int getWidthCm() {
        return widthCm;
    }

    public void setWidthCm(int widthCm) {
        this.widthCm = widthCm;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    public int getWidthPx() {
        return widthPx;
    }

    public void setWidthPx(int widthPx) {
        this.widthPx = widthPx;
    }

    public int getHeightPx() {
        return heightPx;
    }

    public void setHeightPx(int heightPx) {
        this.heightPx = heightPx;
    }
}
