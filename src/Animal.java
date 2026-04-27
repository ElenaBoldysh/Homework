public class Animal {
    private String name;
    private int runDistance;
    private int swimDistance;
    protected static int animalCount = 0;

    public Animal(String name, int runDistance, int swimDistance) {
       this.name = name;
       this.runDistance = runDistance;
       this.swimDistance = swimDistance;
        animalCount++;
    }

    public Animal(String name, int runDistance) {
        this.name = name;
        this.runDistance = runDistance;
        animalCount++;
    }

    /*public Animal(String name) {
        this.name = name;
    }*/

    public void getInform(String name, int runDistance) {
        System.out.println("Кот " + name + " пробежал " + runDistance + " м.");
    }
    public void getInform(String name, int runDistance, int swimDistance) {
        System.out.println("Пёс " + name + " пробежал " + runDistance + " м. и проплыл " + swimDistance + " м.");
    }

// Счетчик животных
    public static int getAnimalCount() {
        return animalCount;
    }

}
