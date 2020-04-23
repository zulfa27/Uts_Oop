/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

/**
 *
 * @author Zulfa
 */
public class Data {
    private String Nim;
    private String Nama;
    private String kelas;
    private String Alamat;
    
    public Data(){
        Nim = "";
        Nama = "";
        kelas = "";
        Alamat = "";
    }
    
    public Data(String Nim, String Nama, String kelas, String Alamat) {
        this.Nim = Nim;
        this.Nama = Nama;
        this.kelas = kelas;
        this.Alamat = Alamat;
    }
     
    public  void  setNim(String noNim){
        this.Nim = Nim;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    
    public  String getNim() {return Nim;}
    
    public  String getNama() {return Nama;}
    
    public  String getkelas() {return kelas;}
    
    public String getAlamat() {return  Alamat;}
}
