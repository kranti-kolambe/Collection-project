package com.mit.collectionassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,List<String>> stateDist=new HashMap<String,List<String>>();
	    List<String> mh=new ArrayList<String>();
		Map<String,List<String>> mhm=new HashMap<String,List<String>>();
	    mh.add("Pune");
	    mh.add("Jalgaon");
	    Map<String,List<String>> rjm=new HashMap<String,List<String>>();
	    List<String> rj=new ArrayList<String>();
	    rj.add("Jaipur");
	    rj.add("udaypur");
	    Map<String,List<String>> mpm=new HashMap<String,List<String>>();
	    List<String> mp=new ArrayList<String>();
	    mp.add("Surat");
	    mp.add("Burhanpur");
	    Map<String,List<String>> flm=new HashMap<String,List<String>>();
	    List<String> fl=new ArrayList<String>();
	    fl.add("florida1");
	    Map<String,List<String>> calm=new HashMap<String,List<String>>();
	    List<String> cal=new ArrayList<String>();
	    cal.add("California1");
	    cal.add("California2");
	    cal.add("California3");
	    mhm.put("MH", mh);
	    rjm.put("RJ", rj);
	    mpm.put("MP", mp);
	    flm.put("Florida", fl);
	    calm.put("California", cal);
		    //Map<String,List<String>> cntrState=new HashMap<String,List<String>>();
		    List<Map<String,List<String>>> ind=new ArrayList<Map<String,List<String>>>();
		    ind.add(mhm);
		    ind.add(rjm);
		    ind.add(mpm);
		    List<Map<String,List<String>>> usa=new ArrayList<Map<String,List<String>>>();
		    usa.add(flm);
		    usa.add(calm);
	    Map<String,List<Map<String,List<String>>>> cntst=new HashMap<String,List<Map<String,List<String>>>>();
	    
		cntst.put("India",ind);
		cntst.put("USA",usa);
		for(Map.Entry<String,List<Map<String,List<String>>>> entry:cntst.entrySet())
	    {
	    	System.out.println("Country: "+entry.getKey()+" State are : "+entry.getValue());
	    }
		//cnst.put("")
		/*ind.addAll(mh);
		    ind.addAll(rj);
		    ind.addAll(mp);
		    List<String> usa=new ArrayList<String>();
		    usa.add("Florida");
		    usa.add("California");
		    cntrState.put("India", ind);
		    cntrState.put("USA", usa);
		    for(Map.Entry<String, List<String>> entry:cntrState.entrySet())
		    {
		    	System.out.println("Country: "+entry.getKey()+" State are : "+entry.getValue());
		    }*/
		    
	}

}
