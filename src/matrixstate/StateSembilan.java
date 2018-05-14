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
public class StateSembilan implements State{

    @Override
    public void down(MatrixContext context) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void up(MatrixContext context) {
        context.setState(new StateEnam());
        System.out.println("On Position 6");
    }

    @Override
    public void left(MatrixContext context) {
        context.setState(new StateDelapan());
        System.out.println("On Position 8");
    }

    @Override
    public void right(MatrixContext context) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
