package com.wsi.shipping.zipcode;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RangeProcessor {

	public Collection<ZipcodeRange> process(List<ZipcodeRange> inputZipcodeRanges) {
		Map<Integer, ZipcodeRange> processedZipcodeRanges = new HashMap<Integer, ZipcodeRange>();
		
		for(ZipcodeRange inputZipcodeRange : inputZipcodeRanges) {
			for(ZipcodeRange otherZipcodeRange : inputZipcodeRanges) {
				if(inputZipcodeRange.getStartValue() > otherZipcodeRange.getStartValue()
						&& inputZipcodeRange.getStartValue() < otherZipcodeRange.getEndValue())
				{
					inputZipcodeRange.setStartValue(otherZipcodeRange.getStartValue());
					if(inputZipcodeRange.getEndValue() <= otherZipcodeRange.getEndValue()) {
						inputZipcodeRange.setEndValue(otherZipcodeRange.getEndValue());
					}
				}
			}
			processedZipcodeRanges.put(inputZipcodeRange.getStartValue(), inputZipcodeRange);
		}
		
		return processedZipcodeRanges.values();
	}
}
