/**
 * Created by Davide Nastri on 11/28/16.
 */
package com.example.android.googlebooksapisearch;

/**
 * {@link Book} represents a single quake.
 * Each object has 3 properties: magnitude, city and date.
 */
public class Book {

    /** Website URL of the book */
    private String mUrl;

    // Book's magnitude (e.g. 7.2, 6.1)
    private Double mMagnitude;

    // Name of the city hit by the quake (e.g. Tokyo, London, Los Angeles)
    private String mLocation;

    // Time of the earthquake in milliseconds
    private long mTimeInMilliseconds;

    /**
     * Constructs a new {@link Book} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Book(Double magnitude, String location, long timeInMilliseconds, String url)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    // Returns the magnitude
    public Double getMagnitude() { return mMagnitude; }

    // Returns the city name
    public String getLocation() {
        return mLocation;
    }

    // Returns the time of the earthquake.
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

     // Returns the website URL to find more information about the earthquake.
    public String getUrl() { return mUrl; }

}
