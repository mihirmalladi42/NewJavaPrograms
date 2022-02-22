import java.util.Scanner;
public class TicTacToe {
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    public TicTacToe (char[][] xAndO) {
        Scanner player1 = new Scanner(System.in);
        System.out.println();
        System.out.println("What position does player 1 (X) want to mark? (a1 for top left, a2 for top middle, a3 for top right, b1 for middle left, etc.) (If the game is a draw, type a1, a2, a3, b1, b2, b3, c1, c2, or c3): ");
        String res1 = player1.nextLine();
        if (res1.equalsIgnoreCase("a1")) {
            if (xAndO[0][0] == 'X' || xAndO[0][0] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO);
                }
            } else {
                xAndO[0][0] = 'X';
            }
        } else if (res1.equalsIgnoreCase("a2")) {
            if (xAndO[0][1] == 'X' || xAndO[0][1] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO);
                }
            } else {
                xAndO[0][1] = 'X';
            }
        } else if (res1.equalsIgnoreCase("a3")) {
            if (xAndO[0][2] == 'X' || xAndO[0][2] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO);
                }
            } else {
                xAndO[0][2] = 'X';
            }
        } else if (res1.equalsIgnoreCase("b1")) {
            if (xAndO[1][0] == 'X' || xAndO[1][0] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO);
                }
            } else {
                xAndO[1][0] = 'X';
            }
        } else if (res1.equalsIgnoreCase("b2")) {
            if (xAndO[1][1] == 'X' || xAndO[1][1] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO);
                }
            } else {
                xAndO[1][1] = 'X';
            }
        } else if (res1.equalsIgnoreCase("b3")) {
            if (xAndO[1][2] == 'X' || xAndO[1][2] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO);
                }
            } else {
                xAndO[1][2] = 'X';
            }
        } else if (res1.equalsIgnoreCase("c1")) {
            if (xAndO[2][0] == 'X' || xAndO[2][0] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO);
                }
            } else {
                xAndO[2][0] = 'X';
            }
        } else if (res1.equalsIgnoreCase("c2")) {
            if (xAndO[2][1] == 'X' || xAndO[2][1] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO);
                }
            } else {
                xAndO[2][1] = 'X';
            }
        } else if (res1.equalsIgnoreCase("c3")) {
            if (xAndO[2][2] == 'X' || xAndO[2][2] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO);
                }
            } else {
                xAndO[2][2] = 'X';
            }
        } else {
            System.out.println(RED + "Please enter a correct response." + RESET);
            TicTacToe redo = new TicTacToe(xAndO);
        }
        System.out.print(xAndO[0][0] + "|");
        System.out.print(xAndO[0][1] + "|");
        System.out.println(xAndO[0][2]);
        System.out.println("-+-+-");
        System.out.print(xAndO[1][0] + "|");
        System.out.print(xAndO[1][1] + "|");
        System.out.println(xAndO[1][2]);
        System.out.println("-+-+-");
        System.out.print(xAndO[2][0] + "|");
        System.out.print(xAndO[2][1] + "|");
        System.out.println(xAndO[2][2]);
        System.out.println();
    } 
    public TicTacToe(char[][] xAndO, int diffConstructor) {
        Scanner player2 = new Scanner(System.in);
        System.out.println();
        System.out.println("What position does player 2 (O) want to mark? (a1 for top left, a2 for top middle, a3 for top right, b1 for middle left, etc.) (If the game is a draw, type a1, a2, a3, b1, b2, b3, c1, c2, or c3): ");
        String res2 = player2.nextLine();
        if (res2.equalsIgnoreCase("a1")) {
            if (xAndO[0][0] == 'X' || xAndO[0][0] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO, 5);
                }
            } else {
                xAndO[0][0] = 'O';
            }
        } else if (res2.equalsIgnoreCase("a2")) {
            if (xAndO[0][1] == 'X' || xAndO[0][1] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO, 5);
                }
            } else {
                xAndO[0][1] = 'O';
            }
        } else if (res2.equalsIgnoreCase("a3")) {
            if (xAndO[0][2] == 'X' || xAndO[0][2] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO, 5);
                }
            } else {
                xAndO[0][2] = 'O';
            }
        } else if (res2.equalsIgnoreCase("b1")) {
            if (xAndO[1][0] == 'X' || xAndO[1][0] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO, 5);
                }
            } else {
                xAndO[1][0] = 'O';
            }
        } else if (res2.equalsIgnoreCase("b2")) {
            if (xAndO[1][1] == 'X' || xAndO[1][1] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO, 5);
                }
            } else {
                xAndO[1][1] = 'O';
            }
        } else if (res2.equalsIgnoreCase("b3")) {
            if (xAndO[1][2] == 'X' || xAndO[1][2] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO, 5);
                }
            } else {
                xAndO[1][2] = 'O';
            }
        } else if (res2.equalsIgnoreCase("c1")) {
            if (xAndO[2][0] == 'X' || xAndO[2][0] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO, 5);
                }
            } else {
                xAndO[2][0] = 'O';
            }
        } else if (res2.equalsIgnoreCase("c2")) {
            if (xAndO[2][1] == 'X' || xAndO[2][1] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO, 5);
                }
            } else {
                xAndO[2][1] = 'O';
            }
        } else if (res2.equalsIgnoreCase("c3")) {
            if (xAndO[2][2] == 'X' || xAndO[2][2] == 'O') {
                if (xAndO[0][0] != ' ' && xAndO[0][1] != ' ' && xAndO[0][2] != ' ' && xAndO[1][0] != ' ' && xAndO[1][1] != ' ' && xAndO[1][2] != ' ' && xAndO[2][0] != ' ' && xAndO[2][1] != ' ' && xAndO[2][2] != ' ') {
                    System.out.println(RED + "Draw! IGNORE EVERYTHING ELSE" + RESET);
                } else {
                    System.out.println("That place is occupied.");
                    TicTacToe a1 = new TicTacToe(xAndO, 5);
                }
            } else {
                xAndO[2][2] = 'O';
            }
        } else {
            System.out.println(RED + "Please enter a correct response." + RESET);
            TicTacToe redo = new TicTacToe(xAndO, 5);
        }
        System.out.print(xAndO[0][0] + "|");
        System.out.print(xAndO[0][1] + "|");
        System.out.println(xAndO[0][2]);
        System.out.println("-+-+-");
        System.out.print(xAndO[1][0] + "|");
        System.out.print(xAndO[1][1] + "|");
        System.out.println(xAndO[1][2]);
        System.out.println("-+-+-");
        System.out.print(xAndO[2][0] + "|");
        System.out.print(xAndO[2][1] + "|");
        System.out.println(xAndO[2][2]);
        System.out.println();
    }
    public static void main(String[] args) {
        char[][] xAndO = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        for (int turns = 1; turns <= 5; turns++) {
            if (xAndO[0][0] == 'X' && xAndO[0][1] == 'X' && xAndO[0][2] == 'X') {
                System.out.println();
                System.out.println("Player 1 wins!");
                break;
            } else if (xAndO[1][0] == 'X' && xAndO[1][1] == 'X' && xAndO[1][2] == 'X') {
                System.out.println();
                System.out.println("Player 1 wins!");
                break;
            } else if (xAndO[2][0] == 'X' && xAndO[2][1] == 'X' && xAndO[2][2] == 'X') {
                System.out.println();
                System.out.println("Player 1 wins!");
                break;
            } else if (xAndO[0][0] == 'X' && xAndO[1][0] == 'X' && xAndO[2][0] == 'X') {
                System.out.println();
                System.out.println("Player 1 wins!");
                break;
            } else if (xAndO[0][1] == 'X' && xAndO[1][1] == 'X' && xAndO[2][1] == 'X') {
                System.out.println();
                System.out.println("Player 1 wins!");
                break;
            } else if (xAndO[0][2] == 'X' && xAndO[1][2] == 'X' && xAndO[2][2] == 'X') {
                System.out.println();
                System.out.println("Player 1 wins!");
                break;
            } else if (xAndO[0][0] == 'X' && xAndO[1][1] == 'X' && xAndO[2][2] == 'X') {
                System.out.println();
                System.out.println("Player 1 wins!");
                break;
            } else if (xAndO[0][2] == 'X' && xAndO[1][1] == 'X' && xAndO[2][0] == 'X') {
                System.out.println();
                System.out.println("Player 1 wins!");
                break;
            } else if (xAndO[0][0] == 'O' && xAndO[0][1] == 'O' && xAndO[0][2] == 'O') {
                System.out.println();
                System.out.println("Player 2 wins!");
                break;
            } else if (xAndO[1][0] == 'O' && xAndO[1][1] == 'O' && xAndO[1][2] == 'O') {
                System.out.println();
                System.out.println("Player 2 wins!");
                break;
            } else if (xAndO[2][0] == 'O' && xAndO[2][1] == 'O' && xAndO[2][2] == 'O') {
                System.out.println();
                System.out.println("Player 2 wins!");
                break;
            } else if (xAndO[0][0] == 'O' && xAndO[1][0] == 'O' && xAndO[2][0] == 'O') {
                System.out.println();
                System.out.println("Player 2 wins!");
                break;
            } else if (xAndO[0][1] == 'O' && xAndO[1][1] == 'O' && xAndO[2][1] == 'O') {
                System.out.println();
                System.out.println("Player 2 wins!");
                break;
            } else if (xAndO[0][2] == 'O' && xAndO[1][2] == 'O' && xAndO[2][2] == 'O') {
                System.out.println();
                System.out.println("Player 2 wins!");
                break;
            } else if (xAndO[0][0] == 'O' && xAndO[1][1] == 'O' && xAndO[2][2] == 'O') {
                System.out.println();
                System.out.println("Player 2 wins!");
                break;
            } else if (xAndO[0][2] == 'O' && xAndO[1][1] == 'O' && xAndO[2][0] == 'O') {
                System.out.println();
                System.out.println("Player 2 wins!");
                break;
            }
                TicTacToe player1 = new TicTacToe(xAndO);
                TicTacToe player2 = new TicTacToe(xAndO, 4);
        }
    }
}
//320 lines of code for tic tac toe imagine chess lol
