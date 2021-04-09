package com.wolken.wolkenapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.wolken.wolkenapp.dto.*;

public class CollectionUtil {

	public static void main(String[] args) {
		List<Object> collection = new ArrayList<Object>(); // upcasting
	//	List<BookDTO> collection = new ArrayList<BookDTO>(); //Specific data can be added
		
		String nana = "Nani";
		collection.add(new BookDTO(01, "Digital", "penguin", "1st", "DanBrown", 185, "Crime"));
		collection.add(nana);
		collection.add(new WardDTO(01, "malleshwaram", "Ashwath", 20000.0));
		
	//	List<Object> collection1 = new ArrayList<Object>();
	//  collection1.addAll(collection);
		
		collection.remove(1);

		/*
		 * for (Object object : collection) { System.out.println(object); //override
		 * toString method }
		 */

		Iterator<Object> itr = collection.iterator(); // LHS Iterator is interface RHS iterator() is function
		while (itr.hasNext()) {             //use if if we want only 1 object
			Object object = itr.next();
			System.out.println(object);
		}
	}
}
