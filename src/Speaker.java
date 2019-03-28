public class Speaker extends Person {
    private int fee = 0;

    public Speaker(String name, int age) {
        super(name, age);
    }

    public Speaker(String name) {
        super(name);
    }

    public int getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Speaker " + this.getName() + " as a fee value of " + this.getFee()+".";
    }
}
