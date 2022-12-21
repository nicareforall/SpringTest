package ru.appline.logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


    public class CompassModel implements Serializable {

        private static final CompassModel instance = new CompassModel();

        private final Map<String, Compass> cmodel;

        public CompassModel(){
            cmodel = new HashMap<String, Compass>();
        }

        public static CompassModel getInstance() {
            return instance;
        }

        public void add(Compass compass){
            cmodel.put("compass", compass);
        }

        public Map<String, Compass> getFromList(){
            return cmodel;
        }

        public Map<String, String> getSide (int degree){

            Map<String, String> side = new HashMap<String, String>();


            if (degree <= 23){
                side.put("side", "North");
            } else if (degree <68){
                side.put("side", "NorthEast");
            } else if (degree <113){
                side.put("side", "East");
            } else if (degree <158){
                side.put("side", "SouthEast");
            } else if (degree <203){
                side.put("side", "South");
            } else if (degree <248){
                side.put("side", "SouthWest");
            } else if (degree <293){
                side.put("side", "West");
            } else if (degree <338){
                side.put("side", "NorthWest");
            } else if (degree <359){
                side.put("side", "North");
            }

            return side;
        }
    }




