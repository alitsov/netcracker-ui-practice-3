package com.edu_netcracker.nn.adlitsov.ui.shared;

import java.util.Date;
import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private String authorName;
    private int pagesCount;
    private int year;
    private Date addDate;

    public Book() {
    }

    public Book(int id, String title, String authorName, int pagesCount, int year, Date addDate) {

        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.pagesCount = pagesCount;
        this.year = year;
        this.addDate = addDate;
    }

    public Book(String title, String authorName, int pagesCount, int year) {

        this.title = title;
        this.authorName = authorName;
        this.pagesCount = pagesCount;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return title + ", " + authorName + " , " + year + " год, " + pagesCount + " страниц";
    }
}
