
public class MyTicket {

    private String showTime;
    private int numTickets;
    private int movieId;
    private double ticketPrice;
    private double price = 9.99;
    private int[] row;
    private int[] seat;
    private double amountTender;

    public MyTicket() {
    }

    public MyTicket(String st, int numT, int id) {
        this.showTime = st;
        this.numTickets = numT;
        this.movieId = id;
    }

    public int getNumTickets() {
        return numTickets;
    }

    public void setNumTickets(int numTickets) {
        this.numTickets = numTickets;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int mId) {
        this.movieId = mId;
    }

    public double getTicketPrice() {
        return price * numTickets;
    }

    public void setTicketPrice(double tPrice) {
        this.ticketPrice = tPrice;
    }

    public int[] getSeat() {
        return seat;
    }

    public void setSeat(int[] seat) {
        this.seat = seat;
    }

    public int[] getRow() {
        return row;
    }

    public void setRow(int[] row) {
        this.row = row;
    }

    public double getAmountTender() {
        return amountTender;
    }

    public void setAmountTender(double amountTender) {
        this.amountTender = amountTender;
    }
}
