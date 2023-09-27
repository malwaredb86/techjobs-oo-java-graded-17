package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }


    @Test
    public void testJobConstructorSetsAllFields(){
        Job jobExample = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

       assertEquals("Product Tester", jobExample.getName());
       assertEquals("ACME", jobExample.getEmployer().toString());
       assertEquals("Desert", jobExample.getLocation().toString());
       assertEquals("Quality control", jobExample.getPositionType().toString());
       assertEquals("Persistence", jobExample.getCoreCompetency().toString());

        assertTrue(jobExample.getName() instanceof String);
        assertTrue(jobExample.getEmployer() instanceof Employer);
        assertTrue(jobExample.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(jobExample.getLocation() instanceof Location);
        assertTrue(jobExample.getPositionType() instanceof PositionType);
    }

    @Test
    public void testJobsForEquality(){
        Job jobA = new Job();
        Job jobB = new Job();
        assertFalse(jobA.getId() == jobB.getId());
    }
    //TODO: Create your unit tests here
}
