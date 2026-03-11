package Assignment1;

    public class Podcast extends MediaItem implements Playable {
        private String host;

        public Podcast(String title, String host, int durationSeconds){
            super(title, durationSeconds);
            this.host = host;
        }

        // Printer podcastens titel og varighed
        @Override
        public void play() {
            int total = getDurationSeconds();
            int hours = total /3600;
            int minutes = (total % 3600) / 60;
            int seconds = total % 60;

            System.out.println("\uD83C\uDF99 Afspiller podcast: " + "\"" + getTitle() + "\""  + " med " + host + " (" + String.format("%d:%02d:%02d", hours, minutes, seconds) + ")");
        }

        // Returnerer varighed i sekunder fra superklassen
        @Override
        public int getDurationSeconds() {
            return super.getDurationSeconds();
        }
    }
