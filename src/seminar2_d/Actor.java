package seminar2_d;

public abstract class Actor implements ActorBehaviour {
    protected final String name;
    protected boolean isMakeOrder;

    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;

    }

    public abstract String getName();

}
