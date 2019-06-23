package com.collection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MimicSetTest {
	
	
	
	@Test
	void testAddObject() {
		Integer i = 10;
		MimicSetService service = new MimicSetService();
		service.add(i);		
		assertEquals(10, service.arrayList.get(0));
		
	}
	
	@Test
	void testAddObjectDuplicate() {
		Integer i = 10;
		Integer j = 10;
		Integer k = 11;
		MimicSetService service = new MimicSetService();
		service.add(i);
		service.add(j);
		service.add(k);
		assertEquals(11, service.arrayList.get(1));
		
	}
	
	
	@Test
	void testAddNullObject() 
	{
		Object i=null;
		MimicSetService service = new MimicSetService();
		assertEquals(-1, service.add(i));
	}
	
	@Test
	void testshowAll() 
	{
		MimicSetService service = new MimicSetService();
			Integer i = 10;
			String j = "Ram";
			float f = 1.0f;
		service.add(i);
		service.add(j);
		service.add(f);
		assertEquals(3, service.arrayList.size());			
			
		
	}
	
	@Test
	void testRemoveObject() 
	{
		MimicSetService service = new MimicSetService();
		Integer i = 10;
		String j = "Ram";
		Integer k = 11;
		service.add(i);
		service.add(j);
		service.add(k);
		service.remove(i);
		assertEquals(2, service.getArrayList().size());
		
	}

}
