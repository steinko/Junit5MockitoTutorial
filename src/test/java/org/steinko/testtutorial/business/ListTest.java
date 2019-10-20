package org.steinko.testtutorial.business;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.never;
import org.mockito.ArgumentCaptor;
	
import java.util.List;
import org.junit.jupiter.api.Test;;

public class ListTest {
	List<String> mock = mock(List.class);
	
	@Test
	public void test() { 
		when(mock.size()).thenReturn(5);
		assertEquals(5,mock.size());
	}
	
	@Test
	public void shouldReturnDifferntValue() { 
		when(mock.size()).thenReturn(5).thenReturn(10);
		assertEquals(5,mock.size());
		assertEquals(10,mock.size());
	}
	
	@Test
	public void shouldReturnParameters() { 
		when(mock.get(0)).thenReturn("in28minutes");
		assertEquals("in28minutes",mock.get(0));
		assertEquals(null,mock.get(1));
	}
	
	@Test
	public void shouldReturnGenericParameters() { 
		when(mock.get(anyInt())).thenReturn("in28minutes");
		assertEquals("in28minutes",mock.get(0));
		assertEquals("in28minutes",mock.get(1));
	}
	
	@Test
	public void shouldVerify() {
		
		String value = mock.get(0);
		verify(mock).get(0);
		verify(mock).get(anyInt());
		verify(mock, times(1)).get(anyInt());
	}
	
	@Test
	public void shouldVerifyTwoTimes() { 
		String value1 = mock.get(0);
		String value2 = mock.get(1);
		
		verify(mock).get(0);
		verify(mock,times(2)).get(anyInt());
		verify(mock,atLeast(1)).get(anyInt());
		verify(mock,atLeastOnce()).get(anyInt());
		verify(mock,atMost(2)).get(anyInt());
		verify(mock,never()).get(2);
	}
	
	@Test
	public void sholdCaptureArgumnet() { 
		mock.add("SomeString");
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mock).add(captor.capture());
		assertEquals("SomeString", captor.getValue());
	}
	
	@Test
	public void sholdCaptureMultipleArgumnet() { 
		mock.add("SomeString1");
		mock.add("SomeString2");
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mock,times(2)).add(captor.capture());
		List<String> allValues = captor.getAllValues();
		assertEquals("SomeString1", allValues.get(0));
		assertEquals("SomeString2", allValues.get(1));
	}
	

}
