public class Theses implements Resource{
    private String thesisName;

    public Theses(String thesesName) {
        this.thesisName = thesesName;
    }

    @Override
    public void borrow() {
        System.out.println("The thesis titled '" + thesisName + "' has been borrowed by a student.");

    }
}
