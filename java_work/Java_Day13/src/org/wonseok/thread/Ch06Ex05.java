package org.wonseok.thread;

public class Ch06Ex05 {
	public static void main(String[] args) {
		StringBuffer strbf = new StringBuffer("Korea");
		
		strbf.append(" Japan");
		strbf.append(" China");
		System.out.println(strbf);
		
		System.out.println(strbf.charAt(6));
		System.out.println(strbf.substring(5, strbf.indexOf("C")));
		System.out.println(strbf.reverse());
		
		strbf.reverse();
		strbf.delete(5, strbf.indexOf("C"));
		System.out.println(strbf);
		strbf.deleteCharAt(6);
		System.out.println(strbf);
		
	}
}
