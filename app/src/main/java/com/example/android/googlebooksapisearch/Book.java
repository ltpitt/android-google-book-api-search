package com.example.android.googlebooksapisearch;

/**
 * {@link Book} represents a single quake.
 * Each object has 3 properties: thumbnail, city and date.
 */
public class Book {

    /** Title of the book */
    private String mTitle;

    /** Author of the book */
    private String mAuthor;

    /** Website URL of the book */
    private String mUrl;

    /** Date of the book */
    private String mDate;

    /**
     * Constructs a new {@link Book} object.
     *
     * @param title is the book's title
     * @param author is the book's author
     * @param date is the book's date
     * @param url is the website URL to find more details about the book
     */
    public Book(String title, String author, String date, String url)
    {
        mTitle = title;
        mAuthor = author;
        mDate = date;
        mUrl = url;
    }

    // Returns the book's title
    public String getTitle() { return mTitle; }

    // Returns the book's author
    public String getAuthor() {
        return mAuthor;
    }

    // Returns the book's date
    public String getDate() {
        return mDate;
    }

    // Returns the website URL to find more information about the book.
    public String getUrl() { return mUrl; }

}
