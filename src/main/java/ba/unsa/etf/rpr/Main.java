package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	List<Integer> lista=new ArrayList<>();
    String string="stop";
    double suma=0;
    double deviation=0;
    Scanner scanner=new Scanner(System.in);
    for(;;){
        if(scanner.hasNextInt()){
            int a=scanner.nextInt();
            lista.add(a);
        }else if(scanner.hasNextLine()){
            String b=scanner.nextLine();
            if(b.equals(string)){
                break;

            }else{
                System.out.println("Pogresan unos unesite opet");
                if(scanner.hasNextInt()){
                    int a=scanner.nextInt();
                    lista.add(a);
                }else if(scanner.hasNextLine()) {
                    String c = scanner.nextLine();
                    if (c.equals(string)) {
                        break;
                    }
                }}
        }
    }
        System.out.println("Maksimalni element je: "+ Collections.max(lista));
        System.out.println("Minimalni element je: "+Collections.min(lista));

        for(int i=0;i<lista.size();i++){
            suma=suma+ lista.get(i);
        }
        System.out.println("Mean iznosi: "+suma/lista.size());
        System.out.println("Srednja vrijednost elemenata liste je: "+suma/lista.size());

        double mean=suma/lista.size();

        for(double num: lista) {
            deviation+= Math.pow(num - mean, 2);
        }
        System.out.println("Standardna devijacija elemenata liste je: "+Math.sqrt(deviation/ lista.size()));

        System.out.println(lista);
    }
}
