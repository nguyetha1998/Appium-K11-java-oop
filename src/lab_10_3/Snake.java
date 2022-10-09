package lab_10_3;

public class Snake extends Animal{
    public Snake(String name, int speed, boolean isWings) {
        super(name, speed, isWings);
    }

    @Override
    public Animal setName(String name) {
        this.name= name;
        return this;
    }

    @Override
    public Animal setSpeed(int speed) {
        this.speed=speed;
        return this;
    }

    @Override
    public Animal setWings(boolean wings) {
        this.isWings= wings;
        return this;
    }

    public Snake() {
    }


}
