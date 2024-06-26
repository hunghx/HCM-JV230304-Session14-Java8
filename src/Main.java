import method.Color;
import method.IColorable;
import method.Shape;
import method.Square;

import java.io.InputStream;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        IColorable.howToColor();

        IColorable color = new Color();

        Shape shape = ()->{};
        Comparator<Integer> comparator = (o1,o2)-> o1-o2;


        // Stream
        // Mảng
        Integer[] arr = {1,3,5,7,9,10,8,6,4,2,4,5,6};
        Stream<Integer> stream1 = Arrays.stream(arr);

        List<Integer> list = Arrays.asList(arr);

        Stream<Integer> stream2 = list.stream();

        // thao tác trung gian : là các thao tác trả về 1 stream mới

        Stream<Integer> stream3 = stream1.distinct(); // loại bỏ các phần tử trùng lặp
        // tổng các phần tử ko trung lặp
        //  R apply(T t, U u);
        Integer sum = stream3.reduce(0, Integer::sum);
        System.out.println(sum);

        // các thao tác trung gian thường gặp : filter, map, limit, sorted ,distinct
        // các thao tác dầu cuoois : foreach , reduce, toList, collect, min, max, findFirst, sum, ...

        // các FUnctional interface duựng sẵn dùng trong stream : thuộc gói java.util.function
        // Consumer
//        stream2.forEach((t)->{
//            System.out.println(t);
//        });
//        // Predicate
        // lọc các số chia cho 2

//        stream2.filter((num)->num%2==0).forEach((num)->System.out.println(num));

        // Supplier
//        List<Integer> random = Stream.generate(()->new Random().nextInt(50)).limit(50).toList();
        // Function
        // chuyển đổi mảng các sô nguyên thành mảng các bình phương của chúng
//        List<Integer> pow2 = stream2.map((num)->num*num).toList();
//        System.out.println(pow2);






        // ==================     Bài tâp    ==========================
//        Sử dụng Stream API để duyệt qua mảng và phương thức max() để tìm số lớn nhất trong mảng. IntStream , Stream
//        Sử dụng Stream API và phương thức filter() để tìm số chẵn
//        Sử dụng Stream API và phương thức filter() để lọc các số lớn hơn một giá trị xác định mà người dùng nhập vào
//        Sử dụng Stream API và phương thức reduce() để tính tổng của các số trong danh sách.
//        Sử dụng Stream API và phương thức anyMatch() để kiểm tra xem danh sách có chứa ít nhất một số chẵn hay không.
//        Sử dụng Stream API và phương thức range() để tạo danh sách các số từ x đến y.
//        Sử dụng Stream API và phương thức sorted() để sắp xếp danh sách theo thứ tự bảng chữ cái.
//        Sử dụng Stream API và phương thức map() để chuyển các chuỗi thành chữ in hoa.

           Optional<Integer> optionalInteger = stream2.max((o1, o2) -> o1-o2);
           Integer max = optionalInteger.orElse(null); // nếu ko có thì trả về null
           System.out.println(max);
//           boolean check = stream2.anyMatch(integer -> );
        IntStream.range(1,10).forEach(System.out::println);
//        Square s = new Square();
        // instance :: methodName
//        Arrays.stream(arr).forEach(s::print);
        // ClassName:: method
        Arrays.stream(arr).forEach(Square::print);


        // chuyển đổi mảng các số nguyên thành mảng square
        List<Integer> doDais = Arrays.asList(1,2,3,4,5);
        //
        List<Square> squareList = doDais.stream().map(Square::new).toList();




    }
}