//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 public static void main(String[] args) {
     Dog dog1 = new Dog("Барбос", 500, 8);
     Dog dog2 = new Dog("Шарик", 800, 20);

    Cat[] cat = new Cat[4];
    cat[0] = new Cat("Барсик", 200);
    cat[1] = new Cat("Василий", 100);
    cat[2] = new Cat("Tom", 250);
    cat[3] = new Cat("Мурзик", 150);

    cat[0].getInform("Барсик", 200);
    cat[1].getInform("Василий", 100);
    cat[2].getInform("Tom", 250);
    cat[3].getInform("Мурзик", 150);
    dog1.getInform("Барбос", 500, 8);
    dog2.getInform("Шарик", 800, 20);

    System.out.println("Всего животных: " + Animal.getAnimalCount());
    System.out.println("Всего котов: " + Cat.getCatCount());
    System.out.println("Всего собак: " + Dog.getDogCount());
}
