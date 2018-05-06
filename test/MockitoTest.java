import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;

import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;


@SuppressWarnings("deprecation")
@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {
	
	
	int player;
	int pos_x;
	int pos_y;
	int round;
	char color;
	
	@Mock
	MoveCollection moves;
	
	@InjectMocks
	MongoDB mock;
	
	

	@Test
	public void mockingWorksAsExpected (){
		player=1;
		pos_x=1;
		pos_y=1;
		round=1;
		color='o';
		
		Move move = new Move(player, pos_x, pos_y, round, color);
		
		doReturn(move).when(moves).getOne(round);
		assertThat(mock.getOne(1)).isEqualTo(move);
	}
}
