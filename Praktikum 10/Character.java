/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author Pasha
 */
public abstract class Character {
    private int defense;
    private int attack;
    private int HP;

    public Character(int defense, int attack, int HP) {
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }
    

    
public int getDefense(){
    return defense;
}

public void setDefense(int defense) {
 this.defense = defense;
}
    public int getAttack() {
 return attack;
}
public void setAttack(int attack) {
 this.attack = attack;
 }
public int getHP() {
 return HP;
 }
public void setHP(int HP) {
 this.HP = HP;

}
public abstract boolean attack();

 public void receiveDamage(int damage){
 setHP(HP - (damage - getDefense()));
 if (HP <= 0){
 setHP(0);
 }}
public void info(){
 System.out.printf("%-25s: %d%n", "HP", getHP() );
 System.out.printf("%-25s: %d%n", "Attack", getAttack() );
 System.out.printf("%-25s: %d%n", "Defense", getDefense() );
}
}