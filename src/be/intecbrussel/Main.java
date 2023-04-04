package be.intecbrussel;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        HashSet<Patient> volgordus = new HashSet<Patient>(getAllPatients());

        Queue<Patient> ff = new LinkedList<>(sortOnTempAgeEnsured(volgordus));

        // Priorities

        ff.forEach(System.out::println);


        // Map

        Map<Integer, List<Patient>> mapitus = new HashMap<>();
        mapitus.put(1, new ArrayList<Patient>());
        mapitus.put(2, new ArrayList<Patient>());
        mapitus.put(3, new ArrayList<Patient>());
        mapitus.put(4, new ArrayList<Patient>());

        for (Patient patient : ff) {

            if (((patient.getAge() >= 65 && patient.getTemperature() >= 38) || patient.getTemperature() >= 40) && patient.isUnknownVirus()) {
                mapitus.get(1).add(patient);
            } else if (patient.getTemperature() >= 38 && patient.isUnknownVirus()) {
                mapitus.get(2).add(patient);
            } else if (patient.getTemperature() < 38 && patient.isUnknownVirus()) {
                mapitus.get(3).add(patient);
            } else {
                mapitus.get(4).add(patient);
            }
        }

        mapitus.forEach((k,v) -> System.out.println(k.intValue() + " " + v));
    }


    private static Collection<Patient> sortOnTempAgeEnsured(Set<Patient> patients){

        List<Patient> nl = new ArrayList<>();

        nl.addAll(patients);

        Collections.sort(nl, Comparator.comparing(Patient::getTemperature).thenComparing(Patient::getAge).thenComparing(Patient::isEnsured).reversed());

        return nl;
    }


    public static List<Patient> getAllPatients(){
        List <Patient> allPatients = new ArrayList<>();
        Patient donaldPutin = new Patient("110201321", "Donald Putin", 90, 39, false, true);
        allPatients.add(new Patient("030201321", "Lucky Luke", 69, 38, true, false));
        allPatients.add(new Patient("030201322", "Stromae Papaoutai", 35, 40, false, true));
        allPatients.add(new Patient("030801321", "GringoireLune", 80, 36, true, true));
        allPatients.add(new Patient("687201321", "Crazy Frog", 5, 39, false, false));
        allPatients.add(new Patient("030244321", "Sanic the HedgeHog", 16, 37, true, true));
        allPatients.add(new Patient("110201321", "Donald Putin", 90, 39, false, true));
        allPatients.add(new Patient("110201321", "Donald Putin", 90, 39, false, true));
        allPatients.add(new Patient("088201321", "Bilbo Baggins", 23, 39, true, false));
        allPatients.add(new Patient("035501321", "Lucio Correa Dos Santos", 40, 38, false, true));
        allPatients.add(new Patient("030206621", "Doctor Who", 33, 35, true, true));
        allPatients.add(new Patient("030245321", "Luke Cage", 46, 41, true, false));
        allPatients.add(new Patient("030298321", "Naruto Uzumaki", 13, 38, false, false));
        allPatients.add(new Patient("125201321", "Billy Batson", 15, 40, true, false));
        allPatients.add(new Patient("987201321", "Joseph Joestar", 75, 36, true, false));
        allPatients.add(new Patient("645201321", "Jon Snow", 33, 35, false, false));
        allPatients.add(new Patient("368201321", "Prince Charming", 95, 37, true, true));
        allPatients.add(new Patient("582201321", "Alexander Hamilton", 65, 38, false, false));
        allPatients.add(new Patient("687201321", "Crazy Frog", 5, 39, false, false));
        allPatients.add(new Patient("030201231", "Zelda of Hyrule", 17, 38, false, true));
        allPatients.add(new Patient("830208651", "Mother Theresa", 98, 39, true, false));
        allPatients.add(new Patient("030209741", "Willy Wonka", 70, 40, true, true));
        allPatients.add(new Patient("030205411", "Scrooge McDuck", 73, 38, true, false));
        allPatients.add(new Patient("368201321", "Prince Charming", 95, 37, true, true));
        allPatients.add(new Patient("030209861", "Sonia Magnlia", 35, 39, false, false));
        allPatients.add(new Patient("030278921", "Peter Parker", 21, 40, true, false));
        allPatients.add(new Patient("030269821", "Bruce Wayne", 46, 35, false, true));
        allPatients.add(new Patient("030215421", "Seto Kaiba", 22, 38, false, true));
        allPatients.add(new Patient("030296321", "Mario Mario", 50, 37, false, false));
        allPatients.add(new Patient("035051321", "Harry Potter", 18, 39, true, true));
        allPatients.add(new Patient("368201321", "Prince Charming", 95, 37, true, true));
        allPatients.add(new Patient("036781321", "Mary Poppins", 38, 38, true, false));
        allPatients.add(new Patient("033691321", "Alexander the Great", 51, 37, false, true));
        allPatients.add(new Patient("687201321", "Crazy Frog", 5, 39, false, false));
        allPatients.add(new Patient("030201000", "Huey Freeman", 12, 40, false, false));
        allPatients.add(new Patient("000201321", "Miku Hatsune", 16, 36, true, true));
        allPatients.add(new Patient("111201321", "Drake Josh", 33, 38, true, false));
        allPatients.add(new Patient("222201321", "April O'Neil", 29, 37, false, false));
        return allPatients;}
}