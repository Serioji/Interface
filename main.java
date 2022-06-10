
import Command.FatherChrismas;
import Observer.Dwarf;
import Observer.MagicBoard;



public class main {
    public static void main(String[] args){
            String request = "I want dolls";
        FatherChrismas connection = FatherChrismas.getInstance();
        connection.postMessage(request);

        MagicBoard magicBoard = new MagicBoard();
        Dwarf d1 = new Dwarf("Gomzizi");
        Dwarf d2 = new Dwarf("Gruhter");
        Dwarf d3 = new Dwarf("Pancho");


        magicBoard.subscribe(d1);
        magicBoard.subscribe(d2);
        magicBoard.subscribe(d3);

        if(request.equals("I want dolls")){
            magicBoard.setTopic("Bring me dolls");
        }
        else
            magicBoard.setTopic("i want Wheels");

    }
}
