/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_JDBC;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author edwin
 */
public interface Interfacermi extends Remote {

    public String Delete(String nik) throws RemoteException;

    public String Insert(String nik, String nama, String tmplh, Date tgllh,
            String jk, String gd, String alamat, String rt, String rw,
            String keldesa, String kecamatan, String agama, String sk,
            String pekerjaan, String warneg)
            throws RemoteException;

    public String Update(String nik, String nama, String tmplh, Date tgllh,
            String jk, String gd, String alamat, String rt, String rw,
            String keldesa, String kecamatan, String agama, String sk,
            String pekerjaan, String warneg) 
            throws RemoteException;
    
    public ArrayList Search(String nik) throws RemoteException;
    
    public String Updatedp(String kecamatan,String jumlah) throws RemoteException;
    
    public boolean getLogin(String un,String pass)throws RemoteException;
   
}
