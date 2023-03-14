package PropertyChangeListenerExample;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class FaceBean {
    private int mWidth = 90;
    private PropertyChangeSupport mPcs = new PropertyChangeSupport(this);

    public int getWidth() {
        return mWidth;
    }

    public void setWidth(int mw) {
        int oldWidth = mWidth;
        mWidth = mw;
        mPcs.firePropertyChange("width", oldWidth, mw);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {

        mPcs.addPropertyChangeListener(listener);
    }

}