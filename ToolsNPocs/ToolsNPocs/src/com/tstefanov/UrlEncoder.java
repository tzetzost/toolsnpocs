package com.tstefanov;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Scanner;

public class UrlEncoder {

	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner scn = new Scanner(System.in);
		System.out.print("URL encode text: ");
		scn.useDelimiter("\\r?\\n");
		String input = scn.next();
		System.out.println("Encoded text: " + URLEncoder.encode(input, "UTF-8"));
		scn.close();
	}

}
