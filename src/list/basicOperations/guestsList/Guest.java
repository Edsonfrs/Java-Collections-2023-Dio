package list.basicOperations.guestsList;

import java.util.Objects;

public class Guest {
    private String name;
    private int invitationCode;

    public Guest(String name, int invitationCode) {
        this.name = name;
        this.invitationCode = invitationCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(int invitationCode) {
        this.invitationCode = invitationCode;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", invitationCode='" + invitationCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest guest)) return false;
        return getInvitationCode() == guest.getInvitationCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInvitationCode());
    }
}
