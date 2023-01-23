import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<ArrayList<DollHouse>> collection = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ArrayList<DollHouse> dollHouses = new ArrayList<DollHouse>();
            for (int j = 0; j < 3; j++) {
                DollHouse dollHouse = new DollHouse();
                dollHouse.setDoll(new Doll());
                dollHouses.add(dollHouse);
            }
            collection.add(dollHouses);
        }
    }
}
    class Doll
{
public int size;
public String name;
        }
class DollHouse
{
    private int width;
    public Doll doll;

    public void setDoll(Doll doll) {
    }
}
