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
public class Titan extends Character{
    Titan(){
        super(0,45,200);
 }
 @Override
 public boolean attack() {
 double counter = Math.random() * 10;
 if (counter > 0 && counter <= 4.0)
 return true;
 else
 return false;
 }
}


