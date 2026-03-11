package Assignment1;

    public class Song extends MediaItem implements Playable{
        private String artist;

        public Song(String title, String artist, int durationSeconds) {
            super(title, durationSeconds);
            this.artist = artist;
        }

        // Printer sagens titel og varighed
        @Override
        public void play() {
            int total = getDurationSeconds();
            int hours = total /3600;
            int minutes = (total % 3600) / 60;
            int seconds = total % 60;

            System.out.println("♪ Afspiller: " + "\"" + getTitle() + "\"" + " af " + artist + " (" + String.format("%d:%02d:%02d", hours, minutes, seconds) + ")");
        }

        //Returnerer varighed i sekunder fra superklassen
        @Override
        public int getDurationSeconds() {
            return super.getDurationSeconds();
        }
    }

