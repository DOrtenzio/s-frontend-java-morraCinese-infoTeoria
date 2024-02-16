import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class PcUmano {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random generatore=new Random();
        int g2=generatore.nextInt(3);
        String g1,mg1,mg2="";
        System.out.println("Inserire il nome del giocatore");
        g1=in.nextLine();
        switch (g2){
            case 0:
                mg2="forbice";
                break;
            case 1:
                mg2="carta";
                break;
            case 2:
                mg2="sasso";
                break;
        }
        do {
            System.out.println("Mossa del giocatore "+g1);
            mg1=in.nextLine();
            if (!mg1.equalsIgnoreCase("forbice") && !mg1.equalsIgnoreCase("sasso") && !mg1.equalsIgnoreCase("carta")){
                System.out.println("Mossa non corretta");
            }
        } while (!mg1.equalsIgnoreCase("forbice") && !mg1.equalsIgnoreCase("sasso") && !mg1.equalsIgnoreCase("carta"));
        if (mg1.equalsIgnoreCase("forbice") && mg2.equalsIgnoreCase("carta"))
            System.out.println("Vince : "+g1);
        else if (mg2.equalsIgnoreCase("forbice") && mg1.equalsIgnoreCase("carta"))
            System.out.println("Vince la macchina.");
        else if (mg1.equalsIgnoreCase("carta") && mg2.equalsIgnoreCase("sasso"))
            System.out.println("Vince : "+g1);
        else if (mg2.equalsIgnoreCase("carta") && mg1.equalsIgnoreCase("sasso"))
            System.out.println("Vince la macchina.");
        else if (mg1.equalsIgnoreCase("sasso") && mg2.equalsIgnoreCase("forbice"))
            System.out.println("Vince : "+g1);
        else if (mg2.equalsIgnoreCase("sasso") && mg1.equalsIgnoreCase("forbice"))
            System.out.println("Vince la macchina.");
        else
            System.out.println("Pareggio");
        System.out.println("Mossa pc: "+mg2);
    }
}