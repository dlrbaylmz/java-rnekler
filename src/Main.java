import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner inp =new Scanner(System.in);
        int math , physics , chemical , turkish , history , music;

        System.out.print("Matematik notunuz: " );
        math = inp.nextInt();

        System.out.print("Fizik notunuz: " );
        physics = inp.nextInt();

        System.out.print("Kimya notunuz: " );
        chemical = inp.nextInt();

        System.out.print("Türkçe notunuz: " );
        turkish = inp.nextInt();

        System.out.print("Tarih notunuz: " );
        history = inp.nextInt();

        System.out.print("Müzik notunuz: " );
        music = inp.nextInt();

        int total =(math + physics + chemical + turkish + history + music);
        double divide =total /6;
        System.out.println("Not Ortalamanız: " + divide);

        System.out.println(divide>=60 ? "Geçtiniz. Tebrikler!" : "Kaldınız...");


    }
}
