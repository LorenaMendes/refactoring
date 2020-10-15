import java.util.Enumeration;

public class HtmlStatement extends Statement {
    
    public String RentalHeader(Customer aCustomer){
        return("<H1>Rentals for <EM>" + aCustomer.getName() +
        "</EM></H1><P>\n");
    }
    
    public String RentalFigures(Rental aRental){
        return(aRental.getMovie().getTitle()+ ": " +
            String.valueOf(aRental.getCharge()) + "<BR>\n");
    }
    
    public String RentalFooter(Customer aCustomer){
        return("<P>You owe <EM>" +
        String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" +
        "On this rental you earned <EM>" + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>");
    }
    
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = this.RentalHeader(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += this.RentalFigures(each);
        }
        //add footer lines
        result += this.RentalFooter(aCustomer);
        return result;
    }
}