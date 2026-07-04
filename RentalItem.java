package UAS;

//  Class & Encapsulation 
public class RentalItem {
    //  Atribut
    private String idItem;
    private String namaItem;
    private double hargaPerJam;

    //  Constructor
    public RentalItem(String idItem, String namaItem, double hargaPerJam) {
        this.idItem = idItem;
        this.namaItem = namaItem;
        this.hargaPerJam = hargaPerJam;
    }

    //  Mutator (Setter)
    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public void setHargaPerJam(double hargaPerJam) {
        this.hargaPerJam = hargaPerJam;
    }

    //  Accessor (Getter)
    public String getIdItem() {
        return idItem;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public double getHargaPerJam() {
        return hargaPerJam;
    }

    //  Polymorphism (Overriding method untuk menampilkan informasi)
    public String getInformasi() {
        return "ID: " + idItem + " | Nama: " + namaItem + " | Tarif/Jam: Rp " + hargaPerJam;
    }
}