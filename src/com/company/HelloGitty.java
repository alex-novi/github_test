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

    public String tale(){
        return tale(HelloGitty.words);
    }

    public String tale(String[] strings){
        return tale(strings, 0);
    }

    public String tale(String[] strings, int n){
        if (n == strings.length) return "";
        else return strings[n] + tale(strings, n + 1);
    }
}
