package seminar.androidhardware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickToSensor(View view) {
        Intent intent = new Intent(this, HardwareSensorActivity.class);

    public void clickToCamera(View view) {
        Intent intent = new Intent(this, MyCameraActivity.class);
        startActivity(intent);
    }

    public void clickToCameraAPI(View view) {
        Intent intent = new Intent(this, MyCameraAPIActivity.class);
        startActivity(intent);
    }
}
