package Assignment1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

        public void main(String [] args){
            // Opretter et MediaPlayer objekt til at styre playlisten
            MediaPlayer mediaPlayer = new MediaPlayer();

            // Printer en overskrift til playlisten
            System.out.println("***************** PLAYLIST *****************");

            // Opretter to sange, to podcasts og to lydbøger og tilføjer dem til playlisten
            mediaPlayer.add(new Song("Nightmare", "John John", 3000));
            mediaPlayer.add(new Podcast("Breakup", "Sara", 1560));
            mediaPlayer.add(new Audiobook("Dune", "Mads", 25720));
            mediaPlayer.add(new Song("Comfortably", "Lukas Graham", 350));
            mediaPlayer.add(new Podcast("Marriage", "Hans Olsen", 2519));
            mediaPlayer.add(new Audiobook("Java", "Unknown", 15720));

            // Afspiller alle elementer i playlisten
            mediaPlayer.playAll();

            // Printer den samlede spilletid for alle elementer
            mediaPlayer.printTotalDuration();
        }
    }
