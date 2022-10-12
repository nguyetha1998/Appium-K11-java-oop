package lab_11;

public class Animals implements MoveAble, FlyAble {
    private String name;
    private int speed;
    private boolean isWings;

    public Animals(String name, int speed, boolean isWings) {
        this.name = name;
        this.speed = speed;
        this.isWings = isWings;
    }

    @Override
    public boolean flyAble() {
        return isWings;
    }

    @Override
    public void setFlyAble(boolean flyAble) {
        this.isWings = flyAble;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", isWings=" + isWings +
                '}';
    }
}
