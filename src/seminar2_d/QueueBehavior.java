package seminar2_d;

public interface QueueBehavior {
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void relaseFromQueue();

}
