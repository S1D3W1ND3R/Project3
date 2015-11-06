/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group11;

/**
 *
 * @author 965369147
 */
public class Dwarf {

    private int health;

    public Dwarf() {
        health = 50;
    }

    public Dwarf(int health) {
        this.health = health;
    }

    public void dropHealth5() {
        health -= 5;
    }

    public void dropHealth10() {
        health -= 10;
    }

    public int getHealth() {
        return health;
    }
}
