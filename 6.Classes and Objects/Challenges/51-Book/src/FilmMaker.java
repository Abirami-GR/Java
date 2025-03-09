public class FilmMaker {
    public static void main(String[] args) {
        Book harryPotter = new Book();
        Book twilightSage = new
                Book("New Moon", "Stephanie Meyer", "1112-1098-76543");


        System.out.println("\nIn Film Maker Class");
        System.out.println("Total no of Books :" + Book.totalBooks);
    }
}
