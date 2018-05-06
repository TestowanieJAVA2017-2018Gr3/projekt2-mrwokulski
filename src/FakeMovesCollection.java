import java.util.ArrayList;
import java.util.List;

public class FakeMovesCollection implements IMoveService {
	
	
	List<Move> moves;
	
	public FakeMovesCollection() {
		moves = new ArrayList<Move>();
	}
	@Override
	public List<Move> getAll() {
		
		if(moves.size() == 0) 
			throw new IllegalArgumentException();
		else
			return moves;
	}

	@Override
	public Move getOne(int round) {
		for(Move m : moves) {
			if(m._round == round)
				return m;
		}
		return null;
	}

	@Override
	public void insert(Move move) {
		if(move._pos_x < 0) 
			throw new IllegalArgumentException("Wrong posx.");
		else if(move._pos_y < 0) 
			throw new IllegalArgumentException("Wrong posy.");
		else 
			moves.add(move);
		
	}

	@Override
	public void delete() {
		moves = null;
	}

	@Override
	public Move getFirst() {
		return moves.get(0);
	}

	@Override
	public Move getLast() {
		int index = moves.size();
		return moves.get(index-1);
	}

}
