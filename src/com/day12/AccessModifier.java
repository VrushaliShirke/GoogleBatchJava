package com.day12;

public class AccessModifier {

		private int x=10;
		
		int num=300;
		
		protected int z=56;
		
		public int s=89;
		
		public static void main(String[] args) {
			AccessModifier a= new AccessModifier();
			System.out.println(a.x); //private
			
			System.out.println(a.num); //default
			System.out.println(a.z); //protected
			System.out.println(a.s); //public
		}
		
}
