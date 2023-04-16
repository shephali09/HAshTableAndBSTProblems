package com.bridgelabz.hashtableandbstproblems;

import java.util.*;

public class HashTableProblem {

	public static void main(String[] args) {
		String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations.";

		// Remove punctuations and convert the paragraph to lowercase
		String cleanParagraph = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase();

		// Split the paragraph into words
		String[] words = cleanParagraph.split(" ");

		// Create a Hashtable to store the word-frequency pairs
		Hashtable<String, Integer> table = new Hashtable<>();

		// Process each word in the paragraph
		for (String word : words) {
			// Check if the word is the word we want to remove
			if (!word.equals("avoidable")) {
				// If the word is not the word we want to remove, check if it is already present
				// in the Hashtable
				if (table.containsKey(word)) {
					// If the word is already present, increment its frequency count
					int count = table.get(word);
					table.put(word, count + 1);
				} else {
					// If the word is not present, add it to the Hashtable with a frequency count of
					// 1
					table.put(word, 1);
				}
			}
		}

		// Print the word and its frequency count
		Enumeration<String> keys = table.keys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			int value = table.get(key);
			System.out.println(key + ": " + value);
		}
	}

}
