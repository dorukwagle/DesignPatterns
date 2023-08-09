package state;

public class Canvas {
    private Tool selectedTool;

    public void mouseUp() {
        selectedTool.mouseUp();
    }

    public void mouseDown() {
        selectedTool.mouseDown();
    }

    public void setSelectedTool(Tool selectedTool) {
        this.selectedTool = selectedTool;
    }
}
