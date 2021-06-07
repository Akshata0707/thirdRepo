//package collections;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.TreeSet;
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Cities ct1 = new Cities();
//		ct1.setCityName("Gulbarga");
//		ct1.setPopulation(5000);
//		
//		
//
//		Cities ct2 = new Cities();
//		ct2.setCityName("Bider");
//		ct2.setPopulation(2000);
//
//		Cities ct3 = new Cities();
//		ct3.setCityName("Banglore");
//		ct3.setPopulation(3000);
//
//		States st1 = new States();
//		st1.setStateName("karnataka");
//		st1.setCities(ct1);
//				
//		States st2 = new States();
//		st2.setStateName("karnataka");
//		st2.setCities(ct2);
//
//		States st3 = new States();
//		st3.setStateName("karnataka");
//		st3.setCities(ct3);
//
//		ArrayList<States> state = new ArrayList<States>();
//
//		state.add(st1);
//		state.add(st2);
//		state.add(st3);
//
//		// display cities of the particular state
//
//		for (States i : state) {
//			System.out.println(i);
//		}
//
//		TreeSet<States> tree =new TreeSet<States>();
//		tree.addAll(state);
//		
//		for (States t : tree) {
//			System.out.println(t);
//		}
//		
//
//	
//
//		
////		Comparator<States> StateComparator=new Comparator<States>() {
////
////			@Override
////			public int compare(States o1, States o2) {
////				int pop1=o1.getCities().getPopulation();
////				int pop2=o2.getCities().getPopulation();
////				return pop1-pop2;
////			}
////			
////		};
////		
////		Collections.sort(state,States.StateComparator);
////		
////		for (States i : state) {
////			System.out.println(i);
////		}
//		
////		// display cities based on population
////
//////		for (int  i: state) {
//////
//////			for (int j : state) {
////		for(int i=0;i<3;i++) {
////			for(int j=1+1;j<3-i-1;j++) {
//////				CitiesS x = state.get(i).getCities();
//////				Cities y = state.get(j).getCities();
////				
////				States x=state.get(i);
////				States y=state.get(j);
////				if (state.get(i).getCities().getPopulation() > state.get(j).getCities().getPopulation()) {
////
//////					Cities temp = x;
//////					x = y;
//////					y = temp;
////					
////					States temp=x;
////					x=y;
////					y=temp;
////
////				}
////			}
////
////			//System.out.println(state.get(i).getCities());
////		}
////		System.out.println(state);
////
////		
////		state.sort(new );
////		
//		
//	}
//}
