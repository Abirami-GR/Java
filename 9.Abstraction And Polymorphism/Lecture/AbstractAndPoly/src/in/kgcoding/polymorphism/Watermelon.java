package in.kgcoding.polymorphism;

public class Watermelon extends Fruits{
    Watermelon(){
        super();
    }

    Watermelon(int noOfGroups){
        super(noOfGroups);
    }

    @Override
    public int getNoOfGroups() {
        return super.getNoOfGroups();
    }

    @Override
    public void plucked() {
        System.out.println("No of groups: " + super.getNoOfGroups());
        System.out.println("A watermelon is dugged out");
    }
}
