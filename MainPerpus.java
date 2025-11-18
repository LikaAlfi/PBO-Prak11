/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum11;

/**
 *
 * @author acer
 */
public class MainPerpus {
    public static void main(String[] args) {
        // Membuat objek Pengarang (bisa exist secara independen)
        Pengarang pengarang1 = new Pengarang("Tere Liye");
        Pengarang pengarang2 = new Pengarang("Andrea Hirata");
        Pengarang pengarang3 = new Pengarang("Pramoedya Ananta Toer");
        
        // Membuat objek Buku dengan Pengarang (Agregasi)
        Buku buku1 = new Buku("Hujan", pengarang1);
        Buku buku2 = new Buku("Laskar Pelangi", pengarang2);
        Buku buku3 = new Buku("Bumi Manusia", pengarang3);
        Buku buku4 = new Buku("Pulang", pengarang1); // Pengarang yang sama
        
        // Membuat objek Perpustakaan (Komposisi)
        Perpustakaan perpustakaan = new Perpustakaan();
        
        // Menambahkan buku ke perpustakaan
        System.out.println("=== Menambahkan Buku ke Perpustakaan ===");
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        perpustakaan.tambahBuku(buku4);
        
        // Menampilkan semua buku di perpustakaan
        perpustakaan.tampilkanSemuaBuku();
        
        // Demonstrasi Agregasi: Pengarang masih bisa digunakan
        System.out.println("\n=== Demonstrasi Agregasi ===");
        System.out.println("Pengarang masih exist meskipun tidak terikat dengan perpustakaan:");
        pengarang1.infoPengarang();
    }
}