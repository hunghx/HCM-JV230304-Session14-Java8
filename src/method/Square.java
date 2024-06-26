package method;

public class Square {
    private String color;
    private int canh;
    public static void print(Integer canh){
        System.out.println("só cạnh là "+canh);
    }
    // phương thức khởi tạo
    public Square() {
    }

    public Square(int canh) {
        this.canh = canh;
    }

    public Square(String color, int canh) {
        this.color = color;
        this.canh = canh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }
}
