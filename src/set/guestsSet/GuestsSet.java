package set.guestsSet;

import java.util.HashSet;
import java.util.Set;

public class GuestsSet {

    private Set<Guest> setGuest;

    public GuestsSet() {
        this.setGuest = new HashSet<>();
    }

    public void addGuest(String name, int invitationCode) {
        setGuest.add(new Guest(name, invitationCode));
    }

    public void removeGuest(int invitationCode) {
        Guest guestToRemove = null;
        for (Guest g : setGuest) {
            if (g.getInvitationCode() == invitationCode){
                guestToRemove = g;
                break;
            }
        }
        setGuest.remove(guestToRemove);
    }

    public int countGuests() {
        return setGuest.size();
    }

    public void showGuestSet() {
        System.out.println(setGuest);
    }

    public static void main(String[] args) {
        GuestsSet guestsSet = new GuestsSet();

        System.out.println("NO OPERATION: They exist " + guestsSet.countGuests() + " guest(s) inside the Guest Set.");

        guestsSet.addGuest("Randolph", 128450 );
        guestsSet.addGuest("Mary", 128452 );
        guestsSet.addGuest("Bram", 128454 );
        guestsSet.addGuest("Phillipe", 128455 );
        guestsSet.addGuest("Pickman", 128459 );
        guestsSet.addGuest("Alucard", 128457 );
        guestsSet.addGuest("Integra", 128451 );
        guestsSet.addGuest("Carmila", 128453 );
        guestsSet.addGuest("Lenora", 128456 );
        guestsSet.addGuest("Seras", 128458 );
        guestsSet.addGuest("Impostor", 128455 );

        System.out.println("ADD OPERATION: They exist " + guestsSet.countGuests() + " guest(s) inside the Guest Set.");

        guestsSet.removeGuest(128459);

        //guestsSet.showGuestSet();


        System.out.println("POST ALL OPERATIONS: They exist " + guestsSet.countGuests() + " guest(s) inside the Guest Set.");




    }


}
