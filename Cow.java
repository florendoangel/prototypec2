public class Cow implements Animal {
    private String sound;
    
    public Cow() {
        this.sound = "Moo";
    }
    
    public void setSound(String sound) {
        this.sound = sound;
    }
    
    @Override
    public Animal clone() {
        try {
            return (Cow) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Cow();
        }
    }
    
    @Override
    public void makeSound() {
        System.out.println("Cow makes sound " + sound);
    }
    
    @Override
    public void display() {
        makeSound();
    }
}