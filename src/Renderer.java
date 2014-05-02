import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;

public class Renderer {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;

    public void start() {
        try {
            Display.setDisplayMode(new DisplayMode(WIDTH,HEIGHT));
            Display.setTitle("Very Access");
            Display.setVSyncEnabled(true);
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
            System.exit(0);
        }

        initialize();
        gameLoop();

        Display.destroy();
    }

    private void initialize() {
        glEnable(GL_TEXTURE_2D);
        glDisable(GL_DEPTH_TEST);
        glViewport(0, 0, WIDTH, HEIGHT);
    }

    private void gameLoop() {
        while(!Display.isCloseRequested()) {
            checkInput();
            Display.sync(10);
            Display.update();
        }
    }

    private void checkInput() {
        while(Keyboard.next()) {
            if(Keyboard.isKeyDown(Keyboard.KEY_UP)) {
                System.out.println("UP IS DOWN");
            }
        }
    }

    public static void main(String[] args) {
        Renderer renderer = new Renderer();
        renderer.start();
    }
}