import java.util.Scanner;

public class UmanoUmano {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String g1,g2,mg1,mg2;
        System.out.println("Inserire il nome del primo giocatore");
        g1=in.nextLine();
        System.out.println("Inserire il nome del secondo giocatore");
        g2=in.nextLine();
        do {
            System.out.println("Mossa del giocatore "+g1);
            mg1=in.nextLine();
            if (!mg1.equalsIgnoreCase("forbice") && !mg1.equalsIgnoreCase("sasso") && !mg1.equalsIgnoreCase("carta")){
                System.out.println("Mossa non corretta");
            }
        } while (!mg1.equalsIgnoreCase("forbice") && !mg1.equalsIgnoreCase("sasso") && !mg1.equalsIgnoreCase("carta"));
        do {
            System.out.println("Mossa del giocatore "+g2);
            mg2=in.nextLine();
            if (!mg2.equalsIgnoreCase("forbice") && !mg2.equalsIgnoreCase("sasso") && !mg2.equalsIgnoreCase("carta")){
                System.out.println("Mossa non corretta");
            }
        } while (!mg2.equalsIgnoreCase("forbice") && !mg2.equalsIgnoreCase("sasso") && !mg2.equalsIgnoreCase("carta"));
        if (mg1.equalsIgnoreCase("forbice") && mg2.equalsIgnoreCase("carta"))
            System.out.println("Vince : "+g1);
        else if (mg2.equalsIgnoreCase("forbice") && mg1.equalsIgnoreCase("carta"))
            System.out.println("Vince : "+g2);
        else if (mg1.equalsIgnoreCase("carta") && mg2.equalsIgnoreCase("sasso"))
            System.out.println("Vince : "+g1);
        else if (mg2.equalsIgnoreCase("carta") && mg1.equalsIgnoreCase("sasso"))
            System.out.println("Vince : "+g2);
        else if (mg1.equalsIgnoreCase("sasso") && mg2.equalsIgnoreCase("forbice"))
            System.out.println("Vince : "+g1);
        else if (mg2.equalsIgnoreCase("sasso") && mg1.equalsIgnoreCase("forbice"))
            System.out.println("Vince : "+g2);
        else
            System.out.println("Pareggio");
     }
}