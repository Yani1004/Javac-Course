public class Kniga {
    private String title; // Заглавие на книгата

    public Kniga(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
