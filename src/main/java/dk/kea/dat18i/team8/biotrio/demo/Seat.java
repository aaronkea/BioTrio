package dk.kea.dat18i.team8.biotrio.demo;


public class Seat {

    private int rowNo;
    private int seatNo;
    private boolean isBooked;

    public Seat(){};
    public  Seat(int rowNo,int setNo) {
        this.rowNo=rowNo;
        this.seatNo=setNo;
        this.isBooked=false;
    }



    public int getRowNo(){return this.rowNo;}

    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getSeatNo() { return seatNo; }

    public boolean getIsBooked() {
        return isBooked;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "row number=" + rowNo +
                ", seat number=" + seatNo+
                ", isBooked=" + isBooked +
                '}';
    }
}
