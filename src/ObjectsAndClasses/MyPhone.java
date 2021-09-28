package ObjectsAndClasses;

public class MyPhone {
    final private int FRONT_CAMERA = 0;
    final private int BACK_CAMERA = 1;

    public boolean openCamera(int camera){
        if (camera == 0) {
            startCamera(FRONT_CAMERA);
            startCamera(0);

        }
        else if (camera == 1)
            startCamera(BACK_CAMERA);

        return true;
    }

    private void startCamera(int camera){
        // some code
    }
}
