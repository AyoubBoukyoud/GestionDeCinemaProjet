package controller;

import model.ShowtimesModel;
import java.util.List;

public class ManageShowtimesController {

    public List<String> getAllMovies() {
        return ShowtimesModel.fetchMovies();
    }

    public List<String> getDatesFor(String film) {
        return ShowtimesModel.fetchDates(film);
    }

    public List<String> getTimesFor(String film, String date) {
        return ShowtimesModel.fetchTimes(film, date);
    }

    public List<String> getHallsFor(String film, String date, String time) {
        return ShowtimesModel.fetchHalls(film, date, time);
    }

public boolean addShowtime(String film,
                           String date,
                           String time,
                           String hall,
                           int availableSeats) {
    return ShowtimesModel.insertShowtime(film, date, time, hall, availableSeats);
}

}
