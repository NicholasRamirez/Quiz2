import java.util.*;
import java.lang.Cloneable;

public class BookShallowCopy implements java.lang.Cloneable {
   private String title;
   private String author;
   private List<String> chapters;

   public BookShallowCopy(String title, String author, List<String> chapters) {
        this.title = title;
        this.author = author;
        this.chapters = chapters;
   }

   public String getTitle() {
        return title;
   }

   public void setTitle(String title) {
        this.title = title;
   }

   public String getAuthor() {
        return author;
   }

   public void setAuthor(String author) {
        this.author = author;
   }

   public List<String> getChapters() {
        return chapters;
   }

   public void setChapters(List<String> chapters) {
        this.chapters = chapters;
   }

   @Override
   public BookShallowCopy clone() {
        try {
            return (BookShallowCopy) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new AssertionError();
        }
   }

   @Override
   public String toString() {
        return "Book Title: " + title + ", Author: " + author + ", Chapters: " + chapters;
   }
}
