//nama  : Aryandari Hanugraeni
//Kelas : MI 1E
//NIM   : 2031710016
public class Peminjaman {
    String nama_member, nama_game;
    int id,lamaPinjam,hargaSewa;

    void tampilData(){
        System.out.println("id member: " +id);
        System.out.println("nama member: " + nama_member);
        System.out.println("nama game: " +nama_game);
        System.out.println("Lama pinjamr: " +lamaPinjam);
        System.out.println("Harga sewa: " +hargaSewa);
    }
    int hargaBayar(){
        return lamaPinjam*hargaSewa;
    }
}