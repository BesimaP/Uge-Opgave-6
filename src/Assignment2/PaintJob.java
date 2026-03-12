package Assignment2;

import java.sql.SQLOutput;
import java.util.ArrayList;

        public class PaintJob {
                private String name;
                private ArrayList<Shape>surfaces = new ArrayList<>();
                private ArrayList<Shape>deductions = new ArrayList<>();

                public PaintJob(String name) {
                        this.name = name;
                }

                public void addSurface(Shape s){
                        surfaces.add(s);
                }

                public void addDeduction(Shape s){
                        deductions.add(s);
                }

                public double getTotalSurface(){
                        double total = 0;
                        for(Shape surfaces : surfaces){
                                total += surfaces.getArea();
                        }
                        return total;
                }

                public double getTotalDeduction(){
                        double total = 0;
                        for(Shape deductions : deductions){
                                total += deductions.getArea();
                        }
                      return total;
                }

                public double getPaintableArea(){
                        return getTotalSurface() - getTotalDeduction();
                }

                public void printSummary() {
                        System.out.println("********** Malerberegner: " + name + " **********");

                        System.out.println("Skal males: " + getPaintableArea() + "m²");
                }
        }