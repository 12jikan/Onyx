package com.onyx.renderer;

// import org.lwjgl.*;
// import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.opengl.*;

import com.onyx.App;

// import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

public class Renderer {
    private final Window window;

    public Renderer() {
        window = App.getWindow();
    }

    public void init() throws Exception {

    }

    public void render() {

    }

    public void clear() {
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void cleanup() {
        
    }
}
