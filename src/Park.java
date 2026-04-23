public class Park {

    public static class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("Аттракцион:" + name);
            System.out.println("Время работы:" + workingHours);
            System.out.println("Стоимость:" + price + "руб.");
        }
    }
}
