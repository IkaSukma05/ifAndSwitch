import java.util.Scanner;

public class ifAndSwitch {
    public static void main(String[] args) {
        //deklarasi Judul / Title dalam bentuk String
        final String Title1 = "perhitungan Grade Nilai Mahasiswa";
        final String Title2 = "....................................";
        final String Title3 = "penilaian";

        Scanner myInput = new Scanner(System.in); // deklarasi 'myInput' sebagai variable input dari user
        System.out.println(Title1);
        System.out.println(Title2);

        System.out.println("Masukkan NIM : ");
        String myNIM = myInput.nextLine(); // memasukkan input NIM ke variable 'myNIM'
        System.out.println("Masukkan Nama :");
        String myName = myInput.nextLine(); //memasukkan  input Nama ke variable 'myName'
        System.out.println("Masukkan Kelas : ");
        String myClass = myInput.nextLine(); //memasukkan input Kelas ke variable 'myClass'

        System.out.println("/n" + Title3); //cetak Title3
        System.out.println(Title2); //cetak Title2

        double nilai; //deklarasi variable 'nilai' sebagai DOUBLE
        String textLulus; //deklarasi variable 'textLulus'sebagai String

        double[] myScore = new double[4]; //deklarasi variable 'myScore' sebagai ARRAY bertipe DOUBLE
        System.out.println("Nilai Algoritma = ");
        nilai = myInput.nextDouble(); //memasukkan input Nilai Algoritma ke Variable ''nilai'

        myScore[0] = nilai; //memasukkan isi dari variable 'nilai' kedalam ARRAY 'myscore' alamat ke 0
        System.out.println("Nilai Sistem Basis Data =");
        nilai = myInput.nextDouble();
        myScore[1] = nilai; //memasukkan isi dari variable 'nilai' kedalam ARRAY 'myscore' alamat ke 1

        System.out.println("Nilai Aljabar Liner= ");
        nilai = myInput.nextDouble();
        myScore[2] = nilai; //memasukkan isi dari variable 'nilai' kedalam ARRAY 'myscore' alamat ke 2

        System.out.println("Nilai Math Diskrit = ");
        nilai = myInput.nextDouble();
        myScore[3] = nilai; //memasukkan isi dari variable 'nilai' kedalam ARRAY 'myscore' alamat ke 3

        System.out.println("/n Hasil Grade Penilaian");
        System.out.println(Title2);

        if (myScore[0] > 70) {//mengecek apakah isi dari APPRAY 'myScore' alamat index ke 1 lebih besar dari 70
            textLulus = "Lulus"; // jika lebih besar dari 70 maka 'lulus'
        } else {
            textLulus = "Gagal";// jika tidak lebih dari 70 maka 'gagal'
        }
        System.out.println("Nilai Algoritma Anda = " + myScore[0] + " " + textLulus);
    if(myScore[1] > 70) {//mengecek apakah isi dari ARRAY 'myScore' alamat index ke1 lebih besar dari 70
        textLulus = "Gagal";
    }else{
        textLulus = "Gagal";
    }
    System.out.println("Nilai Sistem Basis Data Anda = " + myScore[1]+ " " + textLulus );
    if(myScore[2] > 70) { //mengecek apakah isi dari ARRAY 'myScore' alamat index ke2 lebih besar dari 70
        textLulus = "lulus";
    }else{
        textLulus ="Gagal";
    }
    System.out.println("Nilai Aljabar Linear Anda = " + myScore[2]+" "+ textLulus);

    if(myScore[3] > 70) { // mengecek apakah isi dari ARRAY 'myScore' alamat index ke 3 lebih besar dari 70
        textLulus = "Lulus";
    }else{
        textLulus = "Gagal";
    }
    System.out.println("Nilai math Diskrit Anda = " + myScore[3]+ " " + textLulus);
    }
}
