import method.Color;
import method.IColorable;
import method.Shape;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
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
        Integer sum = stream3.reduce(0,(temp,num)->temp+num);
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


    }
}