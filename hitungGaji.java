public class hitungGaji {
    public static void main (String[]args){
        int bayaran = 30;
        supervisor su = new supervisor();
        su.gaji(400000,"DMS");
        System.out.println("sebesar "+su.getgaji() * bayaran);
        staff sf = new staff();
        sf.gaji(250000,"BBG");
        System.out.println("sebesar "+sf.getgaji()*bayaran);
    }
}
