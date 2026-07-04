package UAS;

//  Inheritance 
public class PlayStation extends RentalItem {
    private String jenisKonsol; // Contoh: PS3, PS4, PS5

    // Constructor 
    public PlayStation(String idItem, String namaItem, double hargaPerJam, String jenisKonsol) {
        super(idItem, namaItem, hargaPerJam);
        this.jenisKonsol = jenisKonsol;
    }

    public String getJenisKonsol() {
        return jenisKonsol;
    }

    public void setJenisKonsol(String jenisKonsol) {
        this.jenisKonsol = jenisKonsol;
    }

    //  Polymorphism 
    @Override
    public String getInformasi() {
        return super.getInformasi() + " | Jenis Konsol: " + jenisKonsol;
    }
}