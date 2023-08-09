package momento;

public class Momento {
    public static void demo() {
        var editor = new Editor();
        var history = new EditorHistory();

        editor.setContent("hello");
        history.push(editor.createState());
        editor.setContent("world");
        history.push(editor.createState());
        editor.setContent("let's");
        history.push(editor.createState());
        editor.setContent("dance");
        history.push(editor.createState());

        editor.restoreState(history.pop());
        System.out.println(editor.getContent());
        editor.restoreState(history.pop());
        System.out.println(editor.getContent());
    }
}
