package Design_Pattern;

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        shape s = new shape("circle","red");
        System.out.println(s);
        shape s2 = s.clone();
        s2.setColor("blue");
        System.out.println(s2);
        shape s3 = s.clone();
        s3.setType("rounded");
        System.out.println(s3);
    }
    public static class shape  implements Cloneable {
        private String type;
        private String color;



        @Override
        public String toString() {
            return "shape{" +
                    "type='" + type + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }

        public shape(String type, String color) {
            this.type = type;
            this.color = color;
        }
        public shape clone() throws CloneNotSupportedException {
            return (shape) super.clone();
        }
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}
