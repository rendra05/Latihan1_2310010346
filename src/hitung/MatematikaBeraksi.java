package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika rendra = new Matematika(4,6);
        
        System.out.println("hasil penjumlahan: "+rendra.setPenjumlahan());
        System.out.println("hasil pengurangan: "+rendra.setPengurangan());
        System.out.println("hasil perkalian: "+rendra.setPerkalian());
        System.out.println("hasil pembagian: "+rendra.setPembagian());
    }
}
