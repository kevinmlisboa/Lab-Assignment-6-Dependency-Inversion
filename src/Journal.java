public class Journal implements Resource{
    private String journalName;

    public Journal(String journalName) {
        this.journalName = journalName;
    }

    @Override
    public void borrow() {
        System.out.println("The journal '" + journalName + "' has been borrowed by a student.");

    }
}
