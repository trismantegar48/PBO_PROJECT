package app;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Config.MyConfig;
import Models.Produk;

public class DbController extends MyConfig {

    public static List<Produk> getDatabase() {
        List<Produk> produkList = new ArrayList<>();
        connection();
        try {
            // query = "SELECT nama, harga, stok FROM tb_barang ORDER BY ID DESC";
            query = "SELECT ID, NAMA, HARGA, JUMLAH FROM tb_produk";

            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                int id = resultSet.getInt("ID");
                String nama = resultSet.getString("NAMA");
                int harga = resultSet.getInt("HARGA");
                int jumlah = resultSet.getInt("JUMLAH");

                Produk produk = new Produk(id, nama, harga, jumlah);
                produkList.add(produk);
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produkList;
    }

    public static Produk getProdukByNama(String nama) {
        Produk produk = null;
        connection();
        query = "SELECT * FROM tb_produk WHERE NAMA=?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nama);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                produk = new Produk(resultSet.getInt("id"), resultSet.getString("nama"), resultSet.getLong("harga"), resultSet.getInt("jumlah"));
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produk;
    }

    public static boolean insertData(String nama, long harga, int jumlah) {
        connection();
        query = "INSERT INTO tb_produk (NAMA, HARGA, jumlah) VALUES (?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nama);
            preparedStatement.setLong(2, harga);
            preparedStatement.setInt(3, jumlah);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void updateNama(int id, String nama) {
        connection();
        query = "UPDATE tb_produk SET NAMA=? WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nama);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateHarga(int id, long harga) {
        connection();
        query = "UPDATE tb_produk SET HARGA=? WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, harga);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateJumlah(int id, int jumlah) {
        connection();
        query = "UPDATE tb_produk SET jumlah=? WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, jumlah);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean deleteData(int id) {
        connection();
        query = "DELETE FROM tb_produk WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            int affectedRowDelete = preparedStatement.executeUpdate();
            if (affectedRowDelete > 0) {
                return true;
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}