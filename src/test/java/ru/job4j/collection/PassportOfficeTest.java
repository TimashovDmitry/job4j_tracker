package ru.job4j.collection;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenTestAddMethod1() {
        Citizen citizenOne = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizenTwo = new Citizen("2f44a", "Petr Ivanov");
        PassportOffice office = new PassportOffice();
        office.add(citizenOne);
        boolean result = office.add(citizenTwo);
        assertThat(office.get(citizenOne.getPassport())).isEqualTo(citizenOne);
        AssertionsForClassTypes.assertThat(result).isFalse();
    }
}