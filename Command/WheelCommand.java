package Command;

public class WheelCommand implements Command{

    private FatherChrismas wheels;

    public WheelCommand(FatherChrismas wheels){
        this.wheels = wheels;
    }
    @Override
    public void execute() {
        this.wheels.Wheel();
    }
}
