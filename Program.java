public class Program {
    public static void main(String[] args) {
        VendingMachine vend = new VendingMachine(new Product("Ochakovskiy", 33)); // создаем экземляр вендинговой машины
                                                                                  // и сразу вставляем в него 1 новый Продукт
        vend.addProduct(new Chocolate("Babayevskiy", 12, 100));
        vend.addProduct(new Chocolate("RotFront", 15, 100));

        vend.addProduct(new Milk("Derevenskoe", 28, 1));
        vend.addProduct(new Milk("Alekseevskoe", 28, 1));

        vend.addProduct(new Raviolly("Italian", 44, 18));
        vend.addProduct(new Yogurt("Mordovskiy", 38, 1, 18));

        for (Product item : vend.getProducts()) {
            System.out.print(item.getClass());
            System.out.println(item);
        }

        System.out.printf("Результаты поиска: %s", vend.find("Mord")); // запускаем поиск и сразу выводим результат
        System.out.println();

    }
}   


