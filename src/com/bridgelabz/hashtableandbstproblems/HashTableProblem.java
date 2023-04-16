package com.bridgelabz.hashtableandbstproblems;

import java.util.*;

public class HashTableProblem {

	public static void main(String[] args) {

		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

		// split the sentence into words
		String[] words = sentence.split(" ");

		Hashtable<String, Integer> table = new Hashtable<>();

		// process each word in the sentence
		for (String word : words) {

			// check if word is already present in the hashtable
			if (table.containsKey(word)) {

				// if word already present then increase the count
				int count = table.get(word);
				table.put(word, count + 1);
			} else {
				// if word is not present in the hashtable, add it to hash table with count 1.
				table.put(word, 1);
			}
		}

		// print the word and its count
		Enumeration<String> keys = table.keys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			int value = table.get(key);
			System.out.println(key + " : " + value);

		}
	}

}
