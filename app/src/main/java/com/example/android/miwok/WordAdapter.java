package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by PHYUTHWEHTETHTET on 7/24/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int colorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, R.layout.list_item_view, words);
        this.colorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Check if existing view is being reused, if not inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_view, parent, false);
        }
        //Get the Word item located at the position in the list
        Word currentWord = getItem(position);

        //Get the text view under layout and set text with the currentWord Miwok definition
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        //Get the text view under layout and set text with the currentWord Default definition
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.english_word);
        defaultTextView.setText(currentWord.getDefaultTranslation());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        LinearLayout layoutHolder = (LinearLayout) listItemView.findViewById(R.id.layoutHolderView);
        if (currentWord.isValidImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
        } else {
            imageView.setVisibility(View.GONE);
        }

        layoutHolder.setBackgroundResource(colorResourceId);
        return listItemView;
    }

}
