import java.util.ArrayList;
import java.util.List;

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public List<Integer> function(List<Time> timesList) {
        List<Integer> result = new ArrayList<>(); //A

        for (int i = 0; i < timesList.size(); i++) { //B,c,d
            int hr = timesList.get(i).getHours();    //E
            int min = timesList.get(i).getMinutes(); //F
            int sec = timesList.get(i).getSeconds(); //G
            if (hr < 0 || hr > 24){                  //H
                if (hr < 0){                          //I
                    throw new RuntimeException("The hours are smaller than the minimum"); //J
                }
                else { // K
                    throw new RuntimeException("The hours are grater than the maximum"); 
                }
            }
            else if (hr < 24) { //L
                if (min < 0 || min > 59) //M
                    throw new RuntimeException("The minutes are not valid!"); //N
                else {// O
                    if (sec >= 0 && sec <= 59) //P
                        result.add(hr * 3600 + min * 60 + sec); //Q
                    else // R
                        throw new RuntimeException("The seconds are not valid");
                }
            } 
            else if (hr == 24 && min == 0 && sec == 0) { // S
                    result.add(hr * 3600 + min * 60 + sec); //T
            } 
            else {                                       // U
                throw new RuntimeException("The time is greater than the maximum");
            }
        }
        return result;                                   
    }
}