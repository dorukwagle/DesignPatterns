package state;

public class EraserTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Eraser Selected");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erased something");
    }
}
