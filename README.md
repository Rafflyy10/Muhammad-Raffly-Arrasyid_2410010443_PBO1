# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi sederhana Sistem Manajemen Rental PlayStation menggunakan Java sebagai tugas akhir mata kuliah Pemrograman Berbasis Objek 1.

## Pembuat

Nama: Muhammad Raffly Arrasyid

NPM: 2410010443

Kelas: 4E Reg Pagi Bjm

Program Studi: Teknik Informatika

## Deskripsi

Aplikasi ini digunakan untuk melakukan simulasi penyewaan PlayStation melalui terminal atau console. Pengguna dapat melihat daftar PlayStation yang tersedia, memilih konsol yang ingin disewa, memasukkan durasi sewa, dan mendapatkan total biaya penyewaan secara otomatis.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam Pemrograman Berorientasi Objek (OOP) seperti Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang digunakan:

### 1. Class

Class adalah blueprint atau cetakan untuk membuat object.

Pada project ini terdapat tiga class yaitu `RentalItem`, `PlayStation`, dan `MainApp`.

```java
//Rentalitem
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
    }}


//Playstation
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
    }}

//MainApp.Java
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        //  IO Sederhana
        Scanner scanner = new Scanner(System.in);

        //  Array
        PlayStation[] daftarPS = new PlayStation[3];

        //  Object
        daftarPS[0] = new PlayStation(
                "PS01",
                "PlayStation 4 Pro",
                8000,
                "PS4");

        daftarPS[1] = new PlayStation(
                "PS02",
                "PlayStation 5 Digital",
                12000,
                "PS5");

        daftarPS[2] = new PlayStation(
                "PS03",
                "PlayStation 5 Disk Edition",
                15000,
                "PS5");

        System.out.println("====================================");
        System.out.println(" SISTEM MANAJEMEN RENTAL PLAYSTATION ");
        System.out.println("====================================");
        System.out.println("\nDaftar Konsol Tersedia:");

        //  Perulangan
        for (int i = 0; i < daftarPS.length; i++) {
            System.out.println((i + 1) + ". "
                    + daftarPS[i].getInformasi());
        }

        int pilihan;
        int durasi;

        try {

            System.out.print("\nPilih nomor PS yang ingin disewa (1-3): ");
            pilihan = Integer.parseInt(scanner.nextLine());

            //  Seleksi
            if (pilihan < 1 || pilihan > daftarPS.length) {
                System.out.println("Pilihan tidak valid!");
                scanner.close();
                return;
            }

            System.out.print("Masukkan durasi sewa (jam): ");
            durasi = Integer.parseInt(scanner.nextLine());

            //  Seleksi
            if (durasi <= 0) {
                System.out.println("Durasi harus lebih dari 0 jam!");
                scanner.close();
                return;
            }

            PlayStation psDipilih = daftarPS[pilihan - 1];

            double totalBiaya =
                    psDipilih.getHargaPerJam() * durasi;

            System.out.println("\n=== DATA PENYEWAAN ===");
            System.out.println("Item Dipilih : "
                    + psDipilih.getNamaItem());

            System.out.println("Jenis Konsol : "
                    + psDipilih.getJenisKonsol());

            System.out.println("Harga/Jam    : Rp "
                    + psDipilih.getHargaPerJam());

            System.out.println("Durasi       : "
                    + durasi + " jam");

            System.out.println("---------------------------");

            System.out.println("TOTAL BAYAR  : Rp "
                    + totalBiaya);

            System.out.println("---------------------------");
            System.out.println("Terima kasih telah menyewa!");

        }

        //  Error Handling
        catch (NumberFormatException e) {

            System.out.println(
                    "Terjadi Kesalahan: Input harus berupa angka!");

        }

        scanner.close();
    }
}

```

### 2. Object

Object adalah instance dari sebuah class.

Pada kode ini object dibuat menggunakan keyword `new`.

```java
daftarPS[0] = new PlayStation(
        "PS01",
        "PlayStation 4 Pro",
        8000,
        "PS4");
```

### 3. Atribut

Atribut adalah variabel yang dimiliki oleh sebuah class.

Pada class `RentalItem` terdapat atribut:

```java
private String idItem;
private String namaItem;
private double hargaPerJam;
```

Pada class `PlayStation` terdapat atribut tambahan:

```java
private String jenisKonsol;
```

### 4. Constructor

Constructor adalah method yang dijalankan saat object dibuat.

Pada project ini constructor terdapat pada class `RentalItem` dan `PlayStation`.

```java
public RentalItem(String idItem,
                  String namaItem,
                  double hargaPerJam) {
    this.idItem = idItem;
    this.namaItem = namaItem;
    this.hargaPerJam = hargaPerJam;
}
```

```java
public PlayStation(String idItem,
                   String namaItem,
                   double hargaPerJam,
                   String jenisKonsol) {
    super(idItem, namaItem, hargaPerJam);
    this.jenisKonsol = jenisKonsol;
}
```

### 5. Mutator

Mutator atau setter digunakan untuk mengubah nilai atribut.

```java
public void setNamaItem(String namaItem) {
    this.namaItem = namaItem;
}
```

### 6. Accessor

Accessor atau getter digunakan untuk mengambil nilai atribut.

```java
public String getNamaItem() {
    return namaItem;
}
```

### 7. Encapsulation

Encapsulation dilakukan dengan menjadikan atribut bersifat private sehingga tidak dapat diakses langsung dari luar class.

```java
private String idItem;
private String namaItem;
private double hargaPerJam;
```

Akses terhadap atribut dilakukan melalui method getter dan setter.

### 8. Inheritance

Inheritance adalah konsep pewarisan dari class induk ke class anak.

Pada project ini class `PlayStation` mewarisi class `RentalItem`.

```java
public class PlayStation extends RentalItem {
    ...
}
```

### 9. Polymorphism

Polymorphism diterapkan menggunakan method overriding.

Method `getInformasi()` pada class `PlayStation` menimpa method yang ada pada class `RentalItem`.

```java
@Override
public String getInformasi() {
    return super.getInformasi()
            + " | Jenis Konsol: "
            + jenisKonsol;
}
```

### 10. Seleksi

Seleksi digunakan untuk menentukan keputusan berdasarkan kondisi tertentu.

Pada project ini digunakan seleksi `if`.

```java
if (pilihan < 1 || pilihan > daftarPS.length) {
    System.out.println("Pilihan tidak valid!");
}
```

```java
if (durasi <= 0) {
    System.out.println("Durasi harus lebih dari 0 jam!");
}
```

### 11. Perulangan

Perulangan digunakan untuk menampilkan seluruh data PlayStation yang tersimpan di dalam array.

```java
for (int i = 0; i < daftarPS.length; i++) {
    System.out.println((i + 1)
            + ". "
            + daftarPS[i].getInformasi());
}
```

### 12. IO Sederhana

IO Sederhana digunakan untuk menerima input dan menampilkan output.

Pada project ini digunakan class `Scanner`.

```java
Scanner scanner = new Scanner(System.in);

System.out.print(
    "Pilih nomor PS yang ingin disewa: ");
```

### 13. Array

Array digunakan untuk menyimpan beberapa object PlayStation.

```java
PlayStation[] daftarPS = new PlayStation[3];
```

### 14. Error Handling

Error Handling digunakan untuk menangani kesalahan input dari pengguna.

```java
try {

    pilihan =
        Integer.parseInt(scanner.nextLine());

} catch (NumberFormatException e) {

    System.out.println(
        "Input harus berupa angka!");

}
```

## Usulan Nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |
