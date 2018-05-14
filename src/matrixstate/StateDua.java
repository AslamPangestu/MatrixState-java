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
public class StateDua implements State {

    @Override
    public void down(MatrixContext context) {
        context.setState(new StateLima());
        System.out.println("On Position 5");
    }

    @Override
    public void up(MatrixContext context) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void left(MatrixContext context) {
        context.setState(new StateSatu());
        System.out.println("On Position 1");
    }

    @Override
    public void right(MatrixContext context) {
        context.setState(new StateTiga());
        System.out.println("On Position 3");
    }

}
