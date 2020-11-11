/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan43.gajipegawai;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program : Program Menghitung Gaji Pegawai
 */
public class Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GajiPegawai pegawai = new GajiPegawai();
        pegawai.setNama("Alfi Nurizkya");
        pegawai.setAlamat("RT 03, RW 01, Nomor 115, Cikasungka");
        pegawai.setGajiPokok(4500000);
        pegawai.setUangTunjangan(250000);
        pegawai.setUangTransport(300000);
        pegawai.setTotalGaji(
                pegawai.totalGaji(
                        pegawai.getUangTunjangan(),
                        pegawai.getUangTransport(),
                        pegawai.getGajiPokok()
                )
        );
        pegawai.tampilData(
                pegawai.getNama(),
                pegawai.getAlamat(),
                pegawai.getUangTunjangan(),
                pegawai.getUangTransport(),
                pegawai.getGajiPokok(),
                pegawai.getTotalGaji()
        );
    }
}
