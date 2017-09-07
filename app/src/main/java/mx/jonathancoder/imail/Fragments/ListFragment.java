package mx.jonathancoder.imail.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import mx.jonathancoder.imail.Activities.MainActivity;
import mx.jonathancoder.imail.Adapters.MailAdapter;
import mx.jonathancoder.imail.Listeners.OnMailClickListener;
import mx.jonathancoder.imail.Models.Mail;
import mx.jonathancoder.imail.R;
import mx.jonathancoder.imail.Utils.Util;

public class ListFragment extends Fragment {

    private List<Mail> mails;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerViewAdapter;

    private OnMailClickListener listener;


    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        mails = Util.getMails();

        recyclerView = (RecyclerView)view.findViewById(R.id.RecyclerViewId);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerViewAdapter = new MailAdapter(mails, R.layout.mail_item, new OnMailClickListener() {
            @Override
            public void onPressOne(Mail mail) {
                listener.onPressOne(mail);
            }
        });

        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setHasFixedSize(true);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(context instanceof OnMailClickListener) {
            listener = (OnMailClickListener)context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnMailClickListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}
