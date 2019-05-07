package com.zh.openglesandroid;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MyGLRenderer implements GLSurfaceView.Renderer {
    Triangle triangle;

    /**
     * 在Surface被创建时回调，用来配置 View 的 OpenGL ES 环境，只会被回调一次；
     *
     * @param gl
     * @param config
     */
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        //设置清空屏幕用的颜色
      GLES20.glClearColor(0, 0, 0, 1);
        triangle = new Triangle();

    }

    /**
     * 在每次Surface尺寸变化时回调，例如当设备的屏幕方向发生改变时
     *
     * @param gl
     * @param width
     * @param height
     */
    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {

        GLES20.glViewport(0, 0, width, height);
    }

    /**
     * 在绘制每一帧的时候回调
     *
     * @param gl
     */
    @Override
    public void onDrawFrame(GL10 gl) {
        //清空屏幕
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
        triangle.draw();
    }

    /**
     * @param type       着色器的类型，包含两个顶点着色器（GLES20.GL_VERTEX_SHADER）和片元着色器（GLES20.GL_FRAGMENT_SHADER）
     * @param shaderCode 定义好的两个着色器代码段
     * @return
     */
    public static int loadShader(int type, String shaderCode) {
        int shader = GLES20.glCreateShader(type);//创建对应的着色器对象；
        GLES20.glShaderSource(shader, shaderCode);//传入着色器对象和字符串shaderCode定义的源代码，将二者关联起来
        GLES20.glCompileShader(shader);//传入着色器对象，对其进行编译
        return shader;
    }
}
