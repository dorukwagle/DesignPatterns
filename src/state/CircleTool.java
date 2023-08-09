package state;

public class CircleTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Circle tool selected");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a circle");
    }
}
