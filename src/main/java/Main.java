import Engine.Window;
import org.lwjgl.opengl.GL;

import static org.lwjgl.glfw.GLFW.glfwPollEvents;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL20C.glDisableVertexAttribArray;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL30.*;


public class Main {
    private Window window = new Window(800, 800,"Hello World");
    public void init(){
        window.init();
        GL.createCapabilities();
        //code
    }

    public void loop(){
        while(window.isOpen()){
            window.update();
            glClearColor(0.0f,0.0f,0.0f,0.0f);
            GL.createCapabilities();
            //Code

            //Restore state
            glDisableVertexAttribArray(0);
            //Poll for windows events
            //The key callback above will only be invokes during this call.
            glfwPollEvents();

            //ketik main
        }
    }
    public void run(){
        init();
        loop();
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }
    public static void main(String[]args){
        new Main().run();
    }
}

