package in.kgcoding.polymorphism;

//public class Plane extends Vehicle{
//}




public class Plane implements Vehicle{

    @Override
    public void start() {
        System.out.println("Plane is taking off");
    }
}
