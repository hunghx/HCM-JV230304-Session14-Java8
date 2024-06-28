package baitap;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
//        Viết chương trình để lấy ngày hiện tại của hệ thống và các nơi bao gồm : Asia/Tokyo, Australia/Sydney ,America/Sao_Paulo
        System.out.println("--------------------Câu 1 ----------------------------");
        System.out.println("Tời gian của Asia/Tokyo là : "+ ZonedDateTime.now(ZoneId.of("Asia/Tokyo")).format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        System.out.println("Tời gian của Australia/Sydney là : "+ ZonedDateTime.now(ZoneId.of("Australia/Sydney")));
        System.out.println("Tời gian của America/Sao_Paulo là : "+ ZonedDateTime.now(ZoneId.of("America/Sao_Paulo")));
//        Viết chương trình để lấy thời gian hiện tại (giờ phút giây).
        System.out.println("--------------------Câu 2 ----------------------------");
        System.out.println(LocalTime.now());
//        Viết chương trình để tính toán số ngày trong tháng hiện tại.
        System.out.println("--------------------Câu 3 ----------------------------");
        LocalDate today =  LocalDate.now();
        System.out.printf("Soos ngay trong thang %s la %s \n",today.getMonth().getValue(),today.lengthOfMonth());
//        Viết chương trình để tính toán số ngày trong năm hiện tại.
        System.out.println("--------------------Câu 4 ----------------------------");
//        Viết chương trình để chuyển đổi một chuỗi ngày sang một đối tượng LocalDate.
        DateTimeFormatter dft = DateTimeFormatter.ISO_DATE; // yyyy-MM-dd
//        System.out.println("Nhaapj vaof 1 chuooix ngay");
//        String input = new Scanner(System.in).nextLine();
//        LocalDate localDate = LocalDate.parse(input,dft);
//        System.out.println("ngay vua nhap laf : "+ localDate.format(dft) );
//        Viết chương trình để chuyển đổi một đối tượng LocalDate sang một chuỗi ngày (dd/MM/yyyy).
        System.out.println("--------------------Câu 5 ----------------------------");
//        Viết chương trình để chuyển đổi một đối tượng LocalDateTime sang một chuỗi ngày(dd/MM/yyyy HH:mm:ss).
        System.out.println("--------------------Câu 6 ----------------------------");
//        Viết chương trình để so sánh hai ngày LocalDate ( trả về int ).
        System.out.println("--------------------Câu 7 ----------------------------");
        LocalDate d1 = LocalDate.of(1945,9,2);
        LocalDate d2 = LocalDate.of(1975,4,30);
        System.out.println("Khoangr cach 2 ngay la "+compareDate(d1,d2));

//        Viết chương trình để so sánh hai thời gian LocalTime.

//        Viết chương trình để thêm hoặc bớt một số ngày, giờ, phút, giây hoặc mili giây vào một ngày hoặc thời gian nhập vào.
        LocalDateTime now = LocalDateTime.now();
        // thêm 6 ngày , 10 giờ, 5 phút, 10 s
        System.out.println(now);
        System.out.println(now.plusDays(6).plusHours(10).plusMinutes(5).plusSeconds(10).plus(10,ChronoUnit.MILLIS));

//        Viết chương trình để tính toán ngày (LocalDate) tiếp theo hoặc ngày trước đó của một ngày.

    }

    private static  long compareDate(LocalDate d1, LocalDate d2) {
        // return d1.compareTo(d2); // cachs
        // khoang cach giua 2 ngay
        return ChronoUnit.DAYS.between(d1,d2);
    }
}
