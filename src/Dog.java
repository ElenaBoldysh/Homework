public class Dog extends Animal {
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;
    private final String name;
    private final int runDistance;
    private final int swimDistance;

    public Dog(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    @Override

    public void getInform(String name, int runDistance, int swimDistance) {
        System.out.println( name + " пробежал " + runDistance + " м. и проплыл " + swimDistance + " м.");
    }

  //  @Override
  //  public void run(int runDistance) {
 //       if (runDistance >=0 && runDistance <= maxRunDistance) {
  //          System.out.println("Собака пробежала " + runDistance +" м.");
  //      } else {
  //          System.out.println("Собака не может пробежать больше 500 м.");
  //      }
   // }

  //  @Override
   // public void swim(int swimDistance) {
  //      if (swimDistance >= 0 && swimDistance <= maxSwimDistance) {
   //         System.out.println("Собака проплыла " + swimDistance + " м.");
   //     } else {
   //         System.out.println("Собака не может проплыть больше 10 м.");
   //     }
   // }

   // public static void main(String[] args) {
    //    Dog[] dog = new Dog[3];
//
     //   dog [0] = new Dog ("Барбос", 500,8);
     //   dog [1] = new Dog ("Шарик", 400, 5);
     //   dog [2] = new Dog ("Фёдор", 300, 4);
   // }
}
