/*
 * создали наследника от Product
 */
public class Chocolate extends Product{    
    private int weight;   //  добавли новое поле weight

    public Chocolate(String name, int price, int weight) {
        super(name, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
/*
 * переопределяем метод для отражения всех новых полей в том числе
 */
    @Override
    public String toString() { 
        return super.toString() + String.format(", weight: %d", weight);
    }
    
}
