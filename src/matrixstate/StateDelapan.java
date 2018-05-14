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
public class StateDelapan implements State{

    @Override
    public void down(MatrixContext context) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void up(MatrixContext context) {
        context.setState(new StateLima());
        System.out.println("On position 5");
    }

    @Override
    public void left(MatrixContext context) {
        context.setState(new StateTujuh());
        System.out.println("On position 7");
    }

    @Override
    public void right(MatrixContext context) {
        context.setState(new StateSembilan());
        System.out.println("On position 9");
    }
    
}
