package css.mrauzi.favoritecontacts;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button btn1Call, btn1Text, btn2Call, btn2Text, btn3Call, btn3Text;
    TextView tvPhone1, tvPhone2, tvPhone3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButtonClickEvents();
    }

    private void setupButtonClickEvents() {

        /**
         * Set up button click listener for calling first contact
         */
        tvPhone1 = (TextView)findViewById(R.id.textViewPhone1Display);
        btn1Call = (Button) findViewById(R.id.button1Call);
        btn1Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + tvPhone1.getText()));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        /**
         * Set button click listener for texting first contact
         */
        btn1Text = (Button) findViewById(R.id.button1Text);
        btn1Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:" + tvPhone1.getText()));
                sendIntent.putExtra("sms_body", "Hi");
                if (sendIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(sendIntent);
                }
            }
        });

        /**
         * Set up button click listener for calling second contact
         */
        tvPhone2 = (TextView)findViewById(R.id.textViewPhone2Display);
        btn2Call = (Button) findViewById(R.id.button2Call);
        btn2Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + tvPhone2.getText()));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        /**
         * Set button click listener for texting second contact
         */
        btn2Text = (Button) findViewById(R.id.button2Text);
        btn2Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:" + tvPhone2.getText()));
                sendIntent.putExtra("sms_body", "Hi");
                if (sendIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(sendIntent);
                }
            }
        });

        /**
         * Set up button click listener for calling third contact
         */
        tvPhone3 = (TextView)findViewById(R.id.textViewPhone3Display);
        btn3Call = (Button) findViewById(R.id.button3Call);
        btn3Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + tvPhone3.getText()));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        /**
         * Set button click listener for texting third contact
         */
        btn3Text = (Button) findViewById(R.id.button3Text);
        btn3Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:" + tvPhone3.getText()));
                sendIntent.putExtra("sms_body", "Hi");
                if (sendIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(sendIntent);
                }
            }
        });

        }
    }

