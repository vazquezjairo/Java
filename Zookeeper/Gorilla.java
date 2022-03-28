public class Gorilla extends Mammal {
    
    public Gorilla (int energyLevel) {
        super(energyLevel);
    }
    public void throwSomething() {
        System.out.println("The Gorilla has thrown something");
        this.energyLevel -= 5;
    }
    public void eatBananas() {
        System.out.println("The Gorilla is satisfied");
        this.energyLevel += 10;
    }
    public void climb() {
        System.out.println("This Gorilla has climbed a tree");
        this.energyLevel -= 10;
    }
}
