package PracticeOfColection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program4 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("aaa");
		c1.add("abc");
		c1.add("aaaaaa");
		c1.add(10);
		c1.add(20.2);
		c1.add("a");
		System.out.println(c1);
		Iterator itr=c1.iterator();
		String ls="";
		String ss="";
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof String) {
				String temp=(String)o;
				ss=temp;
				if(temp.length()>ls.length())
					ls=temp;
				if(temp.length()<ss.length())
					ss=temp;	
			}
			
		}
		System.out.println(ls);
		System.out.println(ss);
		
	}

}
