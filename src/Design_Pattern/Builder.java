package Design_Pattern;

public class Builder {
    public static void main(String[] args) {
        car c = new car();
        c = c.setWheels(4).setModel("ferric").setYear(2043).setId(2343).build();
        System.out.println(c);
    }

    public static class car {
        private int wheels;
        private String model;
        private int year;
        private int id;

        public car() {
        }

        @Override
        public String toString() {
            return "car{" +
                    "wheels=" + wheels +
                    ", model='" + model + '\'' +
                    ", year=" + year +
                    ", id=" + id +
                    '}';
        }

        public car(int wheels, String model, int year, int id) {
            this.wheels = wheels;
            this.model = model;
            this.year = year;
            this.id = id;
        }

        public car setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public car setModel(String model) {
            this.model = model;
            return this;
        }

        public car setYear(int year) {
            this.year = year;
            return this;
        }

        public car setId(int id) {
            this.id = id;
            return this;
        }

        public car build() {
            return new car(wheels, model, year, id);
        }
    }

}
