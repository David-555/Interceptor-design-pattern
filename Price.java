public abstract class Price {
    //abstract class for calculating the different prices of a rental based on factors 
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}