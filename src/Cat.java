public class Cat extends Animal {
    private final int maxRunDistance = 200;
    private final String name;
    private final int runDistance;
    private final int swimDistance = 0; //Коты не умеют плавать

    public Cat(String name, int runDistance) {
            this.name = name;
            this.runDistance = runDistance;
        }


    //@Override
    //public void run(int runDistance) {
        //if (runDistance >= 0 && runDistance <= maxRunDistance) {
            //System.out.println("Кот пробежал " + runDistance + " м.");
        //} else {
           // System.out.println("Кот не может пробежать больше 200 м.");
       // }
   // }

    //@Override
    //public void swim(int swimDistance) {
       // System.out.println("Кот не умеет плавать.");
    //}

    @Override
    public void getInform(String name, int runDistance) {
        System.out.println( name + " пробежал " + runDistance + " м.");
    }

   public static void main(String[] args) {
   final Cat[] cat = new Cat[4];
    cat[0] = new Cat("Барсик", 200);
    cat[1] = new Cat("Василий", 150);
    cat[2] = new Cat("Tom", 100);
    cat[3] = new Cat("Мурзик", 250);


   }

}
