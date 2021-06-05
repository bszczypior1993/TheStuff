package Cinema;

public class CinemaSeat {
    final int seatNumber;
    final int rowNumber;
    boolean isTaken;

    public CinemaSeat(int seatNumber, int rowNumber) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }
}