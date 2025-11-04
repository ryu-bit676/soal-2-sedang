import java.util.Scanner;

public class soal2_sedang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan tinggi tabung :");
        double tinggi = input.nextDouble();
        System.out.println("masukan jari jari tabung");
        double jarijari = input.nextDouble();
        double phi = 3.14;
        double volume = phi * jarijari * tinggi;
        System.out.println("volume tabung adalah :" + volume);


    }
    
}
