package Zadachi;

public class Book {
        String title;
        int yearOfPublication;
        Genre genre;

        public Book(String title, int yearOfPublication, Genre genre) {
            this.title = title;
            this.yearOfPublication = yearOfPublication;
            this.genre = genre;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public int getYearOfPublication() {
            return yearOfPublication;
        }
        public void setYearOfPublication(int yearOfPublication) {
            this.yearOfPublication = yearOfPublication;
        }
        public Genre getGenre() {
            return genre;
        }
        public void setGenre(Genre genre) {
            this.genre = genre;
        }
        public String toString(){
            return "Title: "+ title + ", Year of publication:  " + yearOfPublication + ", Genre : " + genre;
        }
        enum Genre{
            FICTION,
            HORROR,
            ROMANCE,
            DRAMA,
            COMEDY
        }
    }



