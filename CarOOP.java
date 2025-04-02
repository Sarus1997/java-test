public class CarOOP {
    private String brand;
    private String type;
    private Integer price;

    // method ตั้งค่าข้อมูลแบรนด์และรุ่น String = ข้อความ
    public void setBrandAndType(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

     // method ตั้งค่าราคา Integer = ข้อมูลตัวเลข
    public void setPrice(Integer price) {
        this.price = price;
    }

    // Getter สำหรับการดึงค่าข้อมูล
    public String getBrand() {
        return brand; // brand
    }

    public String getType() {
        return type; // type
    }

    public Integer getPrice() {
        return price; // price
    }

    // method ในส่วนของข้อมูล สำหรับการแสดงผล
    public void displayCarInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Type: " + type);
        System.out.println("Price: $" + price);
    }
}
