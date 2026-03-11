package Assignment1;

    public class Audiobook extends MediaItem implements Playable {
        private String author;

        public Audiobook(String title, String author, int durationSeconds){
            super(title,durationSeconds);
            this.author = author;
        }


        // Printer bogens titel og varighed
        @Override
        public void play() {
            int total = getDurationSeconds();       // returnerer total antal sekunder
            int hours = total /3600;                // vi dividerer med 3600 (60 sekunder × 60 minutter) for at få hele timer
            int minutes = (total % 3600) / 60;      // vi bruger % (rest) for at fjerne timerne, og dividerer med 60 for at få minutter
            int seconds = total % 60;               // vi bruger % for at få de resterende sekunder

            System.out.println("\uD83D\uDCD6 Afspiller lydbog: " + "\"" + getTitle() + "\"" + " af " + author + " (" +String.format("%d:%02d:%02d", hours, minutes, seconds) + ")");
            //%02d sørger for at tal under 10 vises med et foranstillet nul
        }

        //Returnerer varighed i sekunder fra superklassen
        @Override
        public int getDurationSeconds() {
            return super.getDurationSeconds();
        }
    }
