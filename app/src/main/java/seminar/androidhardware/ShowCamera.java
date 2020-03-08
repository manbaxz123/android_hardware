package seminar.androidhardware;

import android.content.Context;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.io.IOException;
import java.io.Serializable;

public class ShowCamera extends SurfaceView implements SurfaceHolder.Callback {
    private SurfaceHolder holdMe;
    private Camera camera;

    public ShowCamera(Context context, Camera camera) {
        super(context);
        this.camera = camera;
        this.holdMe = getHolder();
        this.holdMe.addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        try {
            this.camera.setPreviewDisplay(holder);
            this.camera.startPreview();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
