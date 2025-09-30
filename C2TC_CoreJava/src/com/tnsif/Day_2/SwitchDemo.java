package com.tnsif.Day_2;

public class SwitchDemo {

	public static void main(String[] args) {
		char x='l';
		switch(x)
		{
		case 'l' :
		case 'L' :
			System.out.println(x+" is a letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x+"is a letter");
			break;
		case 's':
		case 'S':
			System.out.println(x+"is a letter");
			break;
		case 'w':
		case 'W':
			System.out.println(x+"is a letter");
			break;
		default:
			System.out.println(x+"is other than letter,digit,space or special symbol");
            break;
		}
	}

}
