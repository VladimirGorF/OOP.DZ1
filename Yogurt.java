/*
 * создали Молочного наследника с новым полем  - жирность
 */
public class Yogurt extends Milk {
    private int fatContent;

    public Yogurt(String name, int price, int volume, int fatContent) {
        super(name, price, volume);
        this.fatContent = fatContent;
    }

    public int getFatContent() {
        return fatContent;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" , fatContent: %d ", fatContent);
    }
}