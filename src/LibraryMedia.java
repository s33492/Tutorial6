public class LibraryMedia {
    protected String title;
    protected int publicationYear;
    protected boolean available;

    public LibraryMedia(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.available = true;
    }

    public void borrow() {
        if (available==true) {
            available = false;
            System.out.println("Borrowing " + title);
        }
        else {
            System.out.println(title + " is not available");
        }
    }

    public void returnMedia() {
        if (available==false) {
            available = true;
            System.out.println("Returning " + title);
        }
        else {
            System.out.println(title + " wasn't borrowed.");
        }
    }

    public void displayInformation() {
        System.out.println("Title: " + title);
        System.out.println("Published in: " + publicationYear);
        System.out.println("Status: " + (available ? "Available" : "Borrowed"));
    }
}
