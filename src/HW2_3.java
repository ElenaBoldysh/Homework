public class HW2_3 {
    public static void main(String[] args) {
        // Объявляем массив объектов Product
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Honor Magic7", "01.01.2025",
                "HONOR", "China", 79990, true);
        productsArray[2] = new Product("iPhone 16", "01.05.2024",
                "Apple", "China", 53390, false);
        productsArray[3] = new Product("Xiaomi 15T Pro", "01.08.2025",
                "Xiaomi", "China", 61090, true);
        productsArray[4] = new Product("Galaxy Z Fold7", "01.02.2025",
                "Samsung Corp.", "Korea", 139790, false);

        for (Product product : productsArray) {
            product.getInform();
        }
    }
}

