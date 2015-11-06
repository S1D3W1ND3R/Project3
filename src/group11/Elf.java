/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group11;

import java.util.Random;

/**
 *
 * @author 965369147
 */
public class Elf {

    Random rand = new Random();
    private int health;

    public Elf() {
        health = 50;
    }

    public int getAttack() {
        return (rand.nextInt(2) + 1);
    }

    public int getHealth() {
        return health;
    }

    public void dropHealth5() {
        health -= 5;
    }

    public void dropHealth10() {
        health -= 10;
    }

}
