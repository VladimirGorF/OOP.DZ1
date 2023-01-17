public class Raviolly extends Product {
    private int size;

    public Raviolly(String name, int price, int size) {
        super(name, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        
        return super.toString() + String.format("size: %d", size);
    }
}
