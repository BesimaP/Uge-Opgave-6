package Assignment3;

    public class SP1 {
        // Song  → har getTitle()       – returnerer en String der beskriver den
        // Venue → har getName()        – returnerer en String der beskriver den
        // Event → har getDescription() – returnerer en String der beskriver den

        //  Alle tre klasser har altså en metode, der returnerer
        //  en tekstbeskrivelse af objektet. Det er præcis, hvad
        //  der indikerer at et interface er relevant.

        //I Main.java kalder jeg nøjagtig de SAMME metoder
        //  på band1 og band2, én ad gangen:

        //    band1.printProfile();
        //    band2.printProfile();

        //    band1.checkStatus();
        //    band2.checkStatus();

        //    band1.addXP(2000);
        //    band2.addXP(1500);

        //    band1.fameSystem();
        //    band2.fameSystem();

        //    band1.randomEvent();
        //    band2.randomEvent();

        //  Dette er et klassisk tegn på at man KAN bruge polymorfi.
        //  I stedet for at gentage koden for hvert band, kunne man
        //  samle dem i en ArrayList og loope over dem:

        //    ArrayList<Band> bands = new ArrayList<>();
        //    bands.add(band1);
        //    bands.add(band2);

        //    // Udskriv profiler for ALLE bands – uanset hvor mange der er
        //    for (Band band : bands) {
        //        band.printProfile();
        //    }

        //    // Status check for alle
        //    for (Band band : bands) {
        //        band.checkStatus();
        //    }

        //    // Random event for alle
        //    for (Band band : bands) {
        //        band.randomEvent();
        //    }

        //  Fordelen: Hvis man tilføjer et band3 eller band4, skal man
        //  kun tilføje det til listen — resten af koden passer sig selv.



        // Hvad er fordelen ved at PaintJob arbejder med ArrayList<Shape> frem for fx ArrayList<Rectangle>?
        // PaintJob behøver ikke vide om det er en Rectangle, Circle eller Triangle — den kalder bare getArea() på alle former. Hvis man later tilføjer en ny form, fx Triangle, virker PaintJob stadig uden ændringer.

        //Hvornår ville det give mening at gøre MediaItem abstrakt?
        // Det ville give mening at gøre MediaItem abstrakt fordi man aldrig har brug for et "rent" MediaItem — man vil altid have en Song, Podcast eller Audiobook. Abstract sikrer at ingen kan oprette et objekt direkte af MediaItem.

        //Hvad er forskellen på et interface og en abstrakt klasse — og hvornår vælger du hvad?

        //Interface:
        //Man kan implementere flere interfaces
        //Ingen felter (kun konstanter)
        //Bruges når klasser deler en kontrakt (hvad de kan gøre)
        //Fx: Song og Podcast kan begge være Playable

        //Abstrakt klasse:
        //Man kan kun arve fra én
        //Kan have felter og færdig kode
        //Bruges når klasser deler fælles kode (hvad de er)
        //Fx: Song, Podcast og Audiobook deler alle title og durationSeconds

        //Hvornår vælger du hvad?
        //Brug interface når du vil definere hvad en klasse kan. Brug abstrakt klasse når du vil dele fælles kode mellem beslægtede klasser.
    }
