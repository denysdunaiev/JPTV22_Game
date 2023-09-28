/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22_game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    public void run() {
    Random random = new Random();
    boolean repeat = true;
    do{
        int myNumber = random.nextInt(9-0+1)-0;
        System.out.println("Задуманно число в диапозоне от 0 до 9");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();scanner.nextLine();
        if (myNumber == userNumber){
            System.out.println("Ты выиграл! ");
        }else{
            System.out.println("Ты проиграл ");
        }
        System.out.println("Press \"q\" for exit, or another key to continue");
        String q = scanner.nextLine();
        if (q.equals("q")){
            repeat = false;
            }
        }while(repeat);
        System.out.println("-----End Game-----");
    }
}
