
/**
 * Write a description of class Planet here.
 *
 * @author Monika Szucs
 * @version September 23, 2018
 * 
 * This is the Planet class.
 * 
 */
public class Planet
{
    // instance variables
    private String name;
    private boolean innerPlanet;
    private double astronomicalUnitsFromSun;
    private double earthMasses;

    /**
     * Constructor for objects of class Planet.
     * 
     * @param theName is the name of the Planet.
     * @param theInnerPlanet is to check if the planet is less than 1AU or weighs less than 15 Earth masses it is set to inner planet in the sentence.
     * @param theAstronomicalUnitsFromSun is the AU units for each planet to know how far it is from the sun.
     * @param theEarthMasses is to measure how much the planet weighs.
     * 
     */
    public Planet(String theName, boolean theInnerPlanet, double theAstronomicalUnitsFromSun, double theEarthMasses){
        
        if(theName !=null){
            name = theName;
        }
        else {
            throw new IllegalArgumentException("Title cannot be null");
        }

        innerPlanet = theInnerPlanet;

        if(theAstronomicalUnitsFromSun > 0.0){
            astronomicalUnitsFromSun = theAstronomicalUnitsFromSun;
        }
        else {
            throw new IllegalArgumentException("The Astronomical Units cannot be less than 0.0");
        }

        if(theEarthMasses > 0.0){
            earthMasses = theEarthMasses;
        }
        else {
            throw new IllegalArgumentException("The Earth Masses cannot be less than 0.0");
        }
    }

    /**
     * @return the name of the planet.
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    /**
     * @return if it is a inner or outer planet.
     */
    public boolean getInnerPlanet(){
        return innerPlanet;
    }

    /**
     * @return the number of astronomical unites a planet is away from the sun.
     */
    public double getAstronomicalUnitsFromSun(){
        return astronomicalUnitsFromSun;
    }

    /**
     * @return the weight of the planet in Earth masses.
     */
    public double getEarthMasses(){
        return earthMasses;
    }
    
    /**
     * @return weather the number of astronomical units a planet is less than 1.0 or earth masses is less than 15.0.
     */
    public Boolean isSimilarToEarth(){
        if((astronomicalUnitsFromSun <= 1.0)||(earthMasses <= 15.0)){
            return innerPlanet=true;
        }
        else {
            return innerPlanet=false;
        }
    }
    
    /**
     * @return the information gathered into one String to pass to the Main class.
     */
    public String getPlanetaryData(){
        if(innerPlanet==true){
            return name + " is an inner planet, weighs " + earthMasses + " Earth masses, and is " + astronomicalUnitsFromSun + " AU from the sun. " + name + " is similar to earth.";
        }
        else{
            return name + " is an outer planet, weighs " + earthMasses + " Earth masses, and is " + astronomicalUnitsFromSun + " AU from the sun. " + name + " is not similar to earth.";
        }
    }

}
