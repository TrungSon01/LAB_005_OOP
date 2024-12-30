package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        
			DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
			DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc ("Cinderella");
			swap(jungleDVD, cinderellaDVD);
			System.out.println("jungle dvd title: " + jungleDVD.getTitle());
			System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
			swap2(jungleDVD, cinderellaDVD);
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
			public static void changeTitle (DigitalVideoDisc dvd, String title) {
			String oldTitle = dvd.getTitle();
			dvd.setTitle(title);
			dvd = new DigitalVideoDisc (oldTitle);
	}
			// viết lại hàm swap
			public static void swap2( DigitalVideoDisc o1, DigitalVideoDisc o2) {
				String tmp = o1.getTitle();
				o1.setTitle(o2.getTitle());
				o2.setTitle(tmp);
				}
}
