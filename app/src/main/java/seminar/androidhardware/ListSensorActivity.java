package seminar.androidhardware;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class ListSensorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_sensor);

        TextView txtSensors = findViewById(R.id.txtSensors);

        SensorManager manager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> list = manager.getSensorList(Sensor.TYPE_ALL);

        StringBuilder data = new StringBuilder();
        for (Sensor s: list) {
            data.append("* Name: " + s.getName() + "\n");
            data.append("\t - Vendor: " + s.getVendor() + "\n");
            data.append("\t - Version: " + s.getVersion() + "\n");
        }
        txtSensors.setText(data);
    }


}
