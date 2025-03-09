public class Reader {
    public static void main(String[] args) {
        Book harryPotter = new Book();
        Book twilightSage = new
                Book("New Moon", "Stephanie Meyer", "1112-1098-76543");

        System.out.println("\nIn Reader Class");

        //Static
        System.out.println("\nStatic Variables");
        System.out.println("Total no of Books :" + Book.totalBooks);

        System.out.println("\nStatic Method");
        Book.getTotalBooks();

        //Instance - Harry Potter
        System.out.println("\nHarry Potter");
        System.out.println("\nInstance Variable");
        System.out.println("Title :" + harryPotter.title);
        System.out.println("Author :" + harryPotter.author);
        System.out.println("ISBN :" + harryPotter.isbn);

        //Method
        System.out.println("\nInstance Method");
        harryPotter.borrowBook();
        harryPotter.borrowBook();
        harryPotter.returnBook();
        harryPotter.returnBook();

        //Instance - Twilight sage
        System.out.println("\nTwilight sage");
        System.out.println("\nInstance Variable");
        System.out.println("Title :" + twilightSage.title);
        System.out.println("Author :" + twilightSage.author);
        System.out.println("ISBN :" + twilightSage.isbn);

        //Method
        System.out.println("\nInstance Method");
        twilightSage.borrowBook();
        twilightSage.returnBook();




    }
}
