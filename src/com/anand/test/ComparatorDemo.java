package com.anand.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Country> list = new ArrayList<Country>();
		list.add(new Country(1,"India"));
		list.add(new Country(4,"America"));
		list.add(new Country(2,"Africa"));
		list.add(new Country(2,"Russia"));
		list.add(new Country(7,"Japan"));
		System.out.println("Before Sorting !!!!");
		
		for(Country p1:list){
			System.out.println("The countryid is :"+p1.getCountryId()+" the country name is :"+p1.getCountryName() );
		}
		System.out.println("After Sorting !!!!");
		Collections.sort(list, new Comparator<Country>(){

			@Override
			public int compare(Country o1, Country o2) {
				
				return o1.getCountryName().compareTo(o2.getCountryName());
			}
			
		});

		for(Country p2:list){
			System.out.println("The countryid is :"+p2.getCountryId()+" the country name is :"+p2.getCountryName() );
		}
	}

}
