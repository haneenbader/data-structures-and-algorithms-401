package stack.and.queue;

public class AnimalShelter {
//  instanceof:  object is an instance of the specified type (class or subclass or interface)
//animal can be either a dog or a cat object.
    Queue<Animal> cat = new Queue<>();
    Queue<Animal> dog = new Queue<>();

    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            dog.enqueue(animal);
        } else if (animal instanceof Cat) {
            cat.enqueue(animal);
        }
    }
//    either a dog or a cat, based on preference.
//
//    If pref is not "dog" or "cat" then return null.
    public Object dequeue(String pref) {
        if (pref.equals("cat")) {
            return cat.dequeue();
        } else  if (pref.equals("dog")) {
            return dog.dequeue();
        }
        return null;
    }
}
