import stanford.karel.SuperKarel;

public class Test extends SuperKarel {
    @Override
    public void run() {
        go();
        while (crystalsOnCell()) {
            go();
        }
    }
}
