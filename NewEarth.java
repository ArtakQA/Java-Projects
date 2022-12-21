import java.time.*;

public class World {
    static int Air = 1;
    static  double Grass = 1/0.0;
    static boolean lightTime = false;
}
class Sun {

            public boolean light () {
                LocalTime LightTimeStart = LocalTime.of(8, 0, 0);
                LocalTime LightTimeEnd = LocalTime.of(20, 0, 0);
                LocalTime CurrentTime = LocalTime.now();
                int CompStart = CurrentTime.compareTo(LightTimeStart);
                int CompEnd = CurrentTime.compareTo(LightTimeEnd);
                if (CompStart > 0 && CompEnd < 0) {
                    World.lightTime = true;
                }
                return World.lightTime;
            }
    }
class Tree {
    public void ProOxyg() {
        int i;
        for (i = 0; i <= 12; i++) {
            World.Air++;
        }
    }
    public void nightOxig() {
                System.out.println("Now is a Dark time");
        }
}
class Frog {
    int stomach = 0;
   private int i = 0;
    public void Eat() {

            for (i = 12; i >= 0; i--) {
                World.Grass--;
                stomach++;
            }
        }

    public void Breath() {
         for (i = 12; i >= 0; i--) {
                World.Air--;
            }
    }
    public void Sleeping () {
        System.out.println("Now Frog is sleeping");
    }
}


class Main {
    public static void main(String[] args) {
        Sun sun = new Sun();
        Tree tree = new Tree();
        Frog frog = new Frog();
        sun.light();

            if (sun.light()) {
                tree.ProOxyg();
                frog.Eat();
                frog.Breath();
                System.out.println("Now we are living");
        }
            else {
                tree.nightOxig();
                frog.Sleeping();
            }
    }
}
