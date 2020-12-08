package com.wsi.shipping.zipcode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ZipcodeRangeIdentifierTest{
	
	List<ZipcodeRange> inputZipcodeRanges = new ArrayList<ZipcodeRange>();
	
	@Before
	public void prepareTestData() {
		ZipcodeRange zipcodeRange1 = new ZipcodeRange();
		zipcodeRange1.setStartValue(94133);
		zipcodeRange1.setEndValue(94133);
		inputZipcodeRanges.add(zipcodeRange1);
		ZipcodeRange zipcodeRange2 = new ZipcodeRange();
		zipcodeRange2.setStartValue(94200);
		zipcodeRange2.setEndValue(94299);
		inputZipcodeRanges.add(zipcodeRange2);
		ZipcodeRange zipcodeRange3 = new ZipcodeRange();
		zipcodeRange3.setStartValue(94226);
		zipcodeRange3.setEndValue(94399);
		inputZipcodeRanges.add(zipcodeRange3);
	}
	
	@Test
	public void testZipcodeRangeIdentifier() {
		RangeProcessor rangeProcessor = new RangeProcessor();
		Collection<ZipcodeRange> processedZipcodeRanges = rangeProcessor.process(inputZipcodeRanges);
		assertEquals(processedZipcodeRanges.toString(), "[[94133,94133], [94200,94399]]");
	}

}
