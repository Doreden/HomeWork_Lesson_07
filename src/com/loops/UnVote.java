package com.loops;

import java.util.Scanner;

public class UnVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Favor = 0;
        int Against = 0;
        int Abstain = 0;
        boolean vetoDropped = true;

        int i;
        System.out.println("Welcome to the UN elections!" + " " + " Vote By This Options:\nfavor/ against / abstain / veto:");
        for(i = 1; i<11; i++) {
            System.out.println("country #" + i + "please state your vote:");
            String vote = scanner.nextLine();
            if (vote.equals("veto")) {
                vetoDropped = false;
                break;
            }else if (vote.equals("favor")) {
                Favor++;
            }else if (vote.equals("against")) {
                Against++;
            }else if (vote.equals("abstain")) {
                Abstain++;
            }else {
                System.out.println("Vote Invalid!");
                i--;
            }
        }
        if (vetoDropped) {
            System.out.println("The vote results are as followed:\nIn favor:\n" + Favor + "\nAgainst:\n" + Against + "\nAbstained:\n" + Abstain);
        } else System.out.println("country#" + i + " has dropped veto! vote is over!");
        }








    }
