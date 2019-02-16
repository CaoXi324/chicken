public class Caculate {
    public static void main(String[] args) {
        Chicken cock = new Cock("公鸡", 5);
        Chicken hen = new Hen("母鸡", 3);
        Chicken chick = new Chick("小鸡", 1 / 3);
        int g, m, x;
        for (g = 0; g <= 20; g++) {
            for (m = 0; m <= 33; m++) {
                for (x = 0; x <= 100; x++) {
                    if ((5 * g + 3 * m + x / 3 == 100) && (g + m + x == 100)) {
                        cock.getNumber(g);
                        ((Hen) hen).getNumber(m);
                        ((Chick) chick).getNumber(x);

                    }

                }
            }
        }

    }
}
