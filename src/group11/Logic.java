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
public class Logic {

    private int dwarfATK;
    private int elfATK;

    public Logic(int dwarf, int elf) {
        this.dwarfATK = dwarf;
        this.elfATK = elf;
    }

    public String result() {
        String rolls = "";

        if (dwarfATK == 1) {
            //AXE: 10 dmg
            rolls += "You hack at the elf with your axe, ";
        } else if (dwarfATK == 2) {
            //ALFIRE: 5 dmg
            rolls += "You heave a jar of alchemist's fire at the elf, ";
        } else {
            //SHIELD: -5 incoming dmg
            rolls += "You raise your shield, ";
        }

        if (elfATK == 1) {
            //BOW: 10 dmg
            rolls += "and he shoots at you with his bow.";
        } else if (elfATK == 2) {
            //SWORD: 5 dmg 
            rolls += "and he swipes at you with his sword.";
        } else {
            //BARRIER: -5 incoming dmg
            rolls += "but he guards himself with a barrier of magic.";
        }

        return rolls;
    }

}
