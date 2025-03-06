package M5.Pewarisan.P2;

public class Pelajar extends Orang{
    private String nim;
    private String asalSekolah;
    private double nilai;
    
    public Pelajar(String nama, double tinggi, double berat, String nim, String Sekolah, double nilai){
        super(nama, tinggi, berat);
        this.nim = nim;
        asalSekolah = Sekolah;
        this.nilai = nilai;
    }
    public String toString(){
        return (super.toString()+"\nNIM ; "+nim+"\nSekolah : "+asalSekolah+"\nNilai : "+nilai);
    }
}
