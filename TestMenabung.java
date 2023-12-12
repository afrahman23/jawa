public class TestMenabung {
    public static void main(String[] args) {
        TabunganWarga anggota = new TabunganWarga();
                
        anggota.setNomorWarga("12387659");
        anggota.setJumlahTabungan(20000.0);
        
        String nomorWarga = anggota.getNomorWarga();
        double jumlahTabungan = anggota.getJumlahTabungan();
        
        System.out.println("Nomor Warga: " + nomorWarga);
        System.out.println("Jumlah Tabungan: " + jumlahTabungan);
                
    }
    
}