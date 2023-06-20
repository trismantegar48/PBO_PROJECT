## com
pada dalam com terdapat beberapa package yakni :
1. composition
2. config
3. reference
4. supervisor
masing-masing package tersebut terdapat class java

## com.composition
1. BacaData (untuk menampilkan apa saja menu yang telah diatur di dalam database)
2. HapusData (untuk menghapus menu yang ingin kita hapus)
3. Menu (kelas ini berfungsi untuk menampilkan menu interaktif dan memproses pilihan yang dibuat oleh pengakses)
4. PerbaruiData (untuk memperbarui data yang ingin kita ubah baik itu dari nama, harga, ataupun jumlah)
5. SisipData (untuk menambah menu baru ke dalam database)

## com.config
MyConfig (kelas ini berfungsi untuk mengkonfigurasi koneksi database dengan menggunakan JDBC (Java Database Connectivity))

## com.reference
Produk (kelas ini memiliki beberapa atribut dan metode untuk merepresentasikan sebuah produk dalam sistem.)

## com.supervisor
MyDatabaseSupervisor (digunakan sebagai supervisor/pengontrol akses ke dalam database)

## App.java
Kelas ini berfungsi sebagai entry point dari program. 

Menu.showMenu();
untuk menampilkan menu untuk melakukan Read, Delete, Insert, Update, serta Exit

