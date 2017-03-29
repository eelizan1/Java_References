package Theater;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eeliz_000 on 3/26/2017.
 */
public class Theater {

    private final String theaterName;
    // list of seats
    private List<Seat> seatList = new ArrayList<Seat>();

    // theater contructor
    // initialized with theater name, number of rows, and seats per rows
    public Theater(String theaterName, int numRow, int seatsPerRow) {
        this.theaterName = theaterName;
        // Row by letters
        // Columns by seat numbers
        int lastRow = 'A' + (numRow - 1);
        // assign seat number with row A
        for (char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum < seatsPerRow; seatNum++) {
                // creates seat objects for all of row A
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                // Add new seat objects to the array list defined up top
                seatList.add(seat);
            }
        }
    }

    public String getTheaterName() {
        return theaterName;
    }

    // reserve seat
    public boolean reserveSeat(String seatNumber) {
        Seat requestSeat = null;

        // loop through seat list to reserve particular seat
        for(Seat seat : seatList) {
            if(seat.getSeatNumber().equals(seatNumber)) {
                requestSeat = seat;
                // break if you foudn the seat
                break;
            }
        }
    }
}
