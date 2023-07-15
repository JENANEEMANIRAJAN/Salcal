package salarycal;

import java.util.Scanner;

public class SalCAl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] hrsWrk = new int[7];
        for (int i = 0; i < 7; i++) {
            hrsWrk[i] = sc.nextInt();
        }
        int hrlywrk = 100;
        int dlywrk = 8;
        int wkllmt = 40;
        int salary = 0;
        for (int i = 0; i < 7; i++) {
            int dailysalary = hrsWrk[i] * hrlywrk;
            if (hrsWrk[i] > dlywrk) {
                int exthrs = hrsWrk[i] - dlywrk;
                dailysalary += exthrs * 15;

            }
            salary += dailysalary;
        }
        int totalhrs = calculateTotalHours(hrsWrk);
        if (totalhrs > wkllmt) {
            int extraHours = totalhrs - wkllmt;
            salary += extraHours * 25;
        }
        salary += calculateweekendBonus(hrsWrk);
        System.out.print(salary);
    }
    private static int calculateTotalHours(int[] hrsWked){
        int totalhours=0;
        for(int i=0;i<7;i++){
            totalhours+=hrsWked[i];
        }
        return totalhours;
    }
    private static int calculateweekendBonus(int[] hrsWked){
        int sh=hrsWked[6];
        int sunhours=hrsWked[6];
        int weekendBonus=0;
        weekendBonus+=sh*0.25*100;
        weekendBonus+=sunhours*0.5*100;
        return   weekendBonus;
    }
}

