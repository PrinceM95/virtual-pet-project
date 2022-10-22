import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    VirtualPet underTest = new VirtualPet ("Henry",50,50,50);

        @Test
        public void hungerShouldHaveDefaultAttributeValueOf1() {
            int actualNutrition = underTest.getNutrition();
            assertEquals(50, actualNutrition);
        }

        @Test
        public void boredomShouldHaveDefaultAttributeValueOf1() {
            int actualExcitement = underTest.getHappiness();
            assertEquals(50, actualExcitement);
        }

        @Test
        public void tirednessShouldHaveDefaultAttributeValueOf1() {
            int actualEnergy = underTest.getEnergy();
            assertEquals(50, actualEnergy);
        }

        @Test
        public void horsesNameByDefaultIsHenry() {
            String actualName = underTest.getName();
            assertEquals("Henry", actualName);

            }
        }


