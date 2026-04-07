public class Sheep implements Animal {
    private String name;
    
    public Sheep() {
        this.name = "Default Sheep";
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public Animal clone() {
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Sheep();
        }
    }
    
    @Override
    public void makeSound() {
        // No implementation needed for output format
    }
    
    @Override
    public void display() {
        System.out.println("Sheep name is " + name);
    }
}