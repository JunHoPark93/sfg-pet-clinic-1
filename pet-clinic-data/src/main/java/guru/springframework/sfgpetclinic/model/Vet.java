package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by jt on 7/13/18.
 */
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialitties() {
        return specialities;
    }

    public void setSpecialitties(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
