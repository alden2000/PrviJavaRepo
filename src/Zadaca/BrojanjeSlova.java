package Zadaca;

import java.util.Scanner;

public class BrojanjeSlova {
    public static void main(String[] args) {
        String recenica = "Petar pan je pojeo crvenu papriku";
        char[] razlozenaRecenica = recenica.toCharArray();
        char[] trazenaRijec = new char[3];
        boolean postoji = false;
        System.out.println("Unesi rijec: ");
        for (int i = 0; i < trazenaRijec.length; i++) {
            trazenaRijec[i] = new Scanner(System.in).nextLine().charAt(0);
        }
        LABELA: for (int i = 0; i < razlozenaRecenica.length; i++) {
            if(postoji){
                break ;
            }
            if (razlozenaRecenica[i] != trazenaRijec[0]) {
                continue;
            }
            for (int j = 1; j < trazenaRijec.length; j++) {
                if(razlozenaRecenica[i+j]==trazenaRijec[j]){
                    //System.out.println("Vasa rijec pocinje od " + (i + 1) + ". znaka.");
                    postoji = true;
                }else {
                    postoji = false;
                    continue LABELA;
                }
//                System.out.println("Vasa rijec pocinje od " + (i + 1) + ". znaka.");
//                postoji = true;
            }
        }
        if (!postoji) {
            System.out.println("Ta rijec nije u recenici");
        }else{
            System.out.println("Ta rijec se nalazi u recenici");
        }
    }
}
