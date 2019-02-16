public class Hen extends Chicken {
    public Hen(String name, int price) {
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
        System.out.print("母鸡有" + number + "只，");
    }
}
