package PropertyChangeListenerExample;

public class Main {
    public static void main(String[] args) {
        FaceBean faceBean = new FaceBean();

        WidthChangeListner widthChangeListener = new WidthChangeListner();
        faceBean.addPropertyChangeListener(widthChangeListener);

        faceBean.setWidth(10);
        faceBean.setWidth(20);
        faceBean.setWidth(30);

    }
}
