package hust.soict.dsai.aims.test.disk;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}

	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

	public static void swapDVD(DigitalVideoDisc o1, DigitalVideoDisc o2) {
		String tmpTitle = o2.getTitle();
		String tmpCategory = o2.getCategory();
		String tmpDirector = o2.getDirector();
		float tmpCost = o2.getCost();
		int tmpLength = o2.getLength();

		o2.setTitle(o1.getTitle());
		o2.setCategory(o1.getCategory());
		o2.setDirector(o1.getDirector());
		o2.setCost(o1.getCost());
		o2.setLength(o1.getLength());

		o1.setTitle(tmpTitle);
		o1.setCategory(tmpCategory);
		o1.setDirector(tmpDirector);
		o1.setCost(tmpCost);
		o1.setLength(tmpLength);
	}
}
