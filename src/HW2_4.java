public class HW2_4 {
    private static int countCat = 0;
    private static int countDog = 0;
    private static int countAnimal = 0;

    public static void incrementCount(String type) {
        if (type.equals("Cat")) {
            countCat++;
        } else if (type.equals("Dog")) {
            countDog++;
        } else {
            countAnimal++;
        }
    }

    public static int getCount() {
        return countAnimal;
    }

    public static int getCount(String type) {
        if (type.equals("Cat")) {
            return countCat;
        } else if (type.equals("Dog")) {
            return countDog;
        }
        return countAnimal;
    }

    public static void main(String[] args) {
        incrementCount("Cat");
        incrementCount("Dog");

        //Cat[] сat = new Cat[4];

        //сat[0] = new Cat("Барсик", 200, 0);
        //сat[1] = new Cat("Василий", 150, 5);
        //сat[2] = new Cat("Tom", 100,0);
        //сat[3] = new Cat("Мурзик", 250, 0);

        Dog dog = new Dog("Барбос", 500, 8);
        Cat cat = new Cat("Борис", 150);
        Cat twocat = new Cat("Вася",200);

        cat.getInform("Борис", 150);
        cat.getInform("Вася", 250);



        System.out.println("Всего животных: " + countAnimal);
        System.out.println("Всего котов: " + countCat);
        System.out.println("Всего собак: " + countDog);
    }
}