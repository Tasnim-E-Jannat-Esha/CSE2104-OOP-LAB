package com.mycompany.movie;
public class Movie {

  private String title,genre,leadActor,director;
  private int releaseYear;
  private double rating;

  public Movie(String title, String genre, String leadActor, String director, int releaseYear, double rating) {
    this.title = title;
    this.genre = genre;
    this.leadActor = leadActor;
    this.director = director;
    this.releaseYear = releaseYear;
    this.rating = rating;
  }

  public String getReview() {
    return rating < 5 ? "Not Good" : "Good";
  }

  public void displayInfo() {
    System.out.println("Title: " + title);
    System.out.println("Genre: " + genre);
    System.out.println("Lead Actor: " + leadActor);
    System.out.println("Director: " + director);
    System.out.println("Release Year: " + releaseYear);
    System.out.println("Rating: " + rating);
    System.out.println("Review: " + getReview());
  }

  public static void main(String[] args) {
    Movie movie1 = new Movie("The Room", "Comedy", "Tommy Wiseau", "Tommy Wiseau", 2003, 3.5);
    Movie movie2 = new Movie("Inception", "Sci-Fi", "Leonardo DiCaprio", "Christopher Nolan", 2010, 8.8);

    movie1.displayInfo();
    System.out.println("\n"); // Add a newline for better formatting
    movie2.displayInfo();
  }
}