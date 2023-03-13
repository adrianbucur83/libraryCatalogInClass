package org.example;

public class ArtAlbum extends Book {
    public String paperQuality;

    @Override
    public String toString() {
        return "Art album, name: " + name
                + " number of pages: "
                + numberOfPages + " paper quality: " + paperQuality;
    }

}
