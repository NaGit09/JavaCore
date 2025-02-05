package Design_Pattern;

public class Facade {
    public static class Projector {
        public void on () {
            System.out.println("Mở máy chiếu");
        }
        public void off () {
            System.out.println("Tắt máy chiếu ");
        }
    }
    public static class Light {
        public void on () {
            System.out.println("Bật đèn ");
        }
        public void off () {
            System.out.println("Tắt đèn");
        }
    }
    public static  class Screen {
        public void up () {
            System.out.println("Kéo màn chiếu lên");
        }
        public void down () {
            System.out.println("Hạ màn chiếu xuống ");
        }
    }
    public static class Cinema {
        private Light light;
        private Screen screen;
        private Projector projector;

        public Cinema(Light light, Screen screen, Projector projector) {
            this.light = light;
            this.screen = screen;
            this.projector = projector;
        }

        public void StartFilm () {
            System.out.println("Bắt đầu xem phim ");
            projector.on();
            light.off();
            screen.down();
            System.out.println();
        }
        public void EndFilm () {
            projector.off();
            light.on();
            screen.up();
            System.out.println("Phim kết thúc");
        }
    }

    public static void main(String[] args) {
        Light light = new Light();
        Screen screen = new Screen();
        Projector projector = new Projector();
        Cinema cinema = new Cinema(light, screen, projector);
        cinema.StartFilm();
        cinema.EndFilm();
    }
}
