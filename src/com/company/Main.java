package com.company;

public class Main {

    public static void main(String[] args) {
	HelloGitty welcome = new HelloGitty();
        System.out.println("welcome.purr = " + welcome.purr);
        System.out.println(welcome.scratch());
        System.out.println(welcome.tale(HelloGitty.words));
    }
}
