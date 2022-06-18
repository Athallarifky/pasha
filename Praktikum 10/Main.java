package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
*
* @author desif
*/
public class Main {
 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 // TODO code application logic here
 
    Magician magic = null;
    Healer heal = null;
    Warrior fighter = null;
    Titan enemy = new Titan();
    
    Scanner scan = new Scanner(System.in);

    System.out.println("=============================");
    System.out.println("WELCOME TO CLASH ROYALE");
    System.out.print("PLEASE ENTER YOUR USERNAME :");
    String nama = scan.nextLine();
    System.out.println("CHOOSE YOUR ROLE : ");
    System.out.println("1. Magician\n2. Healer\n3. Warrior");
    
    int pilih = 0;
    
    boolean cek =  true;
    do{
       try{ 
        System.out.print("ENTER : ");
        pilih = scan.nextInt();
        if(pilih > 3 || pilih < 1){
            System.err.println("PLEASE ENTER THE RIGHT OPTION!!!");
        }else {
            cek = false;
        }
    
        }catch(InputMismatchException e){
            System.err.println("PLEASE ENTER THE RIGHT OPTION ");
            scan.next();
        }
    }while(cek); 
    
    cek = true;
    
    if(pilih == 1){
        magic = new Magician();
        System.out.println(nama +" : Magician");
        System.out.println("");
        magic.info();
        System.out.println("");
        System.out.println("");
        System.out.println(" === Matchmaking ===");
        for (int i = 0; cek ; i++) {
            if(enemy.getHP() > 0 && magic.getHP() > 0){
                
                System.out.println(" ===== TURN "+(i+1)+"==== ");
                
                if(magic.attack()){
                    magic.receiveDamage(enemy.getAttack());
                }
                
                if(enemy.attack()){
                    enemy.receiveDamage(magic.getAttack());
                }
                
                System.out.println(nama+" HP : "+magic.getHP());
                System.out.println("Enemy's HP : "+enemy.getHP());
                
            }else {
                cek = false;
            }
        }
        
        
        
    }
    else if(pilih == 2){
        System.out.println(nama + " : Healer");
        heal = new Healer();
        
        System.out.println("");
        heal.info();
        System.out.println("");
        System.out.println("");
        System.out.println(" === Matchmaking ===");
        for (int i = 0; cek ; i++) {
            if(enemy.getHP() > 0 && heal.getHP() > 0){
                
                System.out.println(" ===== TURN "+(i+1)+"==== ");
                
                if(i % 2 == 1){
                    heal.heal();
                    System.out.println("SAYA NGE-HEAL");
                }
                
                if(heal.attack()){
                    heal.receiveDamage(enemy.getAttack());
                }
                
                if(enemy.attack()){
                    enemy.receiveDamage(heal.getAttack());
                }
                
                System.out.println(nama+" HP : "+heal.getHP());
                System.out.println("Enemy's HP : "+enemy.getHP());
                
            }else {
                cek = false;
            }
        }
    }else if(pilih == 3){
        fighter = new Warrior();
        System.out.println(nama+ " : Warrior");
        System.out.println("");
        fighter.info();
        System.out.println("");
        System.out.println("");
        System.out.println(" === Matchmaking ===");
        for (int i = 0; cek ; i++) {
            if(enemy.getHP() > 0 && fighter.getHP() > 0){
                
                System.out.println(" ===== TURN "+(i+1)+"==== ");
                
                if(fighter.attack()){
                    fighter.receiveDamage(enemy.getAttack());
                }
                
                if(enemy.attack()){
                    enemy.receiveDamage(fighter.getAttack());
                }
                
                System.out.println(nama+" HP : "+fighter.getHP());
                System.out.println("Enemy's HP : "+enemy.getHP());
                
            }else {
                cek = false;
            }
        }
    }
        
        
    
 
    
 }
}