/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum11;

/**
 *
 * @author acer
 */
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private List<Buku> daftarBuku; // Komposisi: Perpustakaan memiliki Buku
    
    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();
    }
    
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan ke perpustakaan.");
    }
    
    public void tampilkanSemuaBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Perpustakaan masih kosong.");
        } else {
            System.out.println("\n=== Daftar Buku di Perpustakaan ===");
            for (int i = 0; i < daftarBuku.size(); i++) {
                System.out.println("\nBuku ke-" + (i + 1) + ":");
                daftarBuku.get(i).infoBuku();
            }
        }
    }
}