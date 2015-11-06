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

        //AXE: 10 dmg
        if (dwarfATK == 1) {
            rolls += "You hack at the elf with your axe, ";
            //BOW: 10 dmg
            if (elfATK == 1) {
                rolls += "and he shoots at you with his bow.";
                //SWORD: 5 
            } else if (elfATK == 2) {
                rolls += "and he swipes at you with his sword.";
            } else {
                rolls += "but he guards himself with a barrier of magic.";
            }

        } else if (dwarfATK == 2) {
            rolls += "You heave a jar of alchemist's fire at the elf, ";
            //BOW: 10 dmg
            if (elfATK == 1) {
                rolls += "and he shoots at you with his bow.";
                //SWORD: 5 dmg 
            } else if (elfATK == 2) {
                rolls += "and he swipes at you with his sword.";
                //BARRIER: -5 incoming dmg
            } else {
                rolls += "but he guards himself with a barrier of magic.";
            }

        } else {
            rolls += "You raise your shield, ";
            //BOW: 10 dmg
            if (elfATK == 1) {
                rolls += "and he shoots at you with his bow.";
                //SWORD: 5 dmg 
            } else if (elfATK == 2) {
                rolls += "and he swipes at you with his sword.";
                //BARRIER: -5 incoming dmg
            } else {
                rolls += "but he guards himself with a barrier of magic.";
            }
        }
        return rolls;
    }

}
