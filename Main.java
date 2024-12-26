//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cow wagyu = new Cow();
        wagyu.sound();
        Duck donald = new Duck("donald");
        Duck daisy = new Duck("daisy");
        daisy.sound();
        Pig pood = new Pig();
        pood.sound();
        Owl hedwig = new Owl();
        hedwig.sound();

        donald.clean(wagyu);
        daisy.clean(donald);

        BeijingDuck fourseasons = new BeijingDuck("4ss");
        fourseasons.clean(daisy);
        fourseasons.fly();

        donald.clean(new Cow());
    }
}