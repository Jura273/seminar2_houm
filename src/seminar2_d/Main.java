package seminar2_d;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Петр ");
        Human human2 = new Human("Михаил  ");
        market.acceptToMarket(human1);
        market.update();
        market.acceptToMarket(human2);
        market.update();



    }
}
