package seminar.androidhardware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HardwareSensorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardware_sensor);
    }

    public void clickToListSensor(View view) {
        Intent intent = new Intent(this, ListSensorActivity.class);
        startActivity(intent);
    }

    public void clickToBarometer(View view) {
        Intent intent = new Intent(this, BarometerSensorActivity.class);
        startActivity(intent);
    }

    public void clickToCompass(View view) {
        Intent intent = new Intent(this, CompassSensorActivity.class);
        startActivity(intent);
    }
}
