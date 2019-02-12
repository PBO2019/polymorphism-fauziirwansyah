public class staff extends pegawai {
    private int tarif;
    private int pendapatan;
    private String kode;

    public staff(){
        System.out.println("");
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
