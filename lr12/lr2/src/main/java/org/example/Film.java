package org.example;

import java.util.List;

public class Film {
    private int id;
    private String title;
    private String genre;
    private int rating;
    private List<Integer> criticScores;

    public Film(int id, String title, String genre, int rating, List<Integer> criticScores) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.criticScores = criticScores;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    public List<Integer> getCriticScores() { return criticScores; }
    public void setCriticScores(List<Integer> criticScores) { this.criticScores = criticScores; }

    public double getAverageScore() {
        if (criticScores == null || criticScores.isEmpty()) return 0.0;
        else {
            double sum = 0;
            for (int i = 0; i < criticScores.size(); i++) {
                sum = sum + criticScores.get(i);
            }
            double average = sum / criticScores.size();
            return average;
        }
    }

    @Override
    public String toString() {
        return "Film id=" + id + ", title='" + title + "', genre='" + genre +
                "', rating=" + rating +
                ", avgScore=" + String.format("%.2f", getAverageScore());
    }
}