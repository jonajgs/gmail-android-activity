package mx.jonathancoder.imail.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import mx.jonathancoder.imail.Fragments.DetailFragment;
import mx.jonathancoder.imail.Listeners.OnMailClickListener;
import mx.jonathancoder.imail.Models.Mail;
import mx.jonathancoder.imail.R;

public class MainActivity extends AppCompatActivity implements OnMailClickListener {

    private boolean showBothFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkDevice();
    }

    private void checkDevice() {
        showBothFragments = (getSupportFragmentManager().findFragmentById(R.id.FragmentDetailId) != null);
    }

    @Override
    public void onPressOne(Mail mail) {
        if(!showBothFragments) {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("subject", mail.getSubject());
            intent.putExtra("message", mail.getMessage());
            intent.putExtra("fromEmail", mail.getFromEmail());
            intent.putExtra("fromName", mail.getFromName());
            intent.putExtra("cc", mail.getCc());

            startActivity(intent);
        } else {
            DetailFragment detailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.FragmentDetailId);
            detailFragment.renderMail(mail);
        }
    }
}
