public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        
        Sheep sheep1 = registry.createSheep();
        sheep1.setName("Dolly");
        sheep1.display();
        
        Cow cow1 = registry.createCow();
        cow1.display();
        
        Horse horse1 = registry.createHorse();
        horse1.display();
        
        System.out.println("\nCloning animals...\n");
    
        Sheep sheep2 = registry.createSheep();
        sheep2.setName("Shaun");
        sheep2.display();
        
        Cow cow2 = registry.createCow();
        cow2.setSound("Moo Moo");
        cow2.display();
        
        Horse horse2 = registry.createHorse();
        horse2.setColor("Black");
        horse2.display();
    }
}