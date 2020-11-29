/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	BASKET (5, "basket", Place.INDOOR),
	VOLLEY (6, "volley", Place.INDOOR),
	TENNIS (1, "tennis", Place.OUTDOOR),
	BIKE (1, "bike", Place.OUTDOOR),
	F1 (1, "Formula 1", Place.OUTDOOR),
	MOTOGP (1, "moto GP", Place.OUTDOOR),
	SOCCER (11, "soccer", Place.OUTDOOR);

    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private int nMember; 
	private final String name;
	private final Place place;
	
	private static final int IS_INDIVIDUAL = 1;
	
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	Sport(final int nMember, final String name, final Place place) {
		this.name = name;
		this.nMember = nMember;
		this.place = place;
	}
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	public boolean isIndividualSport() {
		return nMember == IS_INDIVIDUAL;
	}
	
	public boolean isIndoorSport() {
		return place.equals(Place.INDOOR);
	}
	
	public Place getPlace() {
		return this.place;
	}
	
	public String toString( ) {
		return "[" + "sport: " + name + "place: " + place 
			  + "membersTeam" + nMember + "]"; 
	}
}
