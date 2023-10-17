package seminar2_d;

import seminar2_d.Actor;

import java.util.List;

public interface MarketBehavior {
    void acceptToMarket(Actor actor);
    void relaseFromMarket(List<Actor> actors);
    void update();


}
