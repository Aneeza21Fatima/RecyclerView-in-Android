package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactViewRecycleAdapter extends RecyclerView.Adapter<ContactViewRecycleAdapter.ViewHolder>{
    ArrayList<Contact> contacts = new ArrayList<>();
    public ContactViewRecycleAdapter(){

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (contacts != null && position >= 0 && position < contacts.size()) {
            // Get the Contact object at the specified position
            Contact contact = contacts.get(position);

            // Check if the TextView is not null
            if (holder.txtname != null) {
                // Set the text on the TextView
                holder.txtname.setText(contacts.get(position).getName());
                holder.txtemail.setText(contacts.get(position).getEmail());
                holder.img.setImageResource(contact.getImageResourceId());


            }
        }
    }


    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtname, txtemail;

        ImageView img;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtname = itemView.findViewById(R.id.text);
            txtemail = itemView.findViewById(R.id.text2);
            img = itemView.findViewById(R.id.imgview);
        }
    }
}
