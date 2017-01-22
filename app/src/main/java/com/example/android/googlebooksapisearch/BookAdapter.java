package com.example.android.googlebooksapisearch;
import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

/*
* {@link BookAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Book} objects.
* */
public class BookAdapter extends ArrayAdapter<Book> {

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    private static final String LOG_TAG=BookAdapter.class.getSimpleName();

    /**
     * This is a custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data used
     * to populate the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param books A List of AndroidFlavor objects to display in a list
     */
    public BookAdapter(Activity context, ArrayList<Book> books) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, books);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        Book currentBook = getItem(position);

        // Get the current book title
        String currentBookTitle = currentBook.getTitle();
        // Find the TextView with view book_title
        TextView bookTitleTextView = (TextView) listItemView.findViewById(R.id.book_title);
        // Finally set its text
        bookTitleTextView.setText(currentBookTitle);

        // Get the current book author
        String currentBookAuthor = currentBook.getAuthor();
        // Find the TextView with view book_author
        TextView bookAuthorTextView = (TextView) listItemView.findViewById(R.id.book_author);
        // Finally set its text
        bookAuthorTextView.setText(currentBookAuthor);

        // Create a new Date object from the time in milliseconds of the earthquake
        //Date dateObject = new Date(currentBook.getTimeInMilliseconds());
        // Find the TextView with view ID date
        //TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Format the date string (i.e. "Mar 3, 1984")
        //String formattedDate = formatDate(dateObject);
        // Display the date of the current earthquake in that TextView
        //dateView.setText(formattedDate);

        // Get the current book date
        String currentBookDate = currentBook.getDate();
        // Find the TextView with view book_date
        TextView bookDateTextView = (TextView) listItemView.findViewById(R.id.book_date);
        // Finally set its text
        bookDateTextView.setText(currentBookDate);

        // Get the current book url
        String currentBookUrl = currentBook.getUrl();

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }



}
