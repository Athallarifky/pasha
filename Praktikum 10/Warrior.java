/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author Lenovo
 */
 public class Warrior extends Character {
 Warrior(){
     super(30,25,80);
 }
 
 @Override
 public boolean attack() {
 double counter = Math.random() * 10;
 if (counter > 0 && counter <= 6.0)
 return true;
 else
 return false;
 }
}

