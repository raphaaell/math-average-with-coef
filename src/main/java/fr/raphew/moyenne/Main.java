package fr.raphew.moyenne;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This file of 'Calculateur de moyenne avec coef' was created by Raphew on 07/01/2021
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your notes :");
        ArrayList<Float> globalNote = new ArrayList<>();
        ArrayList<Float> globalMax = new ArrayList<>();
        ArrayList<Float> globalCoef = new ArrayList<>();
        int iN = 1;
        while(true){
            System.out.println(iN + " note :");
            String text = scanner.nextLine();
            if(text.equalsIgnoreCase("next"))
                break;
            else{
                float note = Float.parseFloat(text);
                globalNote.add(note);
            }
            iN++;
        }
        for (int i = 1; i <= globalNote.size(); i++) {
            System.out.println(i + " max (for this note : " + globalNote.get(i-1) + ") :");
            String text = scanner.nextLine();
            float max = Float.parseFloat(text);
            globalMax.add(max);
        }
        for (int i = 1; i <= globalNote.size(); i++) {
            System.out.println(i + " coef (for this note : " + globalNote.get(i-1) + ") :");
            String text = scanner.nextLine();
            float coef = Float.parseFloat(text);
            globalCoef.add(coef);
        }
        float top = 0;
        float down = 0;
        for (int i = 0; i < globalNote.size(); i++) {
            float noteA = globalNote.get(i);
            float max = globalMax.get(i);
            float coef = globalCoef.get(i);

            float note = (noteA / max) * 20;
            top += (note * coef);
            down += coef;
        }
        float moyenne = top / down;
        System.out.println("your average is of : " + moyenne);
    }
}
