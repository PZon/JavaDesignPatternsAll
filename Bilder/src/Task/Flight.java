package Task;

/**
 * Created by PZON_SM on 10.08.2020.
 **/
public class Flight {
    private String from;
    private String to;
    boolean delayed;
    double price;

    public Flight(FlightBuilder flightBuilder){
        this.from = flightBuilder.from;
        this.to = flightBuilder.to;
        this.delayed = flightBuilder.delayed;
        this.price = flightBuilder.price;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }


    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightBuilder{
        private String from;
        private String to;
        boolean delayed;
        double price;

        public FlightBuilder(String from, String to) {
            this.from = from;
            this.to = to;
            this.delayed = false;
        }

        public FlightBuilder setBuilderPrice(double price) {
            this.price = price;
            return this;
        }

        public Flight build(){
            if(this.price==0) throw new IllegalStateException("*Pole CENA jest wymagane !!!");
            return new Flight(this);
        }

    }

}
