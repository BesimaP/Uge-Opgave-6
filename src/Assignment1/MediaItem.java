package Assignment1;

    public abstract class MediaItem {
        private String title;
        private int durationSeconds;

        // Konstruktør der tager title og durationSeconds som argumenter
        public MediaItem(String title, int durationSeconds){
            this.title = title;
            this.durationSeconds = durationSeconds;
        }

        // Getters så subklasser kan få adgang til de private felter
        public String getTitle() {
            return title;
        }

        public int getDurationSeconds() {
            return durationSeconds;
        }

        // Printer title og varighed på en læsbar måde
        @Override
        public String toString() {
            return "Title: " + title + "." + "Seconds" + durationSeconds;
        }

    }
