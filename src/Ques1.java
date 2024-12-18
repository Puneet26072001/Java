import java.util.ArrayList;
import java.util.List;

public class Ques1 {
    String title;
    String Author;
    int ISBN;
    List<Ques1> BookList=new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public void add(Ques1 newBook)
    {
        BookList.add(newBook);
    }
    public void remove(Ques1 newBook)
    {
        BookList.remove(newBook);
    }
}

