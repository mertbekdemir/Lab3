
/**
 * Write a description of class Main here.
 *
 * @author Monika Szucs
 * @version September 23, 2018
 * 
 * This is the Main class.
 */
public class Main
{
    /**
     * The main entry to the planets information.
     * 
     * 8 new objects created for the solar system.
     * 
     */
    public static void main(String[] args){
        Planet p1 = new Planet("Mercury", false, 0.4, 0.055);
        Planet p2 = new Planet("Venus", false, 0.7, 0.815);
        Planet p3 = new Planet("Earth", false, 1.0, 1.0);
        Planet p4 = new Planet("Mars",false, 1.5, 1.07);
        Planet p5 = new Planet("Jupiter", false, 5.2, 318.0);
        Planet p6 = new Planet("Saturn",false, 9.5, 95.0);
        Planet p7 = new Planet("Uranus",false, 19.2, 14.0);
        Planet p8 = new Planet("Neptune",false, 30.1, 17.0);
        
        
        boolean s1 = p1.isSimilarToEarth();
        String planetData1 = p1.getPlanetaryData();
        
        boolean s2 = p2.isSimilarToEarth();
        String planetData2 = p2.getPlanetaryData();
       
        boolean s3 = p3.isSimilarToEarth();
        String planetData3 = p3.getPlanetaryData();
        
        boolean s4 = p4.isSimilarToEarth();
        String planetData4 = p4.getPlanetaryData();
        
        boolean s5 = p5.isSimilarToEarth();
        String planetData5 = p5.getPlanetaryData();
        
        boolean s6 = p6.isSimilarToEarth();
        String planetData6 = p6.getPlanetaryData();
        
        boolean s7 = p7.isSimilarToEarth();
        String planetData7 = p7.getPlanetaryData();
        
        boolean s8 = p8.isSimilarToEarth();
        String planetData8 = p8.getPlanetaryData();
        
        System.out.println(planetData1);
        System.out.println(planetData2);
        System.out.println(planetData3);
        System.out.println(planetData4);
        System.out.println(planetData5);
        System.out.println(planetData6);
        System.out.println(planetData7);
        System.out.println(planetData8);
        
    }
}
