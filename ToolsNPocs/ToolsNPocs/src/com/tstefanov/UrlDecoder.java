package com.tstefanov;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Scanner;

public class UrlDecoder {

	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner scn = new Scanner(System.in);
		System.out.print("URL decode text: ");
		scn.useDelimiter("\\r?\\n");
		String input = scn.next();
		System.out.println("Decoded text: " + URLDecoder.decode(input, "UTF-8"));
		scn.close();
	}

}
