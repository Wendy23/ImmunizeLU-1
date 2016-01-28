package immunizelu.bb.com.immunizelu_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private static ImageButton btn_records;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickRecordListener();
    }
    public void OnClickRecordListener(){
        btn_records = (ImageButton)findViewById(R.id.records);
        btn_records.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("immunizelu.bb.com.immunizelu_1.My_Record");
                        startActivity(intent);
                    }
                }
        );
    }
}
