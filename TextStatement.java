import java.util.Enumeration;

public class TextStatement extends Statement {
    
    public String RentalHeader(Customer aCustomer){
        return("Rental Record for " + aCustomer.getName() + "\n");
    }
    
    public String RentalFigures(Rental aRental){
        return("\t" + aRental.getMovie().getTitle()+ "\t" +
            String.valueOf(aRental.getCharge()) + "\n");
    }
    
    public String RentalFooter(Customer aCustomer){
        return("Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n" +
        "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points");
    }
}