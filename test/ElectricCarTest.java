import static org.junit.jupiter.api.Assertions.*;

class ElectricCarTest {
    ElectricCar ec = new ElectricCar("ER67873","Audi", "A1",3,100,300);
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void getRegistrationFee() {
        assertEquals(4000,ec.getRegistrationFee());
    }
}