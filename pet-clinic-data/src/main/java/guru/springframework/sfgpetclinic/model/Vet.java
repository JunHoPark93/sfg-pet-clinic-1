package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by jt on 7/13/18.
 */
public class Vet extends Person {

    private Set<Speciality> specialitties;

    public Set<Speciality> getSpecialitties() {
        return specialitties;
    }

    public void setSpecialitties(Set<Speciality> specialitties) {
        this.specialitties = specialitties;
    }
}
