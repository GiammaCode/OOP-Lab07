package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.nesting1.SportSocialNetworkUserImpl;
import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        /*
         * [TEST DEFINITION]
         * 
         * By now, you know how to do it
         */
        // TODO
    	final SportSocialNetworkUserImpl<User> dcassani = new SportSocialNetworkUserImpl<> ("davide", "cassani", "dcassani", 53);
    	final SportSocialNetworkUserImpl<User> falonso = new SportSocialNetworkUserImpl<> ("fernando", "alonso", "falonso", 34);
    	final SportSocialNetworkUserImpl<User> becclestone = new SportSocialNetworkUserImpl<> ("bernarde", "ecclestone", "becclestone", 83);
    	
    	 falonso.addSport(SportSocialNetworkUserImpl.F1);
         falonso.addSport(SportSocialNetworkUserImpl.BIKE);
         falonso.addSport(SportSocialNetworkUserImpl.SOCCER);
         System.out.println("Alonso practices F1: " + falonso.hasSport(SportSocialNetworkUserImpl.F1));
         System.out.println("Alonso does not like volley: " + !falonso.hasSport(SportSocialNetworkUserImpl.VOLLEY));
         
         //FUNZIONA SAREBBE DA CONTINUARE IMPL dcassani.addSport()... e becclestone.addSport()...
    }
}
