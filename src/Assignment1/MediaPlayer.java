package Assignment1;

import java.util.ArrayList;

    public class MediaPlayer {
        private ArrayList<Playable> playlist = new ArrayList<Playable>();

        // Tilføjer et element til playlisten
        public void add(Playable item){
            playlist.add(item);
        }

        // Afspiller alle elementer i playlisten
        public void playAll(){
            for(Playable item : playlist){
            item.play();
            }
        }

        // Returnerer den samlede varighed i sekunder
        public int getTotalDuration(){
            int total = 0;
            for(Playable item : playlist){
                total+= item.getDurationSeconds();
            }
            return total;
        }

        // Printer den samlede varighed i timer, minutter og sekunder
        public void printTotalDuration(){
            int total = getTotalDuration();
            int hours = total / 3600;
            int minutes = (total % 3600) / 60;
            int seconds = total % 60;

            System.out.println("Samlet spilletid: " + String.format("%d:%02d:%02d", hours, minutes, seconds));
        }


        // Printer alle elementer i playlisten
        public void printPlaylist(){
            for (Playable item : playlist){
                System.out.println("Titel: " + item.getTitle() + ". " + "Seconds: " + item.getDurationSeconds());
            }
        }
    }
