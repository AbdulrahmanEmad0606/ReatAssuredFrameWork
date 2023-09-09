package Models;

import java.util.Date;

public class BooksData {
    public Root root;
    public class Root{
        public int id;
        public String title;
        public String description;
        public int pageCount;
        public String excerpt;
        public Date publishDate;
    }

}
