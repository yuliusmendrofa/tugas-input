package id.blits.BelajarInput;

import java.util.Scanner;

public class LatihanInput {

   
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.print("Masukkan Nama                 :");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NPM                  :");
        int npm = input.nextInt();
        input.nextLine();
        
        System.out.print("Masukkan Alamat               :");
        String almt = input.nextLine();
        
        System.out.print("Masukkan Nilai Tugas  Besar   :");
        int nilai1 = input.nextInt();
        
        System.out.print("Masukkan Nilai Tugas Kecil    :");
        int nilai11 = input.nextInt();
        
        System.out.print("Masukkan Nilai Kuis           :");
        int nilai2 = input.nextInt();
        
        System.out.print("Masukkan Nilai UTS            :");
        int nilai3 = input.nextInt();
        
        System.out.print("Masukkan Nilai UAS Teori      :");
        int nilai4t = input.nextInt();
        
        System.out.print("Masukkan Nilai UAS Praktik    :");
        int nilai4p = input.nextInt();
        
        int nilait,nilaik,nilaiuts,nilaiuas;
        
        nilait = (nilai1*70/100+nilai11*30/100)*30/100;
        nilaik = nilai2 * 15/100;
        nilaiuts = nilai3 * 25/100;
        nilaiuas = (nilai4t * 60/100 + nilai4p * 40/100) * 30/100;
        
        System.out.println("\n");
        
        System.out.println("Nama Anda           :"+nama);
        System.out.println("Nilai NPM           :"+npm);
        System.out.println("Alamat Anda         :"+almt);
        System.out.println("Nilai Tugas         :"+nilait);//30% (tugas besar 70% tugas kecil 30%)
        System.out.println("Nilai Kuis          :"+nilaik);//15%(
        System.out.println("Nilai UTS           :"+nilaiuts);//25%
        System.out.println("Nilai UAS           :"+nilaiuas);//30% (prakti 60% teori 40%)
        
        int total;
        float nakh;
        
        total = nilait+nilaik+nilaiuts+nilaiuas;
        nakh = total;
        
        System.out.println("Nilai Akhir         :"+nakh);
        
        
    }
}
