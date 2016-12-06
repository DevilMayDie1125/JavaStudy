package com.hanbit.animal;

import org.apache.commons.lang3.StringUtils;

public class Dog {
	
	// final 선언하면서 초기화 또는 생성하면서 초기화 가능 그외 변경 불가
	
	public static final String DEFAULT_NAME = "멍멍이";
	
	private String NAME;
	private final String KIND; // 같은 패키지 안에서는 public 처럼 사용 가능하나
	private String COLOR;
	
	public Dog(String kind, String color){
		/*this.NAME = DEFAULT_NAME;
		this.KIND = kind;
		this.COLOR = color;*/
		
		this(DEFAULT_NAME, kind, color);
		
	}
	
	public Dog(String Name, String Kind, String Color){
		this.NAME = Name;
		this.KIND = Kind;
		this.COLOR = Color;
	}
	
	@Override
	public String toString() {
		
		return NAME +" : "+KIND+" : "+COLOR;
	}
	
	public String getNAME(){
		
		return NAME;
	}
	
	public void setNAME(String name){
		if(StringUtils.isBlank(name)){
		   name = "멍멍이";
		}
		this.NAME = name;
	}
	
	public String getKIND() {
		return KIND;
	}

	public String getCOLOR() {
		return COLOR;
	}
	
	public void setCOLOR(String color){
		if(StringUtils.isBlank(color)){
			   return;
			}
		this.COLOR = color;
	}

}
