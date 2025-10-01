public class RoverObserver implements Observer {
    private String name;
    public RoverObserver(String name) {
        this.name = name;
    }
    @Override
    public void update(String state) {
        System.out.println(name + " received update: " + state);
    }
}