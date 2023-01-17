public class Milk extends Product{
    private int volume;

    public Milk(String name, int price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {  
        return super.toString() + String.format(" , volume: %d", volume);
    }
 
}