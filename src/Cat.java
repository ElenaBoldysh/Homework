public class Cat extends Animal {
    private int maxRunDistance = 200;
    private int maxSwimDistance = 0; //Коты не умеют плавать

    public void getInform(String name, int runDistance) {
        if (runDistance >= 0 && runDistance <= maxRunDistance) {
            System.out.println("Кот " + name + " пробежал " + runDistance + " м.");
        } else {
            System.out.println(name + " не может пробежать больше 200 м.");
        }
    }

    // Счетчик котов
    private static int catCount = 0;
    public Cat(String name, int runDistance) {
        super(name, runDistance);
        catCount++;
    }
    public static int getCatCount() {
        return catCount;
    }
}

