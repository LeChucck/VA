import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Renderer {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;

    public void start() {
        try {
            Display.setDisplayMode(new DisplayMode(WIDTH,HEIGHT));
        } catch (LWJGLException e) {
            e.printStackTrace();
            System.exit(0);
        }

        while(!Display.isCloseRequested()) {
            Display.update();
        }
    }

    public static void main(String[] args) {
        Renderer renderer = new Renderer();
        renderer.start();
    }
}