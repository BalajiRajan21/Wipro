package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		Playable p;
		Veena v=new Veena();
		v.play();
		Saxophone s=new Saxophone();
		s.play();
		p=v;
		v.play();
		p=s;
		p.play();
	}

}
