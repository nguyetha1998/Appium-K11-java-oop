package lab9;

public class Animals {
    private String name;
    private int speed;
    private boolean withWings;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWithWings() {
        return withWings;
    }

    public Animals(String name, int speed, boolean withWings) {
        this.name = name;
        this.speed = speed;
        this.withWings = withWings;
    }

    protected static AnimalsBuilder builder() {
        return new AnimalsBuilder();
    }

    //Inner class
    public static class AnimalsBuilder {
        private String name;
        private int speed;
        private boolean withWings;

        public Animals build() {
            return new Animals(name, speed, withWings);
        }

        public AnimalsBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AnimalsBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public AnimalsBuilder setWithWings(boolean withWings) {
            this.withWings = withWings;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", withWings=" + withWings +
                '}';
    }
}
