import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PsychiatricTest
{
    boolean sane = true;
    boolean insane = false;

    @Mock
    Psychiatrist dr_feelgood = mock(Psychiatrist.class);

    @Test
    public void evaluateSanePerson()
    {
        Patient patient = new Patient();
        patient.name = "Aaron";
        patient.sanity = sane;

        Psychiatrist dr_jones = new Psychiatrist();

        boolean diagnosis = dr_jones.diagnose(patient);
        assertEquals(patient.sanity, diagnosis);
    }

    @Test
    public void evaluateInsanePerson()
    {
        Patient patient = new Patient();
        patient.name = "Armond";
        patient.sanity = insane;

        Psychiatrist dr_pepper = new Psychiatrist();
        boolean diagnosis = dr_pepper.diagnose(patient);
    }

    @Test
    public void evaluateSanePersonWithGoodMockPsych()
    {
        Patient patient = new Patient();
        patient.name = "Aaron";
        patient.sanity = sane;

        when(dr_feelgood.diagnose(patient)).thenReturn(true);

        boolean diagnosis = dr_feelgood.diagnose(patient);
        assertEquals(patient.sanity, diagnosis);
    }

    @Test
    public void evaluateSanePersonWithBadMockPsych()
    {
        Patient patient = new Patient();
        patient.name = "Aaron";
        patient.sanity = sane;

        Psychiatrist dr_feelbad = mock(Psychiatrist.class);
        when(dr_feelbad.diagnose(patient)).thenReturn(false);

        boolean diagnosis = dr_feelbad.diagnose(patient);
        assertEquals(patient.sanity, diagnosis); // should fail, he's a quack
    }
}
