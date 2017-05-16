//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by eeliz_000 on 5/14/2017.
// */
//public class Theater {
//    private final String theaterName;
//    // user made list class
//    private List<Seat> seats = new ArrayList<>();
//
//    // constructor
//    public Theater(String theaterName, int numRows, int seatsPerRow) {
//        this.theaterName = theaterName;
//        // theater seats will be numbered with a row letter and a seat number
//        int lastRow = 'A' + (numRows -1);
//        // go through all the rows A - Z
//        for(char row = 'A'; row <= lastRow; row++) {
//            // for each row, allocate seats for that section
//            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
//                // create seat object
//                Seat seat = new Seat(row + String.format("%02d", seatNum));
//                // add to array list
//                seats.add(seat);
//            }
//        }
//    }
//
//    public String getTheaterName() {
//        return theaterName;
//    }
//
//    public boolean reserveSeat(String seatNumber) {
//        Seat requestSeat = null;
//        for (Seat seat : seats) {
//            if (seat.getSeatNumber().equals(seatNumber)) {
//                requestSeat = seat;
//                // break out of loop once found
//                break;
//            }
//        }
//        if (requestSeat == null) {
//            System.out.println("There is no seat " + seatNunmber);
//        }
//        return requestSeat.reserve();
//    }
//
//    // for testing
//    public void getSeats(){
//        for(Seat seat : seats) {
//            System.out.println(seat.getSeatNumber());
//        }
//    }
//    private class Seat {
//        private final String seatNumber;
//        private boolean reserved = false;
//    }
//}
