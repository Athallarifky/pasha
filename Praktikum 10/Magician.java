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
public class Magician extends Character{
    Magician(){
       super(10,60,100);
    }
   @Override
 public boolean attack() {
    double counter = Math.random() * 10;
    if (counter > 0 && counter <= 3.5){
        return true;
    }
    else {
        return false;
    }
 }
}
