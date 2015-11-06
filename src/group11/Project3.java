/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group11;

import java.util.Scanner;

/**
 *
 * @author 965369147
 */
public class Project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanIn = new Scanner(System.in);
        Dwarf dwarf = new Dwarf();
        Elf elf = new Elf();
        boolean runAgain = true;
        int attack = 0;

        System.out.println(
                "                    _______\n"
                + "                   /=  |  #\\\n"
                + "                  /.__-| __ \\\n"
                + "                  |/ _\\_/_ \\|\n"
                + "                  (( __ \\__))\n"
                + "               __ ((()))))()) __\n"
                + "             ,' +|()))))(((()|# `.\n"
                + "            /  + |^))()))))(^|   =\\\n"
                + "           /  + /^v^(())()()v^\\'  .\\\n"
                + "           |__.'^v^v^))))))^v^v`.__|\n"
                + "          /_ ' \\______(()_____(   |\n"
                + "     _..-'   _//_____[xxx]_____\\.-|\n"
                + "    /,_#\\.=-'  |^v^v^v^v^v^v^v^| _|\n"
                + "    \\)|)       |v^v^v^v^v^v^v^v| _|\n"
                + "     ==        |.-, .--,-. .-' |#  \\,\n"
                + "     ><        |,- --._/\\__,--.|\\_=_/\n"
                + "     ><        |______/ _\\_____|_\n"
                + "  ,  ||        \\     /  \\       /\n"
                + "//\\\\_||_)\\     /..-._\\   \\ ...__\\\n"
                + "||   \\/ #|    |_='_(     |  =_(_\n"
                + "||  _/\\_ |   /     =\\    /  '  =\\\n"
                + "\\\\/ \\/  )/    |=____#|    |'=....#|");

        System.out.println("You are a dwarf, working peacefully in your mine. "
                + "With no regard for your work,\nan elf has wandered into your tunnel "
                + "with the clear intention of starting a fight.\nGive him hell.\n");

        do {
            do {
                System.out.println("You have three options: do you...");
                System.out.printf("\t1.-attack with your axe?\n");
                System.out.printf("\t2.-throw alchemist's fire?\n");
                System.out.printf("\t3.-raise your shield?\n");
                System.out.print("Please enter 1, 2, or 3:");
                attack = scanIn.nextInt();
            } while (attack != 1 && attack != 2 && attack != 3);

            Logic logic = new Logic(attack, elf.getAttack());
            System.out.println(logic.result());

        } while (runAgain = true || dwarf.getHealth() > 0 || elf.getHealth() > 0);

    }
}
