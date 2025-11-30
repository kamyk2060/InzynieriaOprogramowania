public abstract class Rental {
    protected String title;
    protected Date rentDate;
    protected Date dueDate;
    protected double rentalFee;
    
    public boolean isOverdue() {
        Date now = new Date();
        return dueDate.before(now);
    }
    
    public abstract double getTotalFee();
}

public class BookRental extends Rental {
    private String author;
    
    public double getTotalFee() {
        return isOverdue() ? 1.2 * rentalFee : rentalFee;
    }
}

public class MovieRental extends Rental {
    private int classification;
    
    public double getTotalFee() {
        return isOverdue() ? 1.3 * rentalFee : rentalFee;
    }
}