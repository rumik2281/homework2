public class Application {

    static void staticMethod(Animal animal, int i) {
        animal.setName(String.valueOf(i));
        System.out.println(animal.getName());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            var animal = new Animal(null);
            System.out.println(animal.getName());
            staticMethod(animal, i);
            animal.setAge(i);
            System.out.println(animal);
        }
    }
}
