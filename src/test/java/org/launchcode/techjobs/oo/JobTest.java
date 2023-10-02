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

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job jobExample = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String str = "ID: " + jobExample.getId() + "\nName: " + jobExample.getName() + "\nEmployer: " + jobExample.getEmployer() + "\nLocation: " + jobExample.getLocation() + "\nPosition Type: " + jobExample.getPositionType() + "\nCore Competency: " + jobExample.getCoreCompetency();
        String jobString = jobExample.toString();
        String newLine = System.lineSeparator();
        assertTrue(jobString.startsWith(newLine));
        assertTrue(jobString.endsWith(newLine));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job jobExample = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = "\nID: " + 1 + "\nName: " + "Product Tester" + "\nEmployer: " + "ACME" + "\nLocation: " + "Desert" + "\nPosition Type: " + "Quality control"+ "\nCore Competency: " + "Persistence";
        assertEquals(expected, jobExample.toString());
    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job jobExample = new Job( null, new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = "\nID: " + 1 + "\nName: " + "Data not available" + "\nEmployer: " + "ACME" + "\nLocation: " + "Desert" + "\nPosition Type: " + "Quality control"+ "\nCore Competency: " + "Persistence";
        assertEquals(expected, jobExample.toString());
    }
  //  @Test
   // public void testToStringHandlesOnlyIDSet() {
     //   Job jobExample = new Job();
     //   String expected = "OOPS! This job does not seem to exist.";
      //  assertEquals(expected, jobExample.toString());
  //  }
    //TODO: Create your unit tests here
}
