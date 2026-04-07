public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;
    
    public AnimalRegistry() {
        sheepPrototype = new Sheep();
        cowPrototype = new Cow();
        horsePrototype = new Horse();
    }
    
    public Sheep createSheep() {
        return (Sheep) sheepPrototype.clone();
    }
    
    public Cow createCow() {
        return (Cow) cowPrototype.clone();
    }
    
    public Horse createHorse() {
        return (Horse) horsePrototype.clone();
    }
}