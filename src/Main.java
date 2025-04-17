public class Main {
    public static void main(String[] args) {
        //books
        Book book1 = new Book("The Witcher", 1990, "Andrzej Sapkowski", 320);
        Book book2 = new Book("1984", 1949, "George Orwell", 501);
        //movies
        Movie movie1 = new Movie("The Green Mile", 1999, "Frank Darabont", 189);
        Movie movie2 = new Movie("Inside", 2020, "Bo burnham", 100);

        LibraryMedia[] mediaArray = new LibraryMedia[4];
        mediaArray[0] = book1; // Book object stored as LibraryMedia
        mediaArray[1] = book2;
        mediaArray[2] = movie1; // Movie object stored as LibraryMedia
        mediaArray[3] = movie2;

        System.out.println("===== INFORMATION ABOUT ALL MEDIA =====");
        for (LibraryMedia media : mediaArray) {
            media.displayInformation();
            System.out.println("--------------------");
        }
        System.out.println("\n===== BORROWING AND RETURNING OPERATIONS =====");
        book1.borrow(); // Borrowing the book
        book1.borrow(); // Attempting to borrow again – should show that it’s already borrowed
        book1.returnMedia(); // Returning the book
        book1.returnMedia();

        System.out.println("\n===== TYPE-SPECIFIC METHODS =====");
        book1.checkNumberOfPages(); // Method specific to Book
        movie1.checkDuration(); // Method specific to Movie

        System.out.println("\n===== TYPE CASTING =====");
        for (LibraryMedia media : mediaArray) {
            if (media instanceof Book) {
                Book b = (Book) media;
                b.checkNumberOfPages();
            } else if (media instanceof Movie) {
                ((Movie) media).checkDuration();
            }
        }
    }
}
