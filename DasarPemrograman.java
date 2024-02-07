package dasarpemrograman;
import java.util.Scanner;
public class DasarPemrograman {

    
    public static void main(String[] args) {
       String kata;
        
         Scanner input = new Scanner(System.in);
        System.out.println("Masakkan kata -> merah / kuning / hijau  ");
        
        kata = input.nextLine();
        if (kata.equalsIgnoreCase("merah")){
            System.out.println("Anda berhenti");
        }
        else if (kata.equalsIgnoreCase ("kuning")){
            System.out.println("Persiapan berhenti");
        }
        else if (kata.equalsIgnoreCase ("hijau")){
            System.out.println("Jalan");
        
    }else  {
         System.out.println("warna salah")
                    ;}
    }
    }
    

