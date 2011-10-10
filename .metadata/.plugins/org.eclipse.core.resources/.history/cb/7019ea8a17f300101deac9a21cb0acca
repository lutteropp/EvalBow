package evalBow.model;

import java.util.ArrayList;
import java.util.List;

/**
 * An archer.
 * @author sarah
 *
 */

public class Archer {

	private String name;
	private String club;
	private int id;
	private Category category;
	private List<StartNumber> startNumbers;
	private List<Result> results;
	
	public Archer(String name, String club, int id, Category category) {
		super();
		this.name = name;
		this.club = club;
		this.id = id;
		this.category = category;
		this.startNumbers = new ArrayList<StartNumber>();
	}
	
	public Archer() {
		this.results = new ArrayList<Result>();
		this.startNumbers = new ArrayList<StartNumber>();
	}
	
	public int getOverallResult() {
		return -1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public StartNumber getStartNumber(int pos) {
		return startNumbers.get(pos);
	}
	
	public StartNumber getStartNumberByDay(int day) {
		for (StartNumber startNumber: this.startNumbers) {
			if (startNumber.getDay() == day) {
				return startNumber;
			}
		}
		return null;
	}

	public void addStartNumber(StartNumber startNumber) {
		this.startNumbers.add(startNumber);
	}

	public int getId() {
		return id;
	}

	public List<Result> getResults() {
		return results;
	}
	
	public void addResult(Result result) {
		this.results.add(result);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((club == null) ? 0 : club.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Archer other = (Archer) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (club == null) {
			if (other.club != null)
				return false;
		} else if (!club.equals(other.club))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
