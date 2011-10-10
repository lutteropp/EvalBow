package evalBow.model;
/**
 * A result.
 * @author sarah
 *
 */

public class Result {
	private int distance;
	private int rings;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + distance;
		result = prime * result + rings;
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
		Result other = (Result) obj;
		if (distance != other.distance)
			return false;
		if (rings != other.rings)
			return false;
		return true;
	}
	public Result(int distance, int rings) {
		super();
		this.distance = distance;
		this.rings = rings;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getRings() {
		return rings;
	}
	public void setRings(int rings) {
		this.rings = rings;
	}
}
