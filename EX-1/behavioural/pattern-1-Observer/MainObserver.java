public class MainObserver {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.attach(new RoverObserver("Observer A"));
        subject.attach(new RoverObserver("Observer B"));

        subject.setState("State 1");
        subject.setState("State 2");
    }
}