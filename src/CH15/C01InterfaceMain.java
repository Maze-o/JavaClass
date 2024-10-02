package CH15;

import java.util.Scanner;

public class C01InterfaceMain {

	public static void TurnOn(Remocon controller) {
		controller.On();
	}

	public static void TurnOff(Remocon controller) {
		controller.Off();
	}

	public static void Sound(Remocon controller, int vol) {

		controller.setVol(vol);
	}

	public static void SearchWeb(Browser browser, String url) {
		browser.SearchURL(url);
	}

	public static void main(String[] args) {

		Tv tv = new Tv();
		Radio radio = new Radio();
		SmartTv smarttv = new SmartTv();
	

		TurnOn(tv);
		TurnOff(tv);
		TurnOn(smarttv);
		

		Scanner sc = new Scanner(System.in);
		System.out.println("볼륨을 입력하세요");
		int vdol = sc.nextInt();

		Sound(tv, vdol);
		SearchWeb(smarttv, "https://www.naver.com");

		sc.close();
	}
}

interface Remocon {
	int MAXVOL = 100;
	int MINVOL = 0;

	void On();

	void Off();

	void setVol(int vol);
}

interface Browser {
	void SearchURL(String url);

}

class Tv implements Remocon {
	int vol;

	@Override
	public void On() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void Off() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVol(int vol) {
		if (MAXVOL <= vol) {
			this.vol = MAXVOL;

		} else if (MINVOL >= vol) {
			this.vol = MINVOL;
		}

		System.out.println("TV볼륨 : " + this.vol);
	}
}

class SmartTv extends Tv implements Browser {

	@Override
	public void SearchURL(String url) {
		System.out.println(url + "로 이동합니다");
	}

}

class Radio implements Remocon {
	int vol;

	@Override
	public void On() {
		System.out.println("라디오를 켭니다");
	}

	@Override
	public void Off() {
		System.out.println("라디오를 끕니다");
	}

	@Override
	public void setVol(int vol) {
		if (MAXVOL <= vol) {
			this.vol = MAXVOL;

		} else if (MINVOL >= vol) {
			this.vol = MINVOL;
		}
		System.out.println("라디오 볼륨 : " + this.vol);
	}
}
