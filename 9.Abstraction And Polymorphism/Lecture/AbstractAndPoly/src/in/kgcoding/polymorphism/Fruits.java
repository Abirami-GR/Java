package in.kgcoding.polymorphism;

public abstract class Fruits {
        private final int noOfGroups;

        Fruits(){
            this.noOfGroups = 0;
        }

        Fruits(int noOfGroups){
            this.noOfGroups = noOfGroups;
        }

        public int getNoOfGroups(){
            return noOfGroups;
        }

    public abstract void plucked();
}
