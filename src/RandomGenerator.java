package logicsim;

import java.awt.*;
import javax.swing.*;

/**
 * Title:        LogicSim
 * Description:  digital logic circuit simulator
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author Andreas Tetzl
 * @version 1.0
 */

public class  RandomGenerator extends Gate{
  static final long serialVersionUID = -1481430783926923439L;

  transient boolean on = false;
  transient boolean rand = false;

  public RandomGenerator() {
    super();
    imagename="randomgenerator";
   // loadImage();
  }
  public RandomGenerator(Wire w1) {
    super(w1);
  }

  public int getNumInput() {
    return 1;
  }
  public int getNumOutput() {
    return 1;
  }

  public void simulate() {
    if (!on && (getInput(0)!=null) && getInputState(0)) {
      on = true;
      rand = (Math.random() >= 0.5);
    }
    if ((getInput(0)!=null && !getInputState(0))) {
      on = false;
    }
    out[0] = rand;
  }
}
