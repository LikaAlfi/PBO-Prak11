/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();
        
        // Membuat beberapa objek buku
        Buku buku1 = new Buku("Pemrograman Java");
        Buku buku2 = new Buku("Struktur Data");
        Buku buku3 = new Buku("Basis Data");
        
        // Menambahkan buku ke perpustakaan
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        
        // Menampilkan info perpustakaan
        System.out.println("=== Daftar Buku di Perpustakaan ===");
        perpustakaan.infoPerpustakaan();
    }
}