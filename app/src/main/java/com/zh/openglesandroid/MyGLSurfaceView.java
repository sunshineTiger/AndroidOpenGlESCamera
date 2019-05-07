package com.zh.openglesandroid;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MyGLSurfaceView extends GLSurfaceView {

    private MyGLRenderer myGLRenderer;

    public MyGLSurfaceView(Context context) {
        super(context);
        //设置了GL ES版本
        setEGLContextClientVersion(2);
        myGLRenderer = new MyGLRenderer();
        //Set the Renderer for drawing on the GLSurfaceView
        setRenderer(myGLRenderer);
        /*
         * GLSurfaceView.RENDERMODE_CONTINUOUSLY  不停渲染
         * GLSurfaceView.RENDERMODE_WHEN_DIRTY    懒惰渲染需要手动调用glSurfeaceView.requestRender() 才会进行更新
         * Set the RenderMode
         */
        //setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
        setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
    }
}
