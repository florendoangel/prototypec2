public class Horse implements Animal {
    private String color;
    
    public Horse() {
        this.color = "Brown";
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public Animal clone() {
        try {
            return (Horse) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Horse();
        }
    }
    
    @Override
    public void makeSound() {
        // No implementation needed
    }
    
    @Override
    public void display() {
        System.out.println("Horse has color " + color);
    }
}