package view;

import processing.core.*;
import toBeCompleted.ArrayService;

import java.util.Arrays;

public class Graph extends PApplet {

	int[] data1 = {10, 20, 70, 90, 98};
	int[] data2 = {100, 50, 50, 20, 0};
	int[] data3 = null;
	int[] data;

	final int MARGIN = 50;

	public void setup() {
		/* size commented out by preprocessor */;
		background(255);
		data3 = randomArray(1+(int)((Math.random()*10)), 1, 100);
	}
	
	/**
	 * 
	 * @param n (assume n is greater than zero)
	 * @param low
	 * @param high (assume high is greater than or equal to low)
	 * @return a randomized array containing n items,
	 * such that each item is between low and high
	 * (inclusive on both sides) 
	 */
	public int[] randomArray(int n, int low, int high) {
		int[] result = new int[n];
		for(int i=0; i < result.length; i++) {
			result[i] = (int)(low + (Math.random() * (high - low + 1)));
		}
		return result;
	}

	public void draw() {
		background(255);
		stroke(0);
		strokeWeight(2);
		line(MARGIN, height - MARGIN, width - MARGIN, height - MARGIN);
		line(MARGIN, height - MARGIN, MARGIN, MARGIN);
		noStroke();
		fill(0);
		triangle(width - MARGIN, height - MARGIN * 1.2f, width - MARGIN,
				height - MARGIN * 0.8f, width - MARGIN * 0.6f, height - MARGIN);
		triangle(MARGIN, MARGIN * 0.6f, MARGIN * 0.8f, MARGIN, MARGIN * 1.2f,
				MARGIN);
		// paint(data1, 'o');
		data = data3;
		paint(data);
	}

	public void paint(int[] data) {
		float gapX = (width - 2 * MARGIN) / (data.length + 1.0f);
		float gapY = (height - 4 * MARGIN) / (max(data) + 1.0f);
		strokeWeight(10);
		stroke(255, 0, 0, 127);
		point(MARGIN, (float) (height - MARGIN - gapY * ArrayService.average(data)));
		fill(0);
		textSize(24);
		textAlign(LEFT, CENTER);
		text("Average\n" + ((int) (ArrayService.average(data) * 100)) / 100.0f,
				MARGIN * 1.1f,
				(float) (height - MARGIN - gapY * ArrayService.average(data)));
		for (int i = 0; i < data.length; i++) {
			if (i < data.length - 1) {
				strokeWeight(1);
				stroke(200, 50, 50);
				if(i >= ArrayService.longestAscendingSequenceStart(data)) {
					if(i < ArrayService.longestAscendingSequenceStart(data) + ArrayService.longestAscendingSequenceLength(data) - 1) {
						strokeWeight(4);
						stroke(0, 100, 0);
						
					}
				}
				line(MARGIN + gapX * (i + 1), height - MARGIN - gapY * data[i],
						MARGIN + gapX * (i + 2),
						height - MARGIN - gapY * data[i + 1]);
				
				noStroke();
				fill(0);
				circle(MARGIN + gapX * (i + 1), height - MARGIN - gapY * data[i], 5); 
			}
		}
		for (int i = 0; i < data.length; i++) {
			if (ArrayService.isAscending(data) && !ArrayService.isDescending(data)) {
				fill(0, 0, 255);
			} else if (!ArrayService.isAscending(data) && ArrayService.isDescending(data)) {
				fill(255, 0, 0);
			} else if (ArrayService.isAscending(data) && ArrayService.isDescending(data)) {
				fill(0, 255, 0);
			} else {
				fill(0);
			}
			String prefix = "";
			if (ArrayService.max(data) == data[i] && ArrayService.indexOf(data, data[i]) == i) {
				prefix = prefix + "Highest\n";
			}
			if (ArrayService.min(data) == data[i] && ArrayService.indexOf(data, data[i]) == i) {
				prefix = prefix + "Lowest\n";
			}
			if (ArrayService.countOccurrences(data, data[i]) > 0 &&
				ArrayService.countOccurrences(data, data[i]) == ArrayService.countOccurrences(data,
					ArrayService.mostCommonItem(data)) && 
				ArrayService.indexOf(data, data[i]) == i) {
				prefix = prefix + "Most Common Item\n";
			}
			if (ArrayService.median(data) == data[i] && ArrayService.indexOf(data, data[i]) == i) {
				prefix = prefix + "Median\n";
			}
			textSize(24);
			textAlign(CENTER, CENTER);
			text(prefix + data[i], MARGIN + gapX * (i + 1),
					height - MARGIN - gapY * data[i]);
		}
	}

	public void mousePressed() {
		System.out.println(Arrays.toString(data));
	}
	
	public void keyPressed() {
		data3 = randomArray(1+(int)((Math.random()*10)), 1, 100);
	}

	public void settings() {
		size(1200, 800);
	}

	public static void main(String[] args) {
		PApplet.main("view.Graph"); 
	}
}
