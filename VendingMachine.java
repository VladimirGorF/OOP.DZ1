import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * cоздаем новый класс вендингмашин. Тип данных хранящихся в листе - Product.
 */
public class VendingMachine {
    private List<Product> products = new ArrayList<>();

    public VendingMachine(List<Product> products) { // конструктор
        this.products = products;
    }

    public List<Product> getProducts() {    // геттер
        return products;
    }

    public VendingMachine(){    // пустой конструктор

    }

    /**
     * @param product конструктор с конкретным продуктом, который сразу инициализирует создание нового списка с этим продуктом
     */
    public VendingMachine(Product product) {           
        this(new ArrayList<>(Arrays.asList(product)));
    }

    public void addProduct(Product product) {    //  добавление продукта в список
        products.add(product);
    }

    /**
     * @param name  ищем совпадения
     * @return  возвращаем продукт, в котором есть это имя
     */
    public Product find(String name) {        
        for (Product product : products) {
            if(product.getName().contains(name)){
                return product;
            }
        }
        return null;
    }

}