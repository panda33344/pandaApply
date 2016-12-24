package jp.gihyo.toolbox;

import java.util.ArrayList;

public class HelloWorld {
/**
 * @param args
 */
	public static void main(String[] args){
		System.out.println("Hello World");
		ArrayList<String> list = new ArrayList<String>();
		list.add("こんにちは、世界。");
		list.add("Hallo Welt");
		list.add("Bonjour tout le monde");

		for(String message: list) {
			System.out.println(message);
		}
	}
}