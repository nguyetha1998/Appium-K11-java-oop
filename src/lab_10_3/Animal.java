package lab_10_3;

public abstract class  Animal {
    protected String name;
    protected int speed;
    protected boolean isWings;

    public Animal() {
    }

    public Animal(String name, int speed, boolean isWings) {
        this.name = name;
        this.speed = speed;
        this.isWings = isWings;
    }

    public String getName() {
        return name;
    }

    public abstract Animal setName(String name);

    public int getSpeed() {
        return speed;
    }

    public abstract Animal setSpeed(int speed);

    public boolean isWings() {
        return isWings;
    }

    public abstract Animal setWings(boolean wings);

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", isWings=" + isWings +
                '}';
    }
}
