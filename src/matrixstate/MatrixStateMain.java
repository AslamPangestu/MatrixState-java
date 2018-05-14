/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixstate;

/**
 *
 * @author mvryan
 */
public class MatrixStateMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatrixContext context = new MatrixContext();
        context.turnDown();
        context.turnRight();
        context.turnUp();
        context.turnLeft();
    }
    
}
