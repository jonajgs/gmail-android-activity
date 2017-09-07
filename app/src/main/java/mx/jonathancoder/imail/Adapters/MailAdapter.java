package mx.jonathancoder.imail.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import mx.jonathancoder.imail.Listeners.OnMailClickListener;
import mx.jonathancoder.imail.Models.Mail;
import mx.jonathancoder.imail.R;

public class MailAdapter extends RecyclerView.Adapter<MailAdapter.ViewHolder> {

    private List<Mail> mails;
    private int layout;
    private OnMailClickListener listener;

    public MailAdapter(List<Mail> mails, int layout, OnMailClickListener listener) {
        this.mails = mails;
        this.layout = layout;
        this.listener = listener;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);

        // context = parent.getContext();

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(mails.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return mails.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewPerson;
        public TextView textViewSubject;
        public TextView textViewMessage;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewPerson = (TextView)itemView.findViewById(R.id.TextViewSenderId);
            textViewSubject = (TextView)itemView.findViewById(R.id.TextViewSubjectId);
            textViewMessage = (TextView)itemView.findViewById(R.id.TextViewMessageId);
        }

        public void bind(final Mail mail, final OnMailClickListener listener) {
            // set each mail
            textViewPerson.setText(mail.getFromName().substring(0, 1));
            textViewSubject.setText(mail.getSubject());
            textViewMessage.setText(mail.getMessage());

            textViewPerson.getBackground().setColorFilter(Color.parseColor("#" + mail.getColor()), PorterDuff.Mode.SRC);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onPressOne(mail);
                }
            });
        }
    }
}
