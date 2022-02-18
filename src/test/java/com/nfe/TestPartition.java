package com.nfe;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class TestPartition {

	@Test
	public void partitionDoitRetournerTroisListesCasCinqElementsEtTailleDeux() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<List<Integer>> partions = new Partition().partition(list, 2);
		assertEquals(partions.size(), 3);
	}
	
	
	@Test
	public void partitionDoitRetournerDeuxsListesCasCinqElementsEtTailleTrois() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<List<Integer>> partions = new Partition().partition(list, 3);
		assertEquals(partions.size(), 2);
	}
	
	@Test
	public void partitionDoitRetournerCinqListesCasCinqElementsEtTailleUn() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<List<Integer>> partions = new Partition().partition(list, 1);
		assertEquals(partions.size(), 5);
	}
	
	@Test
	public void partitionDoitRetournerPremiereEtDeuxiemeListeDeTailleDeuxTroissiemeListeDeTailleUnCasCinqElementsEtTaille2() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<List<Integer>> partions = new Partition().partition(list, 2);
		assertEquals(partions.get(0).size(), 2);
		assertEquals(partions.get(1).size(), 2);
		assertEquals(partions.get(2).size(), 1);
	}
	
	@Test
	public void verificationExactitudePremiereListeCasCinqElementsEtTaille2() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<List<Integer>> partions = new Partition().partition(list, 2);
		
		List<Integer> premiereListe = partions.get(0);
		
		assertEquals(premiereListe.get(0).intValue(), 1);
		assertEquals(premiereListe.get(1).intValue(), 2);
	}
	
	
	@Test
	public void verificationExactitudeDeuxiemeListeCasCinqElementsEtTaille2() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<List<Integer>> partions = new Partition().partition(list, 2);
		
		List<Integer> deuxiemeListe = partions.get(1);
		
		assertEquals(deuxiemeListe.get(0).intValue(), 3);
		assertEquals(deuxiemeListe.get(1).intValue(), 4);
	}
	
	@Test
	public void verificationExactitudeTroisiemeListeCasCinqElementsEtTaille2() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<List<Integer>> partions = new Partition().partition(list, 2);
		
		List<Integer> troisiemeListe = partions.get(2);
		
		assertEquals(troisiemeListe.get(0).intValue(), 5);
	}
	
	
}
