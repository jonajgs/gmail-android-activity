package mx.jonathancoder.imail.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import mx.jonathancoder.imail.Models.Mail;
import mx.jonathancoder.imail.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

    private TextView textViewToMe;
    private TextView textViewPerson;
    private TextView textViewCc;
    private TextView textViewSubject;
    private TextView textViewMessage;
    private CardView cardViewWrapper;


    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        cardViewWrapper = (CardView) view.findViewById(R.id.CardViewDetailId);
        textViewToMe = (TextView) view.findViewById(R.id.TextViewToDetailId);
        textViewPerson = (TextView) view.findViewById(R.id.TextViewPersonDetailId);
        textViewCc = (TextView) view.findViewById(R.id.TextViewCcDetailId);
        textViewSubject = (TextView) view.findViewById(R.id.TextViewSubjectDetailId);
        textViewMessage = (TextView) view.findViewById(R.id.TextViewMessageDetailId);

        return view;
    }

    public void renderMail(Mail mail) {
        String to = "To: me";
        String person = "from: " + mail.getFromName() + ": <" + mail.getFromEmail() + ">";
        String cc = "cc:" + mail.getCc();
        String subject = "subject: " + mail.getSubject();
        String message = mail.getMessage();

        cardViewWrapper.setVisibility(View.VISIBLE);
        textViewToMe.setText(to);
        textViewPerson.setText(person);
        textViewCc.setText(cc);
        textViewSubject.setText(subject);
        textViewMessage.setText(message);
    }

}
