public class TestProgram {
    public static void main(String[] args) throws Exception {
        Student student = new Student();

        Resource book = new Book("Advanced Programming");
        Resource journal = new Journal("Cloud Computing: Current Trends and Future Directions");
        Resource theses = new Theses("Exploring Deep Learning Techniques for Image Recognition");
        Resource capstone = new Capstone("Predictive Maintenance System for Industrial Machinery");
        Resource internet = new InternetAccess("college.neu.edu.ph");
        Resource newspaper = new Newspaper("Manila Bulletin");

        // Student borrows resources
        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(theses);
        student.borrowResource(capstone);
        student.borrowResource(internet);
        student.borrowResource(newspaper);
    }
}
