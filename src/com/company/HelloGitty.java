package com.company;

public class HelloGitty {
    static String[] words = {"Is ", "this ", "tail ", "recursion?"};
    public String purr;

    public HelloGitty(){
        purr = "Gittygittygitty";
    }

    public String scratch(){
        return "Gittens got glaws.";
    }

    public String tale(String[] strings, int n){
        if (n == 4) return "";
        else return strings[n] + tale(strings, n + 1);
    }
}
