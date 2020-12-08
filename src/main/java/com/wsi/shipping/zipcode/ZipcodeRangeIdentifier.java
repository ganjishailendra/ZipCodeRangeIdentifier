package com.wsi.shipping.zipcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ZipcodeRangeIdentifier {

	public static void main(String args[]) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the number of zipcode ranges : ");
		int zipcodeRangeCount = inputScanner.nextInt();
		
		List<ZipcodeRange> inputZipcodeRanges = new ArrayList<ZipcodeRange>();
		for(int i = 1; i <= zipcodeRangeCount ; i++) {
			ZipcodeRange zipcodeRange = new ZipcodeRange();
			System.out.println("Enter the start value of range " + i + " : ");
			zipcodeRange.setStartValue(inputScanner.nextInt());
			System.out.println("Enter the end value of range " + i + " : ");
			zipcodeRange.setEndValue(inputScanner.nextInt());
			inputZipcodeRanges.add(zipcodeRange);
		}

		RangeProcessor rangeProcessor = new RangeProcessor();
		Collection<ZipcodeRange> processedZipcodeRanges = rangeProcessor.process(inputZipcodeRanges);
		System.out.println(processedZipcodeRanges.toString());
	}
}
