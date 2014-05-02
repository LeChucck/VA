import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Renderer {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;

    public void start() {
        try {
            Display.setDisplayMode(new DisplayMode(WIDTH,HEIGHT));
            Display.setTitle("Very Access");
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
            System.exit(0);
        }

        while(!Display.isCloseRequested()) {
            checkInput();
            Display.update();
        }

        Display.destroy();
    }

    private void checkInput() {
        while(Keyboard.next()) {
            if(Keyboard.isKeyDown(Keyboard.KEY_UP)) {

            }
        }
    }

    public static void main(String[] args) {
        Renderer renderer = new Renderer();
        renderer.start();
    }
}