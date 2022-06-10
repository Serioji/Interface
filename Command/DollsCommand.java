package Command;

public class DollsCommand implements Command{

private FatherChrismas dolls;

public DollsCommand(FatherChrismas dolls){
    this.dolls = dolls;
}


    @Override
    public void execute() {
        this.dolls.Doll();
    }
}
