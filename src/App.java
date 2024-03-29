import player.Player;

import java.util.*;
//import triple.Triple;
import board.Board;
import game.Game;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Player p1 = new Player("Pooja", 19);
        System.out.println("Player name: " + p1.getPlayerName());

        Board b = new Board(9);
        b.setInitialBoardConfig(0, 0, 3);
        b.setInitialBoardConfig(0, 2, 6);
        b.setInitialBoardConfig(0, 3, 5);
        b.setInitialBoardConfig(0, 5, 8);
        b.setInitialBoardConfig(0, 6, 4);

        List<Integer> col = new ArrayList<>();
        List<Integer> val = new ArrayList<>();

        col.add(0);
        col.add(1);

        val.add(5);
        val.add(2);

        b.setBoardbyEntireRow(1, col, val);

        b.setInitialBoardConfig(2, 1, 8);
        b.setInitialBoardConfig(2, 2, 7);
        b.setInitialBoardConfig(2, 7, 3);
        b.setInitialBoardConfig(2, 8, 1);
        b.setInitialBoardConfig(3, 2, 3);
        b.setInitialBoardConfig(3, 4, 1);
        b.setInitialBoardConfig(3, 7, 8);
        b.setInitialBoardConfig(4, 0, 9);
        b.setInitialBoardConfig(4, 3, 8);
        b.setInitialBoardConfig(4, 4, 6);
        b.setInitialBoardConfig(4, 5, 3);
        b.setInitialBoardConfig(4, 8, 5);
        b.setInitialBoardConfig(5, 1, 5);
        b.setInitialBoardConfig(5, 4, 9);
        b.setInitialBoardConfig(5, 6, 6);
        b.setInitialBoardConfig(6, 0, 1);
        b.setInitialBoardConfig(6, 1, 3);
        b.setInitialBoardConfig(6, 6, 2);
        b.setInitialBoardConfig(6, 7, 5);
        b.setInitialBoardConfig(7, 7, 7);
        b.setInitialBoardConfig(7, 8, 4);
        b.setInitialBoardConfig(8, 2, 5);
        b.setInitialBoardConfig(8, 3, 2);
        b.setInitialBoardConfig(8, 5, 6);
        b.setInitialBoardConfig(8, 6, 3);

        b.printBoard();

        Game game = new Game(b, p1);
        game.play();
    }
}
