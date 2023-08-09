package state;

public class StatePattern {
    public static void demo() {
        var circle = new CircleTool();
        var eraser = new EraserTool();
        var canvas = new Canvas();

        canvas.setSelectedTool(circle);
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setSelectedTool(eraser);
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
