package mx.jonathancoder.imail.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import mx.jonathancoder.imail.Fragments.DetailFragment;
import mx.jonathancoder.imail.Models.Mail;
import mx.jonathancoder.imail.R;

public class DetailActivity extends AppCompatActivity {

    private String subject;
    private String message;
    private String fromName;
    private String fromEmail;
    private String cc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null) {
            Mail mail = new Mail
                    (
                            bundle.getString("subject"),
                            bundle.getString("message"),
                            bundle.getString("fromEmail"),
                            bundle.getString("fromName"),
                            bundle.getString("cc")
                    );
            DetailFragment detailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.FragmentDetailId);
            detailFragment.renderMail(mail);
        }


    }
}
