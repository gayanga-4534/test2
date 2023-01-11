package model;
//java-socket-chat-app git version
import javax.swing.ImageIcon;

public interface Friend {

    public void set(ImageIcon image, int ID, String name, String time);

    public ImageIcon getImage();

    public String getfName();
}
