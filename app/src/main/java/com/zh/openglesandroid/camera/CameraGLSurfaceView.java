package com.zh.openglesandroid.camera;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class CameraGLSurfaceView extends GLSurfaceView implements GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener {


    public CameraGLSurfaceView(Context context) {
        super(context);
        //设置了GL ES版本
        setEGLContextClientVersion(2);
        //Set the Renderer for drawing on the GLSurfaceView
        setRenderer(this);
        /*
         * GLSurfaceView.RENDERMODE_CONTINUOUSLY  不停渲染
         * GLSurfaceView.RENDERMODE_WHEN_DIRTY    懒惰渲染需要手动调用glSurfeaceView.requestRender() 才会进行更新
         * Set the RenderMode
         */
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }


    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {

    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {

    }

    @Override
    public void onDrawFrame(GL10 gl) {

    }

    @Override
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {

    }

}
