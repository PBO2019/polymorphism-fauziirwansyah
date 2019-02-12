public class supervisor extends pegawai {
    private int tarif;
    private int pendapatan;
    private String kode;

    public supervisor(){
        this.gaji();
    }
    public void gaji(int tarif, String kode){
        System.out.println("Gaji anda "+kode);
        this.tarif=tarif;
    }
    public int getgaji(){
        return tarif;
    }
}
