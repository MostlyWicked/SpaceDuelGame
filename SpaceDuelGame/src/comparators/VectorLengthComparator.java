package comparators;

import exceptions.DifferentSizeVectorsComparisonException;
import exceptions.DifferentSizeVectorsException;
import gameclasses.GameVector;

import java.util.Comparator;

public class VectorLengthComparator implements Comparator<GameVector>{

	@Override
	public int compare(GameVector vec1, GameVector vec2) {
		if(vec1.getSize() != vec2.getSize()){
			throw new DifferentSizeVectorsComparisonException();
		}
		return (int)Math.ceil(vec1.getLength() - vec2.getLength());
	}


}
