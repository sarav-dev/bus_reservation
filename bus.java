package Bus_reservation;

public class bus {
    private int busno;
    private boolean ac;
    private int capacity;

bus(int no, boolean ac, int cap) {
    this.busno = no;
    this.ac = ac;
    this.capacity = cap;
}

public int getCapacity() {
    return capacity;
}

public void setCapacity( int cap) {
    capacity = cap;
}

public int getbusno() {
    return busno;
}

public boolean isAc() {
    return ac;
}

public void setAc( boolean val) {
    ac = val;
}

public void displayBusInfo() {
    System.out.println("Bus No: " + busno + ", Ac: " + ac + ", Capacity: " + capacity);
    System.out.println(" ");
}

 }