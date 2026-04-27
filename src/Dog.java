public class Dog extends Animal {
    private int maxRunDistance = 500;
    private int maxSwimDistance = 10;

    public void getInform(String name, int runDistance, int swimDistance) {
        if (runDistance >= 0 && runDistance <= maxRunDistance & swimDistance >= 0 && swimDistance <= maxSwimDistance) {
            System.out.println("Пёс " + name + " пробежал " + runDistance + " м. и проплыл " + swimDistance + " м.");
        } else if (runDistance > maxRunDistance & swimDistance >= 0 && swimDistance <= maxSwimDistance){
            System.out.println("Пёс " + name + " проплыл " + swimDistance + " м., но он не может пробежать больше 500 м.");
        } else if (runDistance >= 0 && runDistance <= maxRunDistance & swimDistance >= maxSwimDistance){
            System.out.println("Пёс " + name + " пробежал " + runDistance + " м., но он не может проплыть больше 10 м.");
        } else {
            System.out.println("Пёс " + name + " не может пробежать больше 500 м. и проплыть больше 10 м.");
        }
    }

    //Счетчик собак
    private static int dogCount = 0;
    public Dog(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
        dogCount++;
    }
    public static int getDogCount() {
        return dogCount;
    }
}
