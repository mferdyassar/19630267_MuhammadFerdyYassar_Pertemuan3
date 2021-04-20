package Percabangan;

public class IfElse {
    public static void main(String[] args){
        double totalBelanja = 40000;
        double uangDiDompet = 80000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangi belanjaan anda");
        }else if(uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("Uang Cukup, angsul : "+angsul);
        }else{
            System.out.println("Uang pas banar... Selamat Menikmati..");
        }
    }
}
