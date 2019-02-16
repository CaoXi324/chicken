public class Chick extends Chicken {
    public Chick(String name, int price) {
        super(name, price);
    }

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void getNumber(int number) {
        setNumber(number);
        System.out.println("小鸡有" + number + "只");
    }
}
