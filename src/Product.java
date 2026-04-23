public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean customerReservationStatus;

    // Конструктор класса
    public Product(String name, String productionDate,
                 String manufacturer, String countryOfOrigin,
                 double price, boolean customerReservationStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.countryOfOrigin = countryOfOrigin;
    }

    // Метод для вывода информации об объекте в консоль
    public void getInform() {
        System.out.println("Название:" + name);
        System.out.println("Дата производства:" + productionDate);
        System.out.println("Производитель:" + manufacturer);
        System.out.println("Страна происхождения:" + countryOfOrigin);
        System.out.println("Цена:" + price + "руб.");
        System.out.println("Забронирован:" + (customerReservationStatus? "Да" : "Нет"));
    }

}