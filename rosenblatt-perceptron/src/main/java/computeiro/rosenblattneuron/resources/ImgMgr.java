package computeiro.rosenblattneuron.resources;

import javax.swing.ImageIcon;

public class ImgMgr {
    public static ImageIcon get(String imgFilename){
    	return new ImageIcon(ImgMgr.class.getResource(imgFilename));
    }
}
