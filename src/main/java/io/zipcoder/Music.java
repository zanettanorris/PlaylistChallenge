package io.zipcoder;

import java.util.Arrays;

public class Music {

    private String[] playList;



    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
       Integer steps = 0;
        Integer startSongIndex = Arrays.asList(playList).indexOf(startIndex)+1;
        Integer chosenSongIndex = Arrays.asList(playList).indexOf(selection)-1;
        if (chosenSongIndex > startSongIndex){
            steps = chosenSongIndex - startSongIndex;}
        else if (chosenSongIndex < startSongIndex){
            steps = startSongIndex - chosenSongIndex;}

return steps;
    }
}

