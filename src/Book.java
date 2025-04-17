public class Book extends LibraryMedia {
    private String author;
    private int numberOfPages;

    public Book(String title, int publicationYear, String author, int numberOfPages) {
        super(title, publicationYear);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Author: " + author);
        System.out.println("Pages: " + numberOfPages);
    }

    public void checkNumberOfPages() {
        if (numberOfPages > 500) {
            System.out.println(title + " is long");
            System.out.println(title + " is "+ numberOfPages + " pages long");
            System.out.println("--------------------");
        } else {
            System.out.println(title + " is standard length");
            System.out.println(title + " is "+ numberOfPages + " pages long");
            System.out.println("--------------------");
        }
    }
}
