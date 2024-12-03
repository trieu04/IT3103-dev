package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
	private static int nb = 0;
	protected int id;
	protected String title;
	protected String category;
	protected float cost;

	public Media() {
		super();
		id = nb++;
	}
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public void play() {
		System.out.println("Playing Media: " + this.getTitle());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Media media = (Media) obj;

		return title != null && title.equals(media.title);
	}

	@Override
	public String toString() {
		return "Media: " + getTitle() + ", Category: " + getCategory() + ", Cost: " + getCost();
	}
}
