/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author acer
 */
public class MainClub {
    public static void main(String[] args) {
        // Membuat objek anggota terlebih dahulu
        Anggota anggota1 = new Anggota("Budi");
        Anggota anggota2 = new Anggota("Siti");
        Anggota anggota3 = new Anggota("Andi");
        
        // Membuat objek klub
        Club klub1 = new Club("Club Basket");
        Club klub2 = new Club("Club Sepak Bola");
        
        // Menambahkan anggota ke klub basket
        klub1.tambahAnggota(anggota1);
        klub1.tambahAnggota(anggota2);
        
        // Menambahkan anggota ke klub sepak bola
        klub2.tambahAnggota(anggota2); // Siti bisa ikut 2 klub
        klub2.tambahAnggota(anggota3);
        
        // Menampilkan info klub
        System.out.println("=== Informasi Klub ===");
        klub1.infoKlub();
        System.out.println();
        klub2.infoKlub();
    }
}