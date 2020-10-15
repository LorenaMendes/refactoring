import java.util.Enumeration;

public class Statement {

    public abstract String RentalHeader(Customer aCustomer);

    public abstract String RentalFigures(Rental aRental);

    public abstract String RentalFooter(Customer aCustomer);

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