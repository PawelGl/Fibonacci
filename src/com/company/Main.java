package com.company;

import java.util.Scanner;

public class Main {
    int liczba;
    int poprzednia;
    int wynik;
    int poprzednia2;
    Main(){
        this.wynik=1;
      this.liczba=-1;
      this.poprzednia=0;
      this.poprzednia2=0;
    }
    public static void main(String[] args) {
	// write your code here

        Scanner scanner=new Scanner(System.in);
        Main fibbo =new Main();
        while(fibbo.liczba<0) {
            System.out.print("Podaj liczbę dla której chcesz obliczyć wartość ciągu fibonnacciego: ");
            fibbo.liczba = scanner.nextInt();
            if(fibbo.liczba<0){
                System.out.println("Liczba która podales jest mniejsza od zera(liczba musi byc wieksza lub rowna zero).");
            }
            else{
                if(fibbo.liczba==0||fibbo.liczba==1) fibbo.liczba=1;

                else{

                    fibbo.poprzednia=1;
                    for(int i=0;i<fibbo.liczba;i++){

                          fibbo.wynik=fibbo.poprzednia2+fibbo.poprzednia;
                          fibbo.poprzednia2=fibbo.poprzednia;
                        fibbo.poprzednia=fibbo.wynik;

                    }
                }
            }

        }
        System.out.println("Liczba ktorej szukales to : "+fibbo.wynik);
    }
}
