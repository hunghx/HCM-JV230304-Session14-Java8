package method;

public interface IColorable {
    // phương thức mặc đinh, cho phép ghi đè ở lớp triển khai
    default void printColor() {
        System.out.println("màu đen");
    }

    // phương thức tĩnh , chỉ sử dụng trực tiếp từ interface
    static  void howToColor(){
        System.out.println("ko biết");
    }
}
