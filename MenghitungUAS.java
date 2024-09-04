import java.util.Scanner;
public class MenghitungUAS {
    public static void main(String[] args) {
        String nama, kelas, predikat, ket;
        int nilai;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama");
        nama = input.nextLine();
        System.out.println("Masukkan Kelas");
        kelas = input.nextLine();
        System.out.println("Masukkan Nilai");
        nilai = input.nextInt();

    if(nilai >=0 && nilai <=39){
        predikat = "E";
        ket = "Tidak Lulus";
    }else if(nilai >40 && nilai <=49){
        predikat = "D";
        ket = "Tidak Lulus";
    }else if(nilai >50 && nilai <=69){
        predikat = "C";
        ket = "Lulus";
    }else if(nilai >70 && nilai <=84){
        predikat = "B";
        ket = "Lulus";
    }else if(nilai >85 && nilai <=100){
        predikat = "A";
        ket = "Lulus";
    }else{
        ket = "Gagal terdeteksi";
        predikat = "Gagal Terdeteksi";
        System.out.println("Nilai tidak ada");
    }

    System.out.println("Anda dinyatakan "+ ket);
    System.out.println("Grade: "+predikat);

    }
}



        
        

    

