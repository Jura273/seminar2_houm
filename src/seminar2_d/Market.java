package seminar2_d;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavior, QueueBehavior{
    private final List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " Зашел в магазин");
        takeInQueue(actor);

    }

    @Override
    public void relaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            queue.remove(actor);
            System.out.println(actor.getName() + "Вышел из магазина");
        }

    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        relaseFromQueue();

    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + "Встал в очередь");
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + "Сделал заказ");
            }

        }

    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + "Получил свой заказ");
            }

        }

    }

    @Override
    public void relaseFromQueue() {
        List<Actor> actorList = new ArrayList<>();
        for (Actor actor : queue) {
            if(actor.isTakeOrder()){
                actorList.add(actor);
                System.out.println(actor.getName() + "Вышел из очереди");
            }

        }
        relaseFromMarket(actorList);


    }
}
