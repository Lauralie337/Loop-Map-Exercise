package main;

import java.util.*;



public class CarMap {

    public static HashMap<String, String> initCarStock() {
        // You are a car dealer. Create a hash map of vehicles.
        // The model is the Key, the make is the Value.
            HashMap<String, String> availableCars = new HashMap<>();
            availableCars.put("DODGE","Charger");
            availableCars.put("MAZDA","MX3");
            availableCars.put("HONDA","Civic");
            availableCars.put("CHEVROLET","Corvette");
            availableCars.put("FORD","Focus");
            availableCars.put("MAZDA","Miata");
            availableCars.put("FORD","Mustang");
            availableCars.put("TOYOTA","Yaris");
            availableCars.put("NISSAN","Altima");
            availableCars.put("BMW","X3");
            availableCars.put("HYUNDAI","Kona");

            return availableCars;
    }

    public static void customerQuery(HashMap<String, String> stock) {
        // Ask the customer what car (model) they are looking for.
        // Use the Hash Map to determine if you have that vehicle, and what make it is.

        Scanner queryCheck = new Scanner(System.in);
        String model;

        System.out.println("What brand of car did you want?");

        model = queryCheck.next();
        model = model.toUpperCase();

        if (stock.containsKey(model)) {
            String make = stock.get(model);
            System.out.printf("\nAlright, so a %s, not a bad choice " + "Let's see what %s's we have over here!", model, model);
        } else {
            System.out.printf("""
                    Unfortunately, I think I'm fresh out of %s's on the lot. Please try again if you would like to continue searching.
                    """, model);
                    model = queryCheck.next();
        }
    }





















}
