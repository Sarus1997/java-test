public class Main {
    public static void main(String[] args) {

        //* ดึงข้อมูลจาก CarOOP.java มาแสดงผล */ 
        CarOOP car = new CarOOP();
        car.setBrandAndType("Honda", "Civic");
        car.setPrice(20000);

        car.displayCarInfo();
    }
}
