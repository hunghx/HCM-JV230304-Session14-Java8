package baitap;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BaiTap1 {
    public static void main(String[] args) {
        /*
            Sử dụng Stream API để duyệt qua mảng và phương thức max() để tìm số lớn nhất trong mảng.
            Sử dụng Stream API và phương thức filter() để tìm số chẵn
            Sử dụng Stream API và phương thức filter() để lọc các số lớn hơn một giá trị xác định mà người dùng nhập vào
            Sử dụng Stream API và phương thức reduce() để tính tổng của các số trong danh sách.
            Sử dụng Stream API và phương thức anyMatch() để kiểm tra xem danh sách có chứa ít nhất một số chẵn hay không.
            Sử dụng Stream API và phương thức range() để tạo danh sách các số từ x đến y.
            Sử dụng Stream API và phương thức sorted() để sắp xếp danh sách theo thứ tự bảng chữ cái.
            Sử dụng Stream API và phương thức map() để chuyển các chuỗi thành chữ in hoa.
        * */
        // Câu 1 :
        System.out.println("=======================================================================");
        Random random = new Random();
        List<Integer> listInt  = Stream.generate(() -> random.nextInt(50)).distinct().limit(10).toList();
        Optional<Integer> maxInt  = listInt.stream().max(Integer::compareTo);
        System.out.println(listInt);
        // in ra số lớn nhất
        System.out.println("Số lớn nhaats trong danh sách là "+maxInt.orElse(null));

//        Câu 2
        System.out.println("=======================================================================");
        listInt.stream().filter(num -> num%2==0).forEach(System.out::println);
        System.out.println("=======================================================================");
        // Câu 3
        System.out.println("Nhập vao giá trị");
        int input = new Scanner(System.in).nextInt();
        System.out.println("Các số lơn hơn số ừa nhập là");
        listInt.stream().filter(integer -> integer > input).forEach(System.out::println);

        // Câu 4 :
        System.out.println("=======================================================================");
        Integer sum = listInt.stream().reduce(0, Integer::sum);
        System.out.println("Tổng các số trong danh sách là "+sum);
        System.out.println("=======================================================================");
        // Câu 5
        System.out.println("Mảng hay danh sách có chưa ít nhất 1 số chẵn hay ko :"+ listInt.stream().anyMatch(integer -> integer%2==0));
        System.out.println("=======================================================================");
        // câu 6

        IntStream.range(2,11).forEach(System.out::println);
        System.out.println("=======================================================================");

        // câu 7
        List<String> listStr = Arrays.asList("xxjsh","jdjncd","cdcd","wueq","âsas");
        listStr.stream().sorted().forEach(System.out::println);
        System.out.println("=======================================================================");
        // Câu 8

        listStr.stream().map(String::toUpperCase).forEach(System.out::println);


    }
}
