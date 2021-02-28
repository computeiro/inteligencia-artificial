package computeiro.neuronioportalogica.resources;

import javax.swing.ImageIcon;


public final class ImgMgr{
	
	private ImgMgr(){
	}
	
	public static ImageIcon get(String imgFilename){
		return new ImageIcon(ImgMgr.class.getResource(imgFilename));
	}
}
