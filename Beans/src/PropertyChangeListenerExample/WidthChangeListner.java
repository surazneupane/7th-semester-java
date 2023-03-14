package PropertyChangeListenerExample;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class WidthChangeListner implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Width changed from " + evt.getOldValue() + " to " + evt.getNewValue());
    }
}
