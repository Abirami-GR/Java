 class Book {
    //Static Variables
    static int totalBooks;

    //Instance Variables
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    //Static Code Block
    static {
        totalBooks = 0;
        System.out.println("In Book Class");
        System.out.println("In Static Code Block");
    }

    //Normal Code Block
    {
        totalBooks++;
        System.out.println("In Initialization Code Block");

    }

    //Constructor
    Book(){
        title = "Harry Potter and the sorcerer's stone";
        author = "J. K. Rowling";
        isbn = "1234-5678-91-011";
    }

    Book(String title,String author,String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn){
        this( "Unknown", "Unknown", isbn);
    }

    //Static Methods
     static void getTotalBooks(){
        System.out.println("Total no of Books :" + totalBooks);
    }

    //Instance Methods
     void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

     void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave a review");
        } else {
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("Design", "author", "1");
        Book myBook = new Book("2");
        System.out.println();
        System.out.println("Inside Main Method");
        Book.getTotalBooks();
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }

}
