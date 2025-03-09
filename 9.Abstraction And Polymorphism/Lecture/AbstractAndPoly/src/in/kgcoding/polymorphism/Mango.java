package in.kgcoding.polymorphism;

public class Mango extends  Fruits {
    Mango(){
        super();
    }

    Mango(int noOfGroups){
        super(noOfGroups);
    }

    @Override
    public int getNoOfGroups() {
        return super.getNoOfGroups();
    }

    @Override
    public void plucked() {
        System.out.println("No of groups: " + super.getNoOfGroups());
        System.out.println("Mango is plucked");
    }
}
