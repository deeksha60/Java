public class movieRatingClass {
    String title;
    String genre;
    float rating;

    void displayMoviefor(){
        System.out.println("title:"+title);
        System.out.println("genre:"+genre);
        System.out.println("rating:"+rating);
    }

    public static void main(String[] args) {
        movieRatingClass movie1=new movieRatingClass();
        movie1.title="Inception";
        movie1.genre="Sci-Fi";
        movie1.rating=9.0f;
        movie1.displayMoviefor();

        movieRatingClass movie2=new movieRatingClass();
        movie2.title="luca";
        movie2.genre="Animation";
        movie2.rating=9.0f;
        movie2.displayMoviefor();
    }
}
