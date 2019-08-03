public class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
        number = (int) Math.random() * 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
