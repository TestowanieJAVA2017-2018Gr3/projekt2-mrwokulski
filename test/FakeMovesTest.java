
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.core.Is;

public class FakeMovesTest {
	
	IMoveService service;
	Move move;

    @BeforeEach
    public void setUp(){
        service = new FakeMovesCollection();
        move = new Move(1, 5, 0, 1 , 'x');
    }
    //i+1, posx, posy, round, color
    @Test
    public void testGetAllIsEmpty() { 
    	
    	assertThatThrownBy(() -> { service.getAll();}).isInstanceOf(IllegalArgumentException.class);
    }
	
	

}
