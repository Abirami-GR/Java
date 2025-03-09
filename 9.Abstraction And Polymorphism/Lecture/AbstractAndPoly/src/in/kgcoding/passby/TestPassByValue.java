package in.kgcoding.passby;

public class TestPassByValue {

    public static void main(String[] args) {
        Point first = new Point(4,8);
        System.out.println("Before Increment: \n" + first);
        move(first);
        System.out.println();
        System.out.println("After Increment: \n" +first);
    }

    public static void move(Point p){
        p.x++;
        p.y++;
        System.out.printf("X = %d  Y = %d", p.x, p.y);
    }


    public static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point {" +
                    "\n x = " + x +
                    ",\n y = " + y + "\n" +
                    '}';
        }
    }
}
