
import Command.FatherChrismas;
import Observer.Dwarf;
import Observer.MagicBoard;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Name;
        System.out.println("Enter :Dolls or :Wheel");
        Name = scan.nextLine();
        FatherChrismas connection = FatherChrismas.getInstance();


        MagicBoard magicBoard = new MagicBoard();
        Dwarf d1 = new Dwarf("Gomzizi");
        Dwarf d2 = new Dwarf("Gruhter");
        Dwarf d3 = new Dwarf("Pancho");


        magicBoard.subscribe(d1);
        magicBoard.subscribe(d2);
        magicBoard.subscribe(d3);

        if (Name.equals("Doll")) {
            connection.postMessage("I want Dolls");
            magicBoard.setTopic("Bring me dolls");
        }
        if (Name.equals("Wheel"))
            connection.postMessage("I want Wheels");
        magicBoard.setTopic("Bring me Wheels");
    }
    }

