package com.simple.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

/**
 * {@link ItemReader} with hard-coded input data.
 */

@Component("reader")
public class ExampleItemReader implements ItemReader<String> {

	private String[] input = {"Hello world!", "Hello world !!", "hello world"};

	private int index = 0;

	/**
	 * Reads next record from input
	 */
	public String read() throws Exception {
		if (index < input.length) {
			return input[index++];
		}
		else {
			return null;
		}

	}

}
