public class Capstone implements Resource{
    private String capstoneName;

    public Capstone(String capstoneName) {
        this.capstoneName = capstoneName;
    }

    @Override
    public void borrow() {
        System.out.println("The details of the capstone project '" + capstoneName + "' have been borrowed by a student.");
    }
}
