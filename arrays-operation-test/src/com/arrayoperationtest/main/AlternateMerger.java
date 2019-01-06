package com.arrayoperationtest.main;

import java.util.logging.Logger;

public class AlternateMerger {

	private static final Logger LOGGER = Logger.getLogger("AlternateMerger");
	
	private int[] fa;
	private int[] sa;
	
	
	public AlternateMerger(int[] fa, int[] sa) {
		this.fa=fa;
		this.sa=sa;
	}
	
	public AlternateMerger() {
		
	}
	
	public int[] getFa() {
		return fa;
	}

	public void setFa(int[] fa) {
		this.fa = fa;
	}

	public int[] getSa() {
		return sa;
	}

	public void setSa(int[] sa) {
		this.sa = sa;
	}

	public int[] mergeTwoArrayAlternate(){
		if(fa == null && sa != null) {
			return sa;
		}
		else if(fa !=null && sa==null) {
			return fa;
		}
		else if (fa!=null && sa!=null) {
			int tL = fa.length+sa.length;
			int[] mergeResult = new int[tL];
			return mergeTheArraysAlternatively(fa,sa,mergeResult);
		}
		else
		{
			return null;
		}
	}
	
	
	
	private int[] mergeTheArraysAlternatively(int[] fa, int[] sa, int[] mergeResult) {
		int j=0,k=0;
		
		for(int i=0;i<mergeResult.length;i++) {
			if(i%2==0) {
				if(j<fa.length) {
					mergeResult[i]=fa[j];
					j++;
				}
				else {
					mergeResult[i]=sa[k];
					k++;
				}
			}
			
			else {
				if(k<sa.length) {
					mergeResult[i]=sa[k];
					k++;
				}
				else {
					mergeResult[i]=fa[j];
					j++;
				}
			}
		}

	return mergeResult;
	}

	public int[] display() {
		int[] result = mergeTwoArrayAlternate();
		if(result!=null) {
		for(int r: result) {
			System.out.println(r);
		}
		}
		return result;
	}
}
