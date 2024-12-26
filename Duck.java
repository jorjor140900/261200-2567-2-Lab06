public class Duck extends Animal implements Flyable{
    String name;
    public Duck(String name) {
        this.name = name;
    }

    public String toString() {
        return "ped " + this.name;
    }

    @Override
    void sound() {
        System.out.println("quack quack");
    }

    @Override
    public void fly() {
        System.out.println("prbbb");
    }

    @Override
    public void glide() {
        System.out.println("yohhh");
    }

    void clean(Animal animal) {
        System.out.println(this + " is cleaning " + animal);
    }
}
