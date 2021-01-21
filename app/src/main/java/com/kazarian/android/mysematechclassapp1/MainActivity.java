package com.kazarian.android.mysematechclassapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txttitle = findViewById(R.id.txtTitle);
        Button btnsave = findViewById(R.id.btnSave);
        TextView txthtml = findViewById(R.id.txtHtml);
        TextView txthtml2 = findViewById(R.id.txtHtml2);
        ImageView imgpicture = findViewById(R.id.imgPicture);

        txttitle.setText("pouya");
        btnsave.setText("save!");



        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "item saved", Toast.LENGTH_SHORT).show();
            }
        });

        txthtml.setText(HtmlCompat.fromHtml("<h2>Title</h2><br><p>Description here</p>", HtmlCompat.FROM_HTML_MODE_COMPACT));
        txthtml2.setText(HtmlCompat.fromHtml("<h2>Title2</h2><br><p>Description here</p>", HtmlCompat.FROM_HTML_MODE_COMPACT));
    }
}