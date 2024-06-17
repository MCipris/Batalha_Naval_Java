package br.ufrn.imd.model;

/**
 * @author Otávio Augusto
 * @version 1.0
 *
 */

public interface IBoat {
    public int[] shootIn(int x, int y);
    public void destroy();
    public void rotate();

    public void move(int x, int y);
}
