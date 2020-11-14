/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.tabungan.tugas;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan hasil tabungan
 */
public class Main {
    public static void main(String []args){
        Scanner keyboardInput = new Scanner(System.in);
        
        int saldoAwal,jumlahUangDiambil;
        
        System.out.println("=====Program Penarikan Uang=====");
        System.out.print("Masukan saldo awal\t: ");
        saldoAwal = keyboardInput.nextInt();
        
        Tabungan dataTabungan = new Tabungan(saldoAwal);
        
        System.out.print("Jumlah Uang yang diambil: ");
        jumlahUangDiambil = keyboardInput.nextInt();
        System.out.println("Saldo anda sekarang\t: " + dataTabungan.ambilUang(jumlahUangDiambil));
    }
}
