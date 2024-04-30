package hust.soict.globalict.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDisc.setNumber_disc(nbDigitalVideoDisc.getNumber_disc()+1);
		this.id = nbDigitalVideoDisc.getNumber_disc();
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDisc.setNumber_disc(nbDigitalVideoDisc.getNumber_disc()+1);
		this.id = nbDigitalVideoDisc.getNumber_disc();
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDigitalVideoDisc.setNumber_disc(nbDigitalVideoDisc.getNumber_disc()+1);
		this.id = nbDigitalVideoDisc.getNumber_disc();
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDisc.setNumber_disc(nbDigitalVideoDisc.getNumber_disc()+1);
		this.id = nbDigitalVideoDisc.getNumber_disc(); 
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
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public class nbDigitalVideoDisc{
		private static int number_disc = 0;

		public static int getNumber_disc() {
			return number_disc;
		}

		public static void setNumber_disc(int number_disc) {
			nbDigitalVideoDisc.number_disc = number_disc;
		}
		
	}
	
	public boolean find(String can, String[] arr) {
        for (String i : arr) {
            if (i.equals(can))
                return true;
        }
        return false;
    }
	
	public boolean search(String title) {
        String[] com = title.split(" ");
        String[] comOfTitle = this.title.split(" ");
        for (int i = 0; i < comOfTitle.length; i++) {
            String temp = comOfTitle[i].replaceAll(" ", "");
            comOfTitle[i] = temp;
        }

        for (String i : com) {
            if (i.length() == 0)
                continue;
            if (!find(i, comOfTitle))
                return false;
        }
        return true;
    }
}

