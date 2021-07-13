/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_JDBC;

import java.sql.Statement;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author edwin
 */
public class Serverrmi extends UnicastRemoteObject implements Interfacermi {

    public Serverrmi() throws RemoteException {
        super();
    }

    public static void main(String[] args) throws RemoteException {
        Registry reg = LocateRegistry.createRegistry(1089);
        Serverrmi se = new Serverrmi();
        reg.rebind("db", se);
        System.out.println("Server berjalan.");
    }

    @Override
    public String Delete(String nik) throws RemoteException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpend", "root", "");
            Statement st = (Statement) con.createStatement();
            String sql = "delete from dataktp where nik='" + nik + "'";
            st.executeUpdate(sql);
            return "Record Deleted";

        } catch (Exception e) {
            return (e.toString());
        }

    }

    @Override
    public String Insert(String nik, String nama, String tmplh, Date tgllh, String jk, String gd, String alamat, String rt, String rw, String keldesa, String kecamatan, String agama, String sk, String pekerjaan, String warneg) throws RemoteException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpend", "root", "");
            Statement st = (Statement) con.createStatement();
            String sql = "insert into dataktp (nik, "
                    + "nama_lengkap, "
                    + "kotalahir, "
                    + "tgllahir, "
                    + "jenis_kelamin, "
                    + "gol_darah, "
                    + "alamat, "
                    + "rt, "
                    + "rw, "
                    + "kel_desa, kecamatan, agama, status_kawin, pekerjaan, warneg) "
                    + "values('" + nik + "','" + nama + "','" + tmplh + "',"
                    + "'" + tgllh + "','" + jk + "','" + gd + "','" + alamat + "',"
                    + "'" + rt + "','" + rw + "','" + keldesa + "','" + kecamatan + "','" + agama + "',"
                    + "'" + sk + "','" + pekerjaan + "','" + warneg + "')";
            st.executeUpdate(sql);
            return "Record Inserted";

        } catch (Exception e) {
            return (e.toString());
        }
    }

    @Override
    public String Update(String nik,
            String nama, String tmplh, Date tgllh,
            String jk, String gd, String alamat,
            String rt, String rw, String keldesa,
            String kecamatan, String agama, String sk,
            String pekerjaan, String warneg) throws RemoteException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpend", "root", "");
            Statement st = (Statement) con.createStatement();
            String sql = "update dataktp set alamat='" + alamat + "',"
                    + "rt='" + rt + "',"
                    + "rw='" + rw + "',"
                    + "kel_desa='" + keldesa + "',"
                    + "agama='"+agama+"',"
                    + "kecamatan='" + kecamatan + "',"
                    + "pekerjaan='" + pekerjaan + "',"
                    + "status_kawin='" + sk + "' where nik='" + nik + "'";
            st.executeUpdate(sql);
            return "Record Updated";

        } catch (Exception e) {
            return (e.toString());
        }
    }

    @Override
    public ArrayList Search(String nik) throws RemoteException {
        ArrayList ktp = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpend", "root", "");
            Statement st = (Statement) con.createStatement();
            String sql = "select * from dataktp where nik='" + nik + "'";
            ResultSet rs;
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ktp.add("Nama : " + rs.getString("nama_lengkap") + "\n");
                ktp.add("Jenis Kelamin : " + rs.getString("jenis_kelamin"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ktp;
    }

    @Override
    public String Updatedp(String kecamatan, String jumlah) throws RemoteException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpend", "root", "");
            Statement st = (Statement) con.createStatement();
            String sql = "update datapro set jumlah_penduduk='" + jumlah + "' where kecamatan='" + kecamatan + "'";
            st.executeUpdate(sql);
            return "Record Updated";
        } catch (Exception e) {
            return (e.toString());
        }
    }

    @Override
    public boolean getLogin(String un, String pass) throws RemoteException {
        boolean temu=false;
        try {
//          Class.forName("com.mysql.cj.jdbc.Driver");
//          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpend", "root", "");
//          Statement st = (Statement) con.createStatement();
//          String sql = "select * from login where username = '"+un+"' and password = '"+pass+"'";
//            ResultSet rs = st.executeQuery(sql);
//            if(rs.next())
            if (un.equals("root") && pass.equals("admin")) {
                return temu = true;
            }else{
                return temu = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return temu;
    }

}
