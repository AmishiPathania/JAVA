
import java.lang.System;
/**
 * Members Vaiable should private and for access it should public method.
 */
public class EncapsulationDemo {
    private int id;
    private String name;

    public EncapsulationDemo(int id, String name) {
        this.id = id;
        this.name= name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name){
        this.name= name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Encapsulation : id "+this.id +" Name "+ this.name;
    }

    public static void main(String[] args) {
       EncapsulationDemo e2 =  new EncapsulationDemo(101, "Test");
       System.out.println(e2);
       System.out.println(e2.getId());
    }
}