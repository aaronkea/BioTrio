package dk.kea.dat18i.team8.biotrio.demo;

import java.time.LocalDate;
//import java.time.LocalDateTime;

public class Movie {
    private int id;
    private String title;
    private String genre;
    private int duration;
    private String director;
    private String format;
    private LocalDate startDate;
    private LocalDate endDate;
    private int theater_id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title=title;
    }

    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre=genre;
    }

    public int getDuration(){return duration;}
    public void setDuration(int duration) {this.duration=duration;}

    public String getDirector(){return director;}
    public void setDirector(String director){this.director=director;}

    public String getFormat(){return format;}
    public void setFormat(String format){this.format=format;}

    public void setStartDate(LocalDate startDate){this.startDate=startDate;}
    public LocalDate getStartDate(){return startDate;}

    public void setEndDate(LocalDate endDate){this.endDate=endDate;}
    public LocalDate getEndDate(){return endDate;}

    public int getTheater_id(){return theater_id;}
    public void setTheater_id(int theater_id){this.theater_id=theater_id;}


}
