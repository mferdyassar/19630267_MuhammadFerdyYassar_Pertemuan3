package Percabangan;

public class Switch {
    public static void main(String[] args){
        int jalanJalan=2;
        switch(jalanJalan){
            case '1':
                System.out.println("Mhs    : \"Terima kasih pak\"");
                break;
            case '2':
                System.out.println("Mhs    : \"Kenapa ulun kada dapat A, Pak?\"");
                break;
            case '3':
                System.out.println("Mhs    : \"Ulun turun tarus pak ai tugas gawi tarus :(\"");
                break;
            default:
                System.out.println("Mhs    : \"Ulun turun tarus pak ai tugas gawi jua\"");
                break;
        }
    }
}
