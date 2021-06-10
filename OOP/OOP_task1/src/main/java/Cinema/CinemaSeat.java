package Cinema;

public class CinemaSeat {
    private final int seatNumber;
    private final int rowNumber;
    private boolean isTaken;

    public CinemaSeat(int seatNumber, int rowNumber) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }
}