public class InternetAccess implements Resource {
    private String internetAccess;

    public InternetAccess(String internetAccess) {
        this.internetAccess = internetAccess;
    }

    @Override
    public void borrow() {
        System.out.println("The URL '" + internetAccess + "' has been accessed by a student.");
    }
}
