/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package momsage;
import java.util.Scanner;
public class MomsAge {
    
    static int trueAge;
    static int yob;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What year was your mother born in?");
        yob = sc.nextInt();
        trueAge = 2017 - yob;
        if(trueAge > 18){
            System.out.println("Your mother is STILL 18");
        }
        else{
            if(trueAge < 10 && trueAge > -1){
                System.out.println("Your mother is " + trueAge + ". But how???");
        }
            if(trueAge < 14 && trueAge > 9){
                System.out.println("Your mother is " + trueAge + ". Quite unlikely.");
            }
            if(trueAge < 0){
                System.out.println("Your mother is " + trueAge + ". But She's not even born yet!!");
            }
            else{
                System.out.println("Your mother is " + trueAge + ".");
            }
            }
        }
    }
    

