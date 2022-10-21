package com.tugas;

//class templat
class person{
    String nama;
    String jeniskelamin;
    String umur;
}
public class latihan1 {
    public static void main(String[] args) {
        person person1 = new person();
            person1.nama="nama = Anton";
            person1.jeniskelamin="jenis-kelamin = laki-laki";
            person1.umur="umur = 22 tahun";

        person person2 = new person();
            person2.nama="nama = Riko";
            person2.jeniskelamin="jenis-kelamin = laki-laki";
            person2.umur="umur = 23 tahun";

            System.out.println(person1.nama);
            System.out.println(person1.jeniskelamin);
            System.out.println(person1.umur);
            System.out.println("===============================");
            System.out.println(person2.nama);
            System.out.println(person2.jeniskelamin);
            System.out.println(person2.umur);

    }
}
